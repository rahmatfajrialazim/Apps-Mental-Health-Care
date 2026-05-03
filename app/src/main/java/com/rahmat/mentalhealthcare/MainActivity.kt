package com.rahmat.mentalhealthcare

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.firebase.FirebaseApp
import com.rahmat.mentalhealthcare.ui.theme.MentalHealthCareTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inisialisasi Firebase agar bisa login dengan data database kemarin
        FirebaseApp.initializeApp(this)

        setContent {
            MentalHealthCareTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()

                    NavHost(navController = navController, startDestination = "splash") {
                        composable("splash") { SplashScreen(navController) }
                        composable("role_selection") { RoleSelectionScreen(navController) }

                        // 👉 HALAMAN LOGIN PETUGAS MEDIS (100% FIGMA + DB CONNECT)
                        composable("login_petugas") { LoginPetugasScreen(navController) }

                        // 👉 HALAMAN DASHBOARD PETUGAS MEDIS (100% FIGMA + SIDEBAR + LOGOUT)
                        composable("dashboard_petugas") {
                            DashboardPetugasScreen(navController)
                        }

                        // Rute login lainnya (sementara)
                        composable("login_pasien") { PlaceholderScreen("Login Pasien") }
                        composable("login_dokter") { PlaceholderScreen("Login Dokter") }
                    }
                }
            }
        }
    }
}

// Komponen sementara biar gak crash
@Composable
fun PlaceholderScreen(title: String) {
    androidx.compose.foundation.layout.Box(modifier = Modifier.fillMaxSize(), contentAlignment = androidx.compose.ui.Alignment.Center) {
        androidx.compose.material3.Text(text = title)
    }
}