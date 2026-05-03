package com.rahmat.mentalhealthcare

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "splash") {
        composable("splash") {
            SplashScreen(navController = navController)
        }
        composable("role_selection") {
            RoleSelectionScreen(navController = navController)
        }
        // 👉 GUA BUATIN HALAMAN KOSONG SEMENTARA BIAR GA CRASH
        composable("login_pasien") {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text(text = "Halaman Login Pasien (Belum Dibuat)")
            }
        }
        composable("login_dokter") {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text(text = "Halaman Login Dokter (Belum Dibuat)")
            }
        }
        composable("login_petugas") {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text(text = "Halaman Login Petugas Medis (Belum Dibuat)")
            }
        }
    }
}