package com.rahmat.mentalhealthcare

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailPasienPetugasScreen(navController: NavController, riwayatId: String) {
    val context = LocalContext.current
    val db = FirebaseFirestore.getInstance()
    val scrollState = rememberScrollState()

    var isLoading by remember { mutableStateOf(true) }
    var isSaving by remember { mutableStateOf(false) }

    // State Data Gabungan
    var namaPasien by remember { mutableStateOf("-") }
    var kondisiTampil by remember { mutableStateOf("-") }
    var statusValidasi by remember { mutableStateOf("-") }
    var catatanRs by remember { mutableStateOf("") }

    // State Profil (Dari koleksi data_pasien)
    var pNik by remember { mutableStateOf("-") }
    var pJk by remember { mutableStateOf("-") }
    var pTglLahir by remember { mutableStateOf("-") }
    var pUsia by remember { mutableStateOf("-") }
    var pNoHp by remember { mutableStateOf("-") }
    var pAlamat by remember { mutableStateOf("-") }

    var pjNama by remember { mutableStateOf("-") }
    var pjJk by remember { mutableStateOf("-") }
    var pjUsia by remember { mutableStateOf("-") }
    var pjNoHp by remember { mutableStateOf("-") }
    var pjAlamat by remember { mutableStateOf("-") }

    LaunchedEffect(riwayatId) {
        db.collection("riwayat_screening").document(riwayatId).get()
            .addOnSuccessListener { rDoc ->
                if (rDoc.exists()) {
                    namaPasien = rDoc.getString("nama_pasien") ?: "-"

                    // 👉 LOGIKA PENENTUAN KONDISI (PRIORITAS DOKTER)
                    val hasilAi = rDoc.getString("hasil_ai") ?: "Belum ada hasil"
                    val validasiDokter = rDoc.getString("hasil_validasi_dokter")

                    kondisiTampil = if (!validasiDokter.isNullOrEmpty()) validasiDokter else hasilAi
                    statusValidasi = if (validasiDokter.isNullOrEmpty()) "(Belum Validasi Dokter)" else "(Sudah Validasi Dokter)"

                    catatanRs = rDoc.getString("catatan_rs") ?: ""
                    val idPasien = rDoc.getString("id_pasien") ?: ""

                    if (idPasien.isNotEmpty()) {
                        db.collection("data_pasien").document(idPasien).get()
                            .addOnSuccessListener { pDoc ->
                                if (pDoc.exists()) {
                                    pNik = pDoc.getString("nik") ?: "-"
                                    pJk = pDoc.getString("jenis_kelamin") ?: "-"
                                    pTglLahir = pDoc.getString("tanggal_lahir") ?: "-"
                                    pUsia = pDoc.getString("usia")?.toString() ?: "-"
                                    pNoHp = pDoc.getString("no_hp") ?: "-"
                                    pAlamat = pDoc.getString("alamat") ?: "-"

                                    pjNama = pDoc.getString("pj_nama") ?: "-"
                                    pjJk = pDoc.getString("pj_jenis_kelamin") ?: "-"
                                    pjUsia = pDoc.getString("pj_usia")?.toString() ?: "-"
                                    pjNoHp = pDoc.getString("pj_no_hp") ?: "-"
                                    pjAlamat = pDoc.getString("pj_alamat") ?: "-"
                                }
                                isLoading = false
                            }
                    } else {
                        isLoading = false
                    }
                }
            }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("", fontSize = 16.sp) },
                navigationIcon = {
                    IconButton(onClick = { navController.navigateUp() }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Kembali", tint = Color.Black)
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.White)
            )
        },
        containerColor = Color.White
    ) { innerPadding ->
        if (isLoading) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                CircularProgressIndicator(color = Color(0xFF0D8ABC))
            }
        } else {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(scrollState)
                    .padding(innerPadding)
                    .padding(horizontal = 24.dp)
            ) {
                // Kartu Header Gradient
                val gradientBrush = Brush.verticalGradient(listOf(Color(0xFFC7F0FD), Color.White))
                val kondisiColor = if (kondisiTampil.contains("Tinggi", true) || kondisiTampil.contains("Berat", true)) Color(0xFFE53935) else if(kondisiTampil.contains("normal", true)) Color(0xFF4CAF50) else Color(0xFFF59E0B)

                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    border = BorderStroke(1.dp, Color.Black),
                    elevation = CardDefaults.cardElevation(0.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(gradientBrush)
                            .padding(20.dp)
                    ) {
                        Text(text = namaPasien, fontSize = 16.sp, color = Color.Black)
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = kondisiTampil, fontSize = 22.sp, fontWeight = FontWeight.Medium, color = kondisiColor)
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(text = statusValidasi, fontSize = 12.sp, color = Color.DarkGray)
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                // Identitas Pasien
                Text("Identitas Pasien", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color.Black)
                Spacer(modifier = Modifier.height(8.dp))
                DetailRow("Nomor Induk Kependudukan", pNik)
                DetailRow("Jenis Kelamin", pJk)
                DetailRow("Tanggal Lahir", pTglLahir)
                DetailRow("Usia", pUsia)

                Spacer(modifier = Modifier.height(16.dp))

                // Kontak Pasien
                Text("Kontak Pasien", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color.Black)
                Spacer(modifier = Modifier.height(8.dp))
                DetailRow("No.Telepon/WhatsApp", pNoHp)
                DetailRow("Alamat Domisili", pAlamat)

                Spacer(modifier = Modifier.height(16.dp))

                // Identitas Penanggung Jawab Pasien
                Text("Identitas Penanggung Jawab Pasien", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color.Black)
                Spacer(modifier = Modifier.height(8.dp))
                DetailRow("Nama Lengkap", pjNama)
                DetailRow("Jenis Kelamin", pjJk)
                DetailRow("Usia", pjUsia)

                Spacer(modifier = Modifier.height(16.dp))

                // Kontak Penanggung Jawab Pasien
                Text("Kontak Penanggung Jawab Pasien", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color.Black)
                Spacer(modifier = Modifier.height(8.dp))
                DetailRow("No.Telepon/WhatsApp", pjNoHp)
                DetailRow("Alamat Domisili", pjAlamat)

                Spacer(modifier = Modifier.height(24.dp))

                // Input Catatan RS
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    border = BorderStroke(1.dp, Color.Black),
                    elevation = CardDefaults.cardElevation(0.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(gradientBrush)
                            .padding(16.dp)
                    ) {
                        Text("Catatan untuk Pasien :", fontSize = 14.sp, color = Color.Black)
                        Spacer(modifier = Modifier.height(8.dp))
                        TextField(
                            value = catatanRs,
                            onValueChange = { catatanRs = it },
                            placeholder = { Text("Berikan Catatan Disini....", fontSize = 12.sp, color = Color.Gray) },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(100.dp),
                            shape = RoundedCornerShape(8.dp),
                            colors = TextFieldDefaults.colors(
                                focusedContainerColor = Color.White,
                                unfocusedContainerColor = Color.White,
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent,
                                cursorColor = Color.Black
                            )
                        )
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Tombol Simpan
                Button(
                    onClick = {
                        isSaving = true
                        db.collection("riwayat_screening").document(riwayatId)
                            .update("catatan_rs", catatanRs)
                            .addOnSuccessListener {
                                isSaving = false
                                Toast.makeText(context, "Catatan berhasil disimpan!", Toast.LENGTH_SHORT).show()
                                navController.navigateUp()
                            }
                            .addOnFailureListener {
                                isSaving = false
                                Toast.makeText(context, "Gagal menyimpan catatan", Toast.LENGTH_SHORT).show()
                            }
                    },
                    modifier = Modifier.fillMaxWidth().height(50.dp),
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
                    enabled = !isSaving
                ) {
                    Text(if (isSaving) "Menyimpan..." else "Simpan", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 16.sp)
                }

                Spacer(modifier = Modifier.height(32.dp))
            }
        }
    }
}

@Composable
fun DetailRow(label: String, value: String) {
    Row(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
        Text(text = label, fontSize = 12.sp, modifier = Modifier.weight(1.2f), color = Color.Black)
        Text(text = ":", fontSize = 12.sp, modifier = Modifier.padding(horizontal = 4.dp), color = Color.Black)
        Text(text = value, fontSize = 12.sp, fontWeight = FontWeight.Medium, modifier = Modifier.weight(1f), color = Color.Black)
    }
}