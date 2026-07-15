package com.rahmat.mentalhealthcare

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun RoleSelectionScreen(navController: NavController, kodeRs: String) {
    // UI Sesuai Figma 100%
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(60.dp))

        Text(
            text = "Siapa Anda??...",
            fontSize = 20.sp,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(40.dp))

        // 1. Role Card Pasien
        RoleCard(
            title = "Pasien",
            iconResId = R.drawable.ic_pasien,
            onClick = {
                // Berpindah ke halaman login pasien dengan membawa kode_rs
                navController.navigate("login_pasien/$kodeRs")
            }
        )

        Spacer(modifier = Modifier.height(24.dp))

        // 2. Role Card Dokter
        RoleCard(
            title = "Dokter",
            iconResId = R.drawable.ic_dokter,
            onClick = {
                // Berpindah ke halaman login dokter dengan membawa kode_rs
                navController.navigate("login_dokter/$kodeRs")
            }
        )

        Spacer(modifier = Modifier.height(24.dp))

        // 3. Role Card Petugas Medis
        RoleCard(
            title = "Petugas Medis",
            iconResId = R.drawable.ic_petugas,
            onClick = {
                // Berpindah ke halaman login petugas dengan membawa kode_rs
                navController.navigate("login_petugas/$kodeRs")
            }
        )
    }
}

// Fungsi Bantuan (Komponen) biar kodingan rapi dan UI konsisten persis Figma
@Composable
fun RoleCard(
    title: String,
    iconResId: Int,
    onClick: () -> Unit
) {
    // Gradient Card (Biru muda ke putih)
    val gradientBrush = Brush.verticalGradient(
        colors = listOf(Color(0xFFC7F0FD), Color.White)
    )

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(140.dp)
            .clickable { onClick() },
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(1.dp, Color.Black), // Border hitam tipis sesuai figma
        elevation = CardDefaults.cardElevation(0.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(gradientBrush),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = iconResId),
                contentDescription = title,
                modifier = Modifier.size(64.dp) // Ukuran icon
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = title,
                fontSize = 16.sp,
                color = Color.Black
            )
        }
    }
}