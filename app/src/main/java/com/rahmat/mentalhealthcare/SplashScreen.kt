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
            // LOGIKA AUTO LOGIN
            val email = user.email ?: ""
            val idLogin = email.substringBefore("@")

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
                            // Nanti buat dokter & pasien ditambah di sini
                            else -> {
                                auth.signOut()
                                navController.navigate("hospital_selection") {
                                    popUpTo("splash") { inclusive = true }
                                }
                            }
                        }
                    } else {
                        auth.signOut()
                        navController.navigate("hospital_selection") {
                            popUpTo("splash") { inclusive = true }
                        }
                    }
                }
                .addOnFailureListener {
                    // Kalau gagal konek ke Firebase, amanin lempar ke depan
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
            modifier = Modifier.size(160.dp) // Ukuran besar disamakan dengan proporsi Figma
        )

        Spacer(modifier = Modifier.height(48.dp)) // Jarak agak jauh dari logo ke teks

        // Judul
        Text(
            text = "Mental Health Care",
            fontSize = 28.sp, // Font besar
            fontWeight = FontWeight.Normal, // Sesuai gambar, font tidak terlalu bold
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(12.dp))

        // Subjudul
        Text(
            text = "Sistem Pendukung Keputusan untuk Kesehatan Mental Anda",
            fontSize = 13.sp, // Font kecil
            fontWeight = FontWeight.Normal,
            color = Color.Black
        )
    }
}