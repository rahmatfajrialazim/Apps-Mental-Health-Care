package com.rahmat.mentalhealthcare

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

data class KategoriHirarkiUI(val id: String, val nama: String)
data class GejalaHirarkiUI(val idGejala: String, val idKategori: String, val namaGejala: String, val isChecked: Boolean)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailPasienDokterScreen(navController: NavController, riwayatId: String) {
    val context = LocalContext.current
    val db = FirebaseFirestore.getInstance()
    val scrollState = rememberScrollState()

    val isLoading = remember { mutableStateOf(true) }
    val namaPasien = remember { mutableStateOf("-") }
    val hasilAi = remember { mutableStateOf("") }
    val hasilValidasi = remember { mutableStateOf("") }
    val catatanDokter = remember { mutableStateOf("") }
    val idPasien = remember { mutableStateOf("") }

    val listKategoriHirarkiUI = remember { mutableStateOf<List<KategoriHirarkiUI>>(emptyList()) }
    val listGejalaHirarkiUI = remember { mutableStateOf<List<GejalaHirarkiUI>>(emptyList()) }

    val showDialog = remember { mutableStateOf(false) }
    val selectedKondisi = remember { mutableStateOf("") }

    LaunchedEffect(riwayatId) {
        try {
            val rDoc = db.collection("riwayat_screening").document(riwayatId).get().await()
            if (rDoc.exists()) {
                namaPasien.value = rDoc.getString("nama_pasien") ?: "-"
                hasilAi.value = rDoc.getString("hasil_ai") ?: ""
                hasilValidasi.value = rDoc.getString("hasil_validasi_dokter") ?: ""
                catatanDokter.value = rDoc.getString("catatan_dokter") ?: ""
                idPasien.value = rDoc.getString("id_pasien") ?: "" // Simpan NIK untuk dibawa ke halaman progres

                val gejalaDipilih = rDoc.get("gejala_dipilih") as? List<String> ?: emptyList()

                val katDocs = db.collection("kategori_gejala").get().await()
                val tempKategori = katDocs.documents.map { doc ->
                    KategoriHirarkiUI(id = doc.id, nama = doc.getString("nama_induk") ?: "Kategori ${doc.id}")
                }.sortedBy { it.id }

                val masterDocs = db.collection("master_gejala").get().await()
                val tempGejala = masterDocs.documents.map { doc ->
                    GejalaHirarkiUI(
                        idGejala = doc.id,
                        idKategori = doc.getString("parent") ?: "",
                        namaGejala = doc.getString("nama_gejala") ?: "Gejala ${doc.id}",
                        isChecked = gejalaDipilih.contains(doc.id) || gejalaDipilih.contains(doc.getString("nama_gejala"))
                    )
                }.sortedBy { it.idGejala }

                listKategoriHirarkiUI.value = tempKategori
                listGejalaHirarkiUI.value = tempGejala
            }
        } catch (e: Exception) {
            Toast.makeText(context, "Gagal memuat data gejala", Toast.LENGTH_SHORT).show()
        } finally {
            isLoading.value = false
        }
    }

    Scaffold(containerColor = Color.White) { padding ->
        if (isLoading.value) {
            Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) { CircularProgressIndicator() }
        } else {
            Column(
                modifier = Modifier.fillMaxSize().padding(padding).verticalScroll(scrollState).padding(horizontal = 24.dp)
            ) {
                Spacer(modifier = Modifier.height(32.dp))

                val gradient = Brush.verticalGradient(listOf(Color(0xFFC7F0FD), Color.White))
                Card(
                    modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(12.dp),
                    border = BorderStroke(1.dp, Color.Black), elevation = CardDefaults.cardElevation(0.dp)
                ) {
                    Column(Modifier.fillMaxWidth().background(gradient).padding(20.dp)) {
                        Text(namaPasien.value, fontSize = 16.sp, color = Color.Black, fontWeight = FontWeight.Bold)
                        Spacer(Modifier.height(4.dp))
                        Text("Berdasarkan hasil sistem Pasien mengalami Kondisi Kesehatan Mental :", fontSize = 11.sp, color = Color.DarkGray)
                        Spacer(Modifier.height(12.dp))

                        val kondisiAktif = if (hasilValidasi.value.isNotEmpty()) hasilValidasi.value else hasilAi.value
                        val kondisiColor = when {
                            kondisiAktif.contains("Tinggi", true) -> Color(0xFFEF4444)
                            kondisiAktif.contains("ringan", true) || kondisiAktif.contains("sedang", true) -> Color(0xFFB4D429)
                            kondisiAktif.contains("normal", true) -> Color(0xFF10B981)
                            else -> Color.Black
                        }

                        Text(kondisiAktif, fontSize = 22.sp, fontWeight = FontWeight.Bold, color = kondisiColor)
                        
                        val statusValidasiStr = if (hasilValidasi.value.isNotEmpty()) "(Sudah Divalidasi)" else "(Belum Divalidasi)"
                        Text(statusValidasiStr, fontSize = 12.sp, color = Color.Gray, modifier = Modifier.padding(top = 2.dp))

                        Spacer(Modifier.height(16.dp))
                        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterEnd) {
                            Button(
                                onClick = { selectedKondisi.value = kondisiAktif; showDialog.value = true },
                                shape = RoundedCornerShape(6.dp), colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
                                contentPadding = PaddingValues(horizontal = 24.dp, vertical = 0.dp), modifier = Modifier.height(28.dp)
                            ) { Text("Validasi Kondisi", color = Color.White, fontSize = 11.sp, fontWeight = FontWeight.Medium) }
                        }
                    }
                }

                Spacer(Modifier.height(24.dp))
                Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                    Text("Gejala yang di alami :", modifier = Modifier.weight(1f), fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color.Black)
                    Text("Ya", modifier = Modifier.width(50.dp), textAlign = TextAlign.Center, fontSize = 14.sp, fontWeight = FontWeight.Bold)
                    Text("Tidak", modifier = Modifier.width(50.dp), textAlign = TextAlign.Center, fontSize = 14.sp, fontWeight = FontWeight.Bold)
                }
                Spacer(Modifier.height(8.dp))

