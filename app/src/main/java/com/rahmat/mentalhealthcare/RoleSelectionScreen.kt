package com.rahmat.mentalhealthcare

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun RoleSelectionScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(rememberScrollState()) // Fitur biar bisa scroll pas layar miring
            .padding(horizontal = 32.dp, vertical = 48.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "Siapa Anda??...",
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Black,
            modifier = Modifier.padding(bottom = 32.dp)
        )

        // Ikon gua balikin ke R.drawable.logo_rsi dulu biar ga error
        // Kalau lu udah export ic_pasien.png, ganti drawable.logo_rsi jadi drawable.ic_pasien
        RoleCardFigmaGradient(
            title = "Pasien",
            iconResId = R.drawable.ic_pasien,
            onClick = { navController.navigate("login_pasien") }
        )

        Spacer(modifier = Modifier.height(24.dp))

        RoleCardFigmaGradient(
            title = "Dokter",
            iconResId = R.drawable.ic_dokter,
            onClick = { navController.navigate("login_dokter") }
        )

        Spacer(modifier = Modifier.height(24.dp))

        RoleCardFigmaGradient(
            title = "Petugas Medis",
            iconResId = R.drawable.ic_petugas,
            onClick = { navController.navigate("login_petugas") }
        )

        Spacer(modifier = Modifier.height(40.dp))
    }
}

@Composable
fun RoleCardFigmaGradient(title: String, iconResId: Int, onClick: () -> Unit) {
    // Membuat gradasi MIRING (Kiri Atas -> Kanan Bawah)
    val diagonalGradient = Brush.linearGradient(
        colors = listOf(
            Color(0xFFDFF6FA), // Warna Biru Muda Figma di pojok
            Color.White // Putih bersih di bawah
        ),
        start = Offset(0f, 0f), // Dimulai dari pojok kiri atas (0,0)
        end = Offset.Infinite // Menyebar miring tanpa batas
    )

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .clickable { onClick() },
        shape = RoundedCornerShape(12.dp),
        border = BorderStroke(1.dp, Color(0xFFE5E7EB)),
        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(diagonalGradient), // Memasukkan efek gradasi miring Figma
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = iconResId),
                contentDescription = title,
                modifier = Modifier.size(60.dp)
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = title,
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                color = Color.Black
            )
        }
    }
}