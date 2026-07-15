package com.rahmat.mentalhealthcare

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    val auth = FirebaseAuth.getInstance()
    val db = FirebaseFirestore.getInstance()

    LaunchedEffect(key1 = true) {
        delay(2500L) // Waktu nunggu 2.5 detik biar logo kelihatan jelas

        val user = auth.currentUser
        if (user != null) {
            // LOGIKA AUTO LOGIN SEMUA ROLE KESIMPEN
            val email = user.email ?: ""
            val idLogin = email.substringBefore("@")

            // 1. Cek dulu apakah dia Dokter atau Petugas Medis (di koleksi users)
            db.collection("users").whereEqualTo("id_login", idLogin).get()
                .addOnSuccessListener { snaps ->
                    if (!snaps.isEmpty) {
                        val role = snaps.documents[0].getString("role")
                        when (role) {
                            "petugas_medis" -> {
                                navController.navigate("dashboard_petugas") {
                                    popUpTo("splash") { inclusive = true }
                                }
                            }
                            "dokter" -> {
                                navController.navigate("dashboard_dokter") {
                                    popUpTo("splash") { inclusive = true }
                                }
                            }
                            else -> {
                                auth.signOut()
                                navController.navigate("hospital_selection") {
                                    popUpTo("splash") { inclusive = true }
                                }
                            }
                        }
                    } else {
                        // 2. Kalau di users gak ketemu, cek apakah dia Pasien (di koleksi data_pasien)
                        db.collection("data_pasien").whereEqualTo("nik", idLogin).get()
                            .addOnSuccessListener { pSnaps ->
                                if (!pSnaps.isEmpty) {
                                    // Arahkan ke dashboard pasien
                                    navController.navigate("dashboard_pasien") {
                                        popUpTo("splash") { inclusive = true }
                                    }
                                } else {
                                    // Bener-bener gak terdaftar di mana pun
                                    auth.signOut()
                                    navController.navigate("hospital_selection") {
                                        popUpTo("splash") { inclusive = true }
                                    }
                                }
                            }
                            .addOnFailureListener {
                                auth.signOut()
                                navController.navigate("hospital_selection") {
                                    popUpTo("splash") { inclusive = true }
                                }
                            }
                    }
                }
                .addOnFailureListener {
                    // Kalau gagal konek ke Firebase, lempar ke depan
                    navController.navigate("hospital_selection") {
                        popUpTo("splash") { inclusive = true }
                    }
                }
        } else {
            // Kalau belum login sama sekali
            navController.navigate("hospital_selection") {
                popUpTo("splash") { inclusive = true }
            }
        }
    }

    // UI FIGMA 100%
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Logo Hati Besar
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Mental Health Care Logo",
            modifier = Modifier.size(160.dp)
        )

        Spacer(modifier = Modifier.height(48.dp))

        // Judul
        Text(
            text = "Mental Health Care",
            fontSize = 28.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(12.dp))

        // Subjudul
        Text(
            text = "Sistem Pendukung Keputusan untuk Kesehatan Mental Anda",
            fontSize = 13.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Black
        )
    }
}