                listKategoriHirarkiUI.value.forEach { kategori ->
                    Text(kategori.nama, fontSize = 16.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 16.dp, bottom = 8.dp))
                    listGejalaHirarkiUI.value.filter { it.idKategori == kategori.id }.forEach { gejala ->
                        Row(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp), verticalAlignment = Alignment.CenterVertically) {
                            Text(gejala.namaGejala, modifier = Modifier.weight(1f).padding(start = 12.dp), fontSize = 14.sp, color = Color.DarkGray)
                            Box(modifier = Modifier.width(50.dp), contentAlignment = Alignment.Center) { Checkbox(checked = gejala.isChecked, onCheckedChange = null, colors = CheckboxDefaults.colors(checkedColor = Color.Black, uncheckedColor = Color.LightGray)) }
                            Box(modifier = Modifier.width(50.dp), contentAlignment = Alignment.Center) { Checkbox(checked = !gejala.isChecked, onCheckedChange = null, colors = CheckboxDefaults.colors(checkedColor = Color.Black, uncheckedColor = Color.LightGray)) }
                        }
                    }
                }

                Spacer(Modifier.height(24.dp))
                Card(
                    modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(12.dp),
                    border = BorderStroke(1.dp, Color.Black), elevation = CardDefaults.cardElevation(0.dp)
                ) {
                    Column(Modifier.fillMaxWidth().background(gradient).padding(16.dp)) {
                        Text("Catatan untuk Pasien :", fontSize = 14.sp, fontWeight = FontWeight.Medium)
                        Spacer(Modifier.height(8.dp))
                        TextField(
                            value = catatanDokter.value, onValueChange = { catatanDokter.value = it },
                            placeholder = { Text("Berikan Catatan Disini....", fontSize = 12.sp) },
                            modifier = Modifier.fillMaxWidth().height(100.dp),
                            colors = TextFieldDefaults.colors(focusedContainerColor = Color.White, unfocusedContainerColor = Color.White, focusedIndicatorColor = Color.Transparent, unfocusedIndicatorColor = Color.Transparent),
                            shape = RoundedCornerShape(8.dp)
                        )
                    }
                }

                Spacer(Modifier.height(16.dp))
                Button(
                    onClick = {
                        db.collection("riwayat_screening").document(riwayatId)
                            .update("catatan_dokter", catatanDokter.value)
                            .addOnSuccessListener {
                                Toast.makeText(context, "Catatan dokter berhasil disimpan!", Toast.LENGTH_SHORT).show()
                                navController.navigateUp()
                            }
                    },
                    modifier = Modifier.fillMaxWidth().height(50.dp), shape = RoundedCornerShape(8.dp), colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                ) { Text("Simpan", color = Color.White, fontWeight = FontWeight.Bold) }

                Spacer(modifier = Modifier.height(8.dp))

                // 👉 INI SATU-SATUNYA TAMBAHAN: Tombol buat lompat ke halaman DSS AI
                OutlinedButton(
                    onClick = {
                        if (idPasien.value.isNotEmpty()) {
                            // Pindah ke halaman baru dengan membawa NIK pasien
                            navController.navigate("progres_pasien_screen/${idPasien.value}")
                        } else {
                            Toast.makeText(context, "ID Pasien belum dimuat", Toast.LENGTH_SHORT).show()
                        }
                    },
                    modifier = Modifier.fillMaxWidth().height(50.dp),
                    shape = RoundedCornerShape(8.dp),
                    border = BorderStroke(1.dp, Color.Black)
                ) {
                    Text("Lihat Analisis Progres Pasien", color = Color.Black, fontWeight = FontWeight.Bold)
                }

                Spacer(Modifier.height(40.dp))
            }

            if (showDialog.value) {
                AlertDialog(
                    onDismissRequest = { showDialog.value = false }, containerColor = Color.White,
                    title = { Text("Ubah Kondisi Kesehatan Mental Pasien :", fontSize = 14.sp, fontWeight = FontWeight.Bold) },
                    text = {
                        Column {
                            val options = listOf("Kondisi mental normal" to Color(0xFF10B981), "Risiko ringan hingga sedang" to Color(0xFFB4D429), "Distres Psikologis Tinggi" to Color(0xFFEF4444))
                            options.forEach { (text, color) ->
                                Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().clickable { selectedKondisi.value = text }) {
                                    RadioButton(selected = selectedKondisi.value == text, onClick = { selectedKondisi.value = text }, colors = RadioButtonDefaults.colors(selectedColor = Color.Black))
                                    Text(text, fontSize = 14.sp, color = color, fontWeight = FontWeight.Medium)
                                }
                            }
                        }
                    },
                    confirmButton = {
                        Button(
                            onClick = {
                                db.collection("riwayat_screening").document(riwayatId)
                                    .update("hasil_validasi_dokter", selectedKondisi.value).addOnSuccessListener {
                                        hasilValidasi.value = selectedKondisi.value
                                        showDialog.value = false
                                        Toast.makeText(context, "Kondisi divalidasi!", Toast.LENGTH_SHORT).show()
                                    }
                            }, colors = ButtonDefaults.buttonColors(containerColor = Color.Black), shape = RoundedCornerShape(8.dp)
                        ) { Text("Simpan", color = Color.White, fontWeight = FontWeight.Bold) }
                    }
                )
            }
        }
    }
}