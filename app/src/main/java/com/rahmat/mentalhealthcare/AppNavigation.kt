package com.rahmat.mentalhealthcare

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "splash") {

        // 1. Splash Screen (Cek Sesi Login di sini)
        composable("splash") {
            SplashScreen(navController)
        }

        // 2. Pemilihan Rumah Sakit
        composable("hospital_selection") {
            HospitalSelectionScreen(navController)
        }

        // 3. Pemilihan Role (Bawa data kode_rs)
        composable("role_selection/{kode_rs}") { backStackEntry ->
            val kodeRs = backStackEntry.arguments?.getString("kode_rs") ?: ""
            RoleSelectionScreen(navController, kodeRs)
        }

        // 4. Login Khusus Petugas (Bawa data kode_rs)
        composable("login_petugas/{kode_rs}") { backStackEntry ->
            val kodeRs = backStackEntry.arguments?.getString("kode_rs") ?: ""
            LoginPetugasScreen(navController, kodeRs)
        }

        // Tambahkan ini di bawah composable("login_petugas/{kode_rs}")
        composable("login_dokter/{kode_rs}") { backStackEntry ->
            val kodeRs = backStackEntry.arguments?.getString("kode_rs") ?: ""
            LoginDokterScreen(navController, kodeRs)
        }

        composable("login_pasien/{kode_rs}") { backStackEntry ->
            val kodeRs = backStackEntry.arguments?.getString("kode_rs") ?: ""
            LoginPasienScreen(navController, kodeRs)
        }

        composable("register_pasien/{kode_rs}") { backStackEntry ->
            // Placeholder buat pendaftaran pasien nanti
            val kodeRs = backStackEntry.arguments?.getString("kode_rs") ?: ""
            // RegisterPasienScreen(navController, kodeRs)
        }

        // 5. Dashboard Petugas Medis
        composable("dashboard_petugas") {
            DashboardPetugasScreen(navController)
        }

        // 6. Detail Pasien (Bawa id riwayat)
        composable("detail_pasien_petugas/{riwayatId}") { backStackEntry ->
            val riwayatId = backStackEntry.arguments?.getString("riwayatId") ?: ""
            DetailPasienPetugasScreen(navController, riwayatId)
        }
    }
}