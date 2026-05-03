package com.rahmat.mentalhealthcare

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckBox
import androidx.compose.material.icons.filled.CheckBoxOutlineBlank
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions // 👉 IMPORT BARU: Senjata rahasia biar update data ke DB gak gagal
import kotlinx.coroutines.tasks.await

data class MasterKategori(val kodeInduk: String, val namaInduk: String)
data class MasterGejala(val kodeGejala: String, val namaGejala: String, val parent: String)

data class KategoriUI(val namaKategori: String, val listGejala: List<GejalaUI>)
data class GejalaUI(val namaGejala: String, val isYa: Boolean)

@Composable
fun DetailPasienPetugasScreen(navController: NavController, pasienId: String) {
    val context = LocalContext.current
    val db = FirebaseFirestore.getInstance()
    val scrollState = rememberScrollState()

    var namaPasien by remember { mutableStateOf("Memuat...") }
    var kondisiFinal by remember { mutableStateOf("-") }
    var statusValidasi by remember { mutableStateOf("Memuat...") }
    var catatanRs by remember { mutableStateOf("") }

    var isLoading by remember { mutableStateOf(true) }
    var isSaving by remember { mutableStateOf(false) }
    var dataGejalaUI by remember { mutableStateOf<List<KategoriUI>>(emptyList()) }

    LaunchedEffect(pasienId) {
        try {
            val docPasien = db.collection("riwayat_screening").document(pasienId).get().await()
            if (docPasien.exists()) {
                namaPasien = docPasien.getString("nama_pasien") ?: "-"
                catatanRs = docPasien.getString("catatan_rs") ?: ""

                val hasilValidasi = docPasien.getString("hasil_validasi_dokter")
                statusValidasi = if (hasilValidasi.isNullOrEmpty()) "Belum Validasi Dokter" else "Sudah Validasi Dokter"

                val hasilAi = docPasien.getString("hasil_ai") ?: "Kondisi mental normal"
                kondisiFinal = if (hasilValidasi.isNullOrEmpty()) hasilAi else hasilValidasi

                val gejalaDipilihKode = docPasien.get("gejala_dipilih") as? List<String> ?: emptyList()

                val snapKat = db.collection("kategori_gejala").get().await()
                val listKategori = snapKat.documents.mapNotNull {
                    val kode = it.getString("kode_induk")
                    val nama = it.getString("nama_induk")
                    if (kode != null && nama != null) MasterKategori(kode, nama) else null
                }.sortedBy { it.kodeInduk }

                val snapGej = db.collection("master_gejala").get().await()
                val listGejala = snapGej.documents.mapNotNull {
                    val kode = it.getString("kode_gejala")
                    val nama = it.getString("nama_gejala")
                    val parent = it.getString("parent")
                    if (kode != null && nama != null && parent != null) MasterGejala(kode, nama, parent) else null
                }.sortedBy { it.kodeGejala }

                val hasilRakit = listKategori.map { kategori ->
                    val gejalaDiKategoriIni = listGejala.filter { it.parent == kategori.kodeInduk }.map { gejala ->
                        GejalaUI(
                            namaGejala = gejala.namaGejala,
                            isYa = gejalaDipilihKode.contains(gejala.kodeGejala)
                        )
                    }
                    KategoriUI(kategori.namaInduk, gejalaDiKategoriIni)
                }

                dataGejalaUI = hasilRakit
            }
            isLoading = false
        } catch (e: Exception) {
            Toast.makeText(context, "Gagal memuat data", Toast.LENGTH_SHORT).show()
            isLoading = false
        }
    }

    // 👉 LOGIKA SIMPAN YANG UDAH DI-UPGRADE
    fun simpanCatatan() {
        if (catatanRs.isEmpty()) {
            Toast.makeText(context, "Catatan tidak boleh kosong", Toast.LENGTH_SHORT).show()
            return
        }
        isSaving = true

        // Bikin bungkus data yang mau dikirim
        val dataUpdate = mapOf(
            "catatan_rs" to catatanRs
        )

        db.collection("riwayat_screening").document(pasienId)
            // Pake set dengan SetOptions.merge() jauh lebih sakti dari update() biasa
            .set(dataUpdate, SetOptions.merge())
            .addOnSuccessListener {
                isSaving = false
                Toast.makeText(context, "Catatan RS berhasil disimpan", Toast.LENGTH_SHORT).show()
                navController.popBackStack()
            }
            .addOnFailureListener { e ->
                isSaving = false
                // Bakal nampilin pesan error aslinya dari Firebase biar kita gak nebak-nebak
                Toast.makeText(context, "Gagal: ${e.message}", Toast.LENGTH_LONG).show()
            }
    }

    Scaffold(containerColor = Color.White) { innerPadding ->
        if (isLoading) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                CircularProgressIndicator(color = Color.Black)
            }
        } else {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .verticalScroll(scrollState)
                    .padding(horizontal = 24.dp, vertical = 24.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .background(brush = Brush.horizontalGradient(colors = listOf(Color(0xFFE0F7FA), Color(0xFFB3E5FC))))
                        .padding(20.dp)
                ) {
                    Column {
                        Text(text = namaPasien, fontSize = 14.sp, color = Color.Black, fontWeight = FontWeight.Medium)
                        Spacer(modifier = Modifier.height(8.dp))

                        val kondisiColor = when {
                            kondisiFinal.contains("normal", true) -> Color(0xFF10B981)
                            kondisiFinal.contains("tinggi", true) -> Color(0xFFEF4444)
                            else -> Color(0xFFFBBF24)
                        }
                        Text(text = kondisiFinal, fontSize = 22.sp, color = kondisiColor, fontWeight = FontWeight.Normal)

                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = "($statusValidasi)", fontSize = 10.sp, color = Color.Black)
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                    Text(text = "Gejala yang di alami :", modifier = Modifier.weight(1f), fontSize = 14.sp, fontWeight = FontWeight.Bold, color = Color.Black)
                    Text(text = "Ya", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = Color.Black, modifier = Modifier.width(40.dp), textAlign = TextAlign.Center)
                    Text(text = "Tidak", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = Color.Black, modifier = Modifier.width(40.dp), textAlign = TextAlign.Center)
                }

                Spacer(modifier = Modifier.height(16.dp))

                dataGejalaUI.forEach { kategori ->
                    if (kategori.listGejala.isNotEmpty()) {
                        Text(text = kategori.namaKategori, fontSize = 14.sp, fontWeight = FontWeight.Bold, color = Color.Black, modifier = Modifier.padding(vertical = 8.dp))

                        kategori.listGejala.forEach { gejala ->
                            Row(modifier = Modifier.fillMaxWidth().padding(vertical = 6.dp), verticalAlignment = Alignment.CenterVertically) {
                                Text(text = gejala.namaGejala, modifier = Modifier.weight(1f), fontSize = 12.sp, color = Color.Black)

                                Icon(
                                    imageVector = if (gejala.isYa) Icons.Default.CheckBox else Icons.Default.CheckBoxOutlineBlank,
                                    contentDescription = "Ya",
                                    tint = if (gejala.isYa) Color.Black else Color.LightGray,
                                    modifier = Modifier.width(40.dp).size(20.dp)
                                )

                                Icon(
                                    imageVector = if (!gejala.isYa) Icons.Default.CheckBox else Icons.Default.CheckBoxOutlineBlank,
                                    contentDescription = "Tidak",
                                    tint = if (!gejala.isYa) Color.Black else Color.LightGray,
                                    modifier = Modifier.width(40.dp).size(20.dp)
                                )
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .background(Color(0xFFB2EBF2))
                        .padding(16.dp)
                ) {
                    Column {
                        Text(text = "Catatan :", fontSize = 14.sp, color = Color.Black, fontWeight = FontWeight.Medium)
                        Spacer(modifier = Modifier.height(8.dp))

                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(120.dp)
                                .background(Color.White, RoundedCornerShape(8.dp))
                                .padding(12.dp)
                        ) {
                            BasicTextField(
                                value = catatanRs,
                                onValueChange = { catatanRs = it },
                                textStyle = androidx.compose.ui.text.TextStyle(fontSize = 12.sp, color = Color.Black),
                                modifier = Modifier.fillMaxSize(),
                                decorationBox = { innerTextField ->
                                    if (catatanRs.isEmpty()) {
                                        Text("Berikan Catatan Disini....", fontSize = 12.sp, color = Color.Gray)
                                    }
                                    innerTextField()
                                }
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                Button(
                    onClick = { simpanCatatan() },
                    modifier = Modifier.fillMaxWidth().height(48.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
                    shape = RoundedCornerShape(8.dp),
                    enabled = !isSaving
                ) {
                    Text(text = if (isSaving) "Menyimpan..." else "Simpan", color = Color.White, fontSize = 14.sp, fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}