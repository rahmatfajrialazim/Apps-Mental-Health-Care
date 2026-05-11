package com.rahmat.mentalhealthcare

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "splash") {
        composable("splash") { SplashScreen(navController) }
        composable("hospital_selection") { HospitalSelectionScreen(navController) }

        composable("role_selection/{kode_rs}") { backStackEntry ->
            val kodeRs = backStackEntry.arguments?.getString("kode_rs") ?: ""
            RoleSelectionScreen(navController, kodeRs)
        }

        composable("login_petugas/{kode_rs}") { backStackEntry ->
            val kodeRs = backStackEntry.arguments?.getString("kode_rs") ?: ""
            LoginPetugasScreen(navController, kodeRs)
        }

        composable("login_dokter/{kode_rs}") { backStackEntry ->
            val kodeRs = backStackEntry.arguments?.getString("kode_rs") ?: ""
            LoginDokterScreen(navController, kodeRs)
        }

        composable("login_pasien/{kode_rs}") { backStackEntry ->
            val kodeRs = backStackEntry.arguments?.getString("kode_rs") ?: ""
            LoginPasienScreen(navController, kodeRs)
        }

        composable("register_pasien/{kode_rs}") { backStackEntry ->
            val kodeRs = backStackEntry.arguments?.getString("kode_rs") ?: ""
            // RegisterPasienScreen(navController, kodeRs)
        }

        composable("dashboard_petugas") { DashboardPetugasScreen(navController) }

        composable("detail_pasien_petugas/{riwayatId}") { backStackEntry ->
            val riwayatId = backStackEntry.arguments?.getString("riwayatId") ?: ""
            DetailPasienPetugasScreen(navController, riwayatId)
        }

        // 👉 TAMBAHAN BARU UNTUK DOKTER
        composable("dashboard_dokter") { DashboardDokterScreen(navController) }

        composable("detail_pasien_dokter/{riwayatId}") { backStackEntry ->
            val riwayatId = backStackEntry.arguments?.getString("riwayatId") ?: ""
            DetailPasienDokterScreen(navController, riwayatId)
        }

        // Taruh di AppNavigation lu bareng rute yang lain
        composable("dashboard_pasien") {
            // Nanti kita isi kodingannya pas lu udah siap ngerjain Dashboard Pasien
        }
    }
}