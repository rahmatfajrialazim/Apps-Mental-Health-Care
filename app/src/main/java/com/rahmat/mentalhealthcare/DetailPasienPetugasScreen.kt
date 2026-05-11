package com.rahmat.mentalhealthcare

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.firebase.firestore.FirebaseFirestore

@Composable
fun DetailPasienPetugasScreen(navController: NavController, riwayatId: String) {
    val context = LocalContext.current
    val db = FirebaseFirestore.getInstance()
    val scrollState = rememberScrollState()

    val isLoading = remember { mutableStateOf(true) }
    val namaPasien = remember { mutableStateOf("-") }
    val kondisiTampil = remember { mutableStateOf("-") }
    val statusValidasi = remember { mutableStateOf("") }
    val catatanRs = remember { mutableStateOf("") }

    val pNik = remember { mutableStateOf("-") }
    val pJk = remember { mutableStateOf("-") }
    val pTglLahir = remember { mutableStateOf("-") }
    val pUsia = remember { mutableStateOf("-") }
    val pNoHp = remember { mutableStateOf("-") }
    val pAlamat = remember { mutableStateOf("-") }

    val pjNama = remember { mutableStateOf("-") }
    val pjJk = remember { mutableStateOf("-") }
    val pjUsia = remember { mutableStateOf("-") }
    val pjNoHp = remember { mutableStateOf("-") }
    val pjAlamat = remember { mutableStateOf("-") }

    LaunchedEffect(riwayatId) {
        db.collection("riwayat_screening").document(riwayatId).get().addOnSuccessListener { rDoc ->
            if (rDoc.exists()) {
                namaPasien.value = rDoc.getString("nama_pasien") ?: "-"
                val ai = rDoc.getString("hasil_ai") ?: ""
                val dr = rDoc.getString("hasil_validasi_dokter") ?: ""

                kondisiTampil.value = if (dr.isNotEmpty()) dr else ai
                statusValidasi.value = if (dr.isNotEmpty()) "(Sudah Validasi Dokter)" else "(Belum Validasi Dokter)"
                catatanRs.value = rDoc.getString("catatan_rs") ?: ""

                val idPasien = rDoc.getString("id_pasien") ?: ""
                if (idPasien.isNotEmpty()) {
                    db.collection("data_pasien").document(idPasien).get().addOnSuccessListener { pDoc ->
                        if (pDoc.exists()) {
                            pNik.value = pDoc.getString("nik") ?: "-"
                            pJk.value = pDoc.getString("jenis_kelamin") ?: "-"
                            pTglLahir.value = pDoc.getString("tanggal_lahir") ?: "-"
                            pUsia.value = pDoc.get("usia")?.toString() ?: "-"
                            pNoHp.value = pDoc.getString("no_hp") ?: "-"
                            pAlamat.value = pDoc.getString("alamat") ?: "-"

                            pjNama.value = pDoc.getString("pj_nama") ?: "-"
                            pjJk.value = pDoc.getString("pj_jenis_kelamin") ?: "-"
                            pjUsia.value = pDoc.get("pj_usia")?.toString() ?: "-"
                            pjNoHp.value = pDoc.getString("pj_no_hp") ?: "-"
                            pjAlamat.value = pDoc.getString("pj_alamat") ?: "-"
                        }
                        isLoading.value = false
                    }
                }
            }
        }
    }

    Scaffold(containerColor = Color.White) { padding ->
        if (isLoading.value) {
            Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) { CircularProgressIndicator() }
        } else {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
                    .verticalScroll(scrollState)
                    .padding(horizontal = 24.dp)
            ) {
                Spacer(modifier = Modifier.height(32.dp))

                val gradient = Brush.verticalGradient(listOf(Color(0xFFC7F0FD), Color.White))
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    border = BorderStroke(1.dp, Color.Black),
                    elevation = CardDefaults.cardElevation(0.dp)
                ) {
                    // 👉 FIX: Tambah fillMaxWidth() biar background gradient menuhin satu layar HP
                    Column(Modifier.fillMaxWidth().background(gradient).padding(20.dp)) {
                        Text(namaPasien.value, fontSize = 16.sp, color = Color.Black)
                        Spacer(Modifier.height(4.dp))
                        Text(kondisiTampil.value, fontSize = 22.sp, fontWeight = FontWeight.Medium, color = if(kondisiTampil.value.contains("Tinggi")) Color.Red else Color(0xFF0D8ABC))
                        Text(statusValidasi.value, fontSize = 12.sp, color = Color.Gray)
                    }
                }

                Spacer(Modifier.height(24.dp))
                SectionHeader("Identitas Pasien")
                DataRow("Nomor Induk Kependudukan", pNik.value)
                DataRow("Jenis Kelamin", pJk.value)
                DataRow("Tanggal Lahir", pTglLahir.value)
                DataRow("Usia", pUsia.value)

                Spacer(Modifier.height(16.dp))
                SectionHeader("Kontak Pasien")
                DataRow("No.Telepon/WhatsApp", pNoHp.value)
                DataRow("Alamat Domisili", pAlamat.value)

                Spacer(Modifier.height(16.dp))
                SectionHeader("Identitas Penanggung Jawab Pasien")
                DataRow("Nama Lengkap", pjNama.value)
                DataRow("Jenis Kelamin", pjJk.value)
                DataRow("Usia", pjUsia.value)

                Spacer(Modifier.height(16.dp))
                SectionHeader("Kontak Penanggung Jawab Pasien")
                DataRow("No.Telepon/WhatsApp", pjNoHp.value)
                DataRow("Alamat Domisili", pjAlamat.value)

                Spacer(Modifier.height(24.dp))

                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    border = BorderStroke(1.dp, Color.Black),
                    elevation = CardDefaults.cardElevation(0.dp)
                ) {
                    // 👉 FIX: Disini juga ditambahin fillMaxWidth()
                    Column(Modifier.fillMaxWidth().background(gradient).padding(16.dp)) {
                        Text("Catatan untuk Pasien :", fontSize = 14.sp, fontWeight = FontWeight.Medium)
                        Spacer(Modifier.height(8.dp))
                        TextField(
                            value = catatanRs.value,
                            onValueChange = { catatanRs.value = it },
                            placeholder = { Text("Berikan Catatan Disini....", fontSize = 12.sp) },
                            modifier = Modifier.fillMaxWidth().height(100.dp),
                            colors = TextFieldDefaults.colors(
                                focusedContainerColor = Color.White,
                                unfocusedContainerColor = Color.White,
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent
                            ),
                            shape = RoundedCornerShape(8.dp)
                        )
                    }
                }

                Spacer(Modifier.height(16.dp))
                Button(
                    onClick = {
                        db.collection("riwayat_screening").document(riwayatId)
                            .update("catatan_rs", catatanRs.value)
                            .addOnSuccessListener {
                                Toast.makeText(context, "Berhasil simpan catatan!", Toast.LENGTH_SHORT).show()
                                navController.navigateUp()
                            }
                    },
                    modifier = Modifier.fillMaxWidth().height(50.dp),
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                ) {
                    Text("Simpan", color = Color.White, fontWeight = FontWeight.Bold)
                }
                Spacer(Modifier.height(40.dp))
            }
        }
    }
}

@Composable
private fun SectionHeader(title: String) {
    Text(title, fontSize = 15.sp, fontWeight = FontWeight.Bold, color = Color.Black, modifier = Modifier.padding(vertical = 4.dp))
}

@Composable
private fun DataRow(label: String, value: String) {
    Row(Modifier.fillMaxWidth().padding(vertical = 2.dp)) {
        Text(label, Modifier.weight(1.2f), fontSize = 12.sp, color = Color.Black)
        Text(":", Modifier.padding(horizontal = 4.dp), fontSize = 12.sp)
        Text(value, Modifier.weight(1f), fontSize = 12.sp, color = Color.Black, fontWeight = FontWeight.Medium)
    }
}