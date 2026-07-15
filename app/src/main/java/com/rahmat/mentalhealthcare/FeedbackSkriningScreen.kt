package com.rahmat.mentalhealthcare

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import kotlinx.coroutines.tasks.await

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FeedbackSkriningScreen(navController: NavController) {
    val auth = FirebaseAuth.getInstance()
    val db = FirebaseFirestore.getInstance()

    // State untuk nampung data dari Firebase
    var isLoading by remember { mutableStateOf(true) }
    var kondisiPasien by remember { mutableStateOf("Memuat...") }
    var catatanRS by remember { mutableStateOf("") }
    var catatanDokter by remember { mutableStateOf("") }

    // Narik data skrining terakhir pasien dari Firebase
    // Narik data skrining terakhir pasien dari Firebase
    LaunchedEffect(Unit) {
        try {
            val email = auth.currentUser?.email ?: ""
            val nikUser = email.substringBefore("@")

            if (nikUser.isNotEmpty()) {
                // Tarik semua data skrining pasien ini
                val result = db.collection("riwayat_screening")
                    .whereEqualTo("id_pasien", nikUser)
                    .get()
                    .await()

                if (!result.isEmpty) {
                    // =========================================================
                    // PERBAIKAN: Urutkan manual karena gak ada field "timestamp"
                    // Format DB: tanggal "15/07/2026", jam "02:29"
                    // =========================================================
                    val formatTanggal = java.text.SimpleDateFormat("dd/MM/yyyy HH:mm", java.util.Locale.getDefault())

                    val sortedDocs = result.documents.sortedByDescending { rDoc ->
                        try {
                            val tgl = rDoc.getString("tanggal_screening") ?: ""
                            val jam = rDoc.getString("jam_screening")?.replace(".", ":") ?: ""
                            formatTanggal.parse("$tgl $jam")
                        } catch (e: Exception) {
                            null
                        }
                    }

                    // Ambil dokumen urutan pertama (yang paling baru disubmit)
                    val document = sortedDocs.first()

                    val validasiDokter = document.getString("hasil_validasi_dokter") ?: ""
                    kondisiPasien = if (validasiDokter.isEmpty()) "Menunggu Validasi dari RS" else validasiDokter

                    val catRS = document.getString("catatan_rs") ?: ""
                    catatanRS = if (catRS.isEmpty()) "Belum ada catatan." else catRS

                    val catDok = document.getString("catatan_dokter") ?: ""
                    catatanDokter = if (catDok.isEmpty()) "Belum ada catatan." else catDok
                } else {
                    kondisiPasien = "Belum ada riwayat"
                }
            } else {
                kondisiPasien = "Sesi Berakhir"
            }
        } catch (e: Exception) {
            kondisiPasien = "Gagal memuat data"
        } finally {
            isLoading = false
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("") },
                navigationIcon = {
                    IconButton(onClick = {
                        // Pas di-back, langsung balikin ke Dashboard Pasien, jangan ke form lagi
                        navController.navigate("dashboard_pasien") {
                            popUpTo("dashboard_pasien") { inclusive = true }
                        }
                    }) {
                        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back", tint = Color.Black)
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.White)
            )
        },
        containerColor = Color.White
    ) { innerPadding ->
        if (isLoading) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                CircularProgressIndicator(color = Color.Black)
            }
        } else {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .padding(horizontal = 24.dp)
            ) {
                // Gradient Background Biru ke Putih (Sesuai Figma)
                val gradientBrush = Brush.verticalGradient(
                    colors = listOf(Color(0xFFC7F0FD), Color.White)
                )

                // KOTAK 1: KONDISI SAAT INI
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(130.dp)
                        .background(brush = gradientBrush, shape = RoundedCornerShape(8.dp))
                        .border(1.dp, Color.Black, RoundedCornerShape(8.dp))
                        .padding(16.dp)
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Kondisi anda saat ini :",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.height(16.dp))

                        // Logika warna teks jika hasil sudah tervalidasi
                        val warnaKondisi = when {
                            kondisiPasien.contains("Tinggi", true) -> Color(0xFFEF4444)
                            kondisiPasien.contains("ringan", true) || kondisiPasien.contains("sedang", true) -> Color(0xFFB4D429)
                            kondisiPasien.contains("normal", true) -> Color(0xFF10B981)
                            else -> Color.Black
                        }

                        Text(
                            text = kondisiPasien,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Normal,
                            color = warnaKondisi
                        )
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                // KOTAK 2: CATATAN RS JIWA
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .background(brush = gradientBrush, shape = RoundedCornerShape(8.dp))
                        .border(1.dp, Color.Black, RoundedCornerShape(8.dp))
                        .padding(16.dp)
                ) {
                    Column {
                        Text("Catatan RS Jiwa :", fontWeight = FontWeight.Normal, fontSize = 12.sp, color = Color.Black)
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = catatanRS, fontSize = 12.sp, color = Color.Black)
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                // KOTAK 3: CATATAN DOKTER
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .background(brush = gradientBrush, shape = RoundedCornerShape(8.dp))
                        .border(1.dp, Color.Black, RoundedCornerShape(8.dp))
                        .padding(16.dp)
                ) {
                    Column {
                        Text("Catatan Dokter :", fontWeight = FontWeight.Normal, fontSize = 12.sp, color = Color.Black)
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = catatanDokter, fontSize = 12.sp, color = Color.Black)
                    }
                }
            }
        }
    }
}