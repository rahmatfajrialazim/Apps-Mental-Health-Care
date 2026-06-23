package com.rahmat.mentalhealthcare

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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.firebase.firestore.FirebaseFirestore

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailRiwayatPasienScreen(navController: NavController, riwayatId: String) {
    val db = FirebaseFirestore.getInstance()
    val scrollState = rememberScrollState()

    val isLoading = remember { mutableStateOf(true) }
    val kondisiTampil = remember { mutableStateOf("") }
    val catatanRs = remember { mutableStateOf("") }
    val catatanDokter = remember { mutableStateOf("") }

    LaunchedEffect(riwayatId) {
        db.collection("riwayat_screening").document(riwayatId).get()
            .addOnSuccessListener { doc ->
                if (doc.exists()) {
                    val validasiDr = doc.getString("hasil_validasi_dokter") ?: ""
                    val cRs = doc.getString("catatan_rs") ?: ""
                    val cDr = doc.getString("catatan_dokter") ?: ""

                    // 👉 REVISI LOGIKA: Jika dokter belum melakukan validasi, status beralih ke teks statis sesuai figma
                    kondisiTampil.value = if (validasiDr.isEmpty()) "Menunggu Validasi dari RS" else validasiDr
                    catatanRs.value = if (cRs.isEmpty()) "Menunggu Validasi dari RS" else cRs
                    catatanDokter.value = if (cDr.isEmpty()) "Menunggu Validasi dari RS" else cDr
                }
                isLoading.value = false
            }
            .addOnFailureListener {
                isLoading.value = false
            }
    }

    val gradientBrush = Brush.verticalGradient(listOf(Color(0xFFC7F0FD), Color.White))

    Scaffold(
        topBar = {
            TopAppBar(
                title = { },
                navigationIcon = {
                    // Tombol kembali bawaan Android sesuai instruksi
                    IconButton(onClick = { navController.navigateUp() }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back", tint = Color.Black)
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.White)
            )
        },
        containerColor = Color.White
    ) { padding ->
        if (isLoading.value) {
            Box(Modifier.fillMaxSize().padding(padding), contentAlignment = Alignment.Center) { CircularProgressIndicator() }
        } else {
            Column(
                modifier = Modifier.fillMaxSize().padding(padding).verticalScroll(scrollState).padding(horizontal = 24.dp)
            ) {
                Spacer(modifier = Modifier.height(16.dp))

                // 1. KOTAK KONDISI (Figma 3)
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(8.dp),
                    border = BorderStroke(1.dp, Color.Black),
                    elevation = CardDefaults.cardElevation(0.dp)
                ) {
                    Column(Modifier.fillMaxWidth().background(gradientBrush).padding(16.dp)) {
                        Text("Kondisi anda saat ini :", fontSize = 14.sp, color = Color.Black, fontWeight = FontWeight.Medium)
                        Spacer(Modifier.height(16.dp))

                        val isWaiting = kondisiTampil.value.contains("Menunggu")
                        Text(
                            text = kondisiTampil.value,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = if (isWaiting) Color.Black else {
                                if (kondisiTampil.value.contains("Tinggi")) Color(0xFFEF4444) else Color(0xFF10B981)
                            }
                        )
                        Spacer(Modifier.height(16.dp))
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                // 2. KOTAK CATATAN RS (Figma 3)
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(8.dp),
                    border = BorderStroke(1.dp, Color.Black),
                    elevation = CardDefaults.cardElevation(0.dp)
                ) {
                    Column(Modifier.fillMaxWidth().background(gradientBrush).padding(16.dp)) {
                        Text("Catatan RS Jiwa :", fontSize = 14.sp, color = Color.Black, fontWeight = FontWeight.Medium)
                        Spacer(Modifier.height(16.dp))
                        Text(
                            text = catatanRs.value,
                            fontSize = 14.sp,
                            color = if (catatanRs.value.contains("Menunggu")) Color.Gray else Color.Black
                        )
                        Spacer(Modifier.height(16.dp))
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                // 3. KOTAK CATATAN DOKTER (Figma 3)
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(8.dp),
                    border = BorderStroke(1.dp, Color.Black),
                    elevation = CardDefaults.cardElevation(0.dp)
                ) {
                    Column(Modifier.fillMaxWidth().background(gradientBrush).padding(16.dp)) {
                        Text("Catatan Dokter :", fontSize = 14.sp, color = Color.Black, fontWeight = FontWeight.Medium)
                        Spacer(Modifier.height(16.dp))
                        Text(
                            text = catatanDokter.value,
                            fontSize = 14.sp,
                            color = if (catatanDokter.value.contains("Menunggu")) Color.Gray else Color.Black
                        )
                        Spacer(Modifier.height(16.dp))
                    }
                }

                Spacer(modifier = Modifier.height(40.dp))
            }
        }
    }
}