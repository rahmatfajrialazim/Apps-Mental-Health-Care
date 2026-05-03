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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    val auth = FirebaseAuth.getInstance()

    LaunchedEffect(key1 = true) {
        delay(2500)

        // LOGIKA CEK SESI: Kalau udah login, langsung ke Dashboard. Kalau belum, ke Pilih Role.
        if (auth.currentUser != null) {
            navController.navigate("dashboard_petugas") {
                popUpTo("splash") { inclusive = true }
            }
        } else {
            navController.navigate("role_selection") {
                popUpTo("splash") { inclusive = true }
            }
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_rsi),
                contentDescription = "Logo RSIJ",
                modifier = Modifier.size(130.dp)
            )
            Spacer(modifier = Modifier.height(28.dp))
            Text(
                text = "Mental Health Care",
                fontSize = 28.sp,
                fontWeight = FontWeight.Normal,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Supported By Rumah Sakit Islam Jakarta Sukapura Kelapa Gading",
                fontSize = 11.sp,
                color = Color.Black,
                textAlign = TextAlign.Center,
                maxLines = 1
            )
        }
    }
}