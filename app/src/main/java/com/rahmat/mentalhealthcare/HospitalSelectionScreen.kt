package com.rahmat.mentalhealthcare

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.firebase.firestore.FirebaseFirestore

// Model penampung data rumah sakit
data class Hospital(
    val kode_rs: String = "",
    val nama_rs: String = ""
)

@Composable
fun HospitalSelectionScreen(navController: NavController) {
    val db = FirebaseFirestore.getInstance()
    val hospitalList = remember { mutableStateOf<List<Hospital>>(emptyList()) }
    val isLoading = remember { mutableStateOf(true) }

    // Mengambil data dari master_rumahsakit
    LaunchedEffect(Unit) {
        db.collection("master_rumahsakit").get()
            .addOnSuccessListener { result ->
                hospitalList.value = result.map { doc ->
                    Hospital(
                        kode_rs = doc.getString("kode_rs") ?: "",
                        nama_rs = doc.getString("nama_rs") ?: ""
                    )
                }
                isLoading.value = false
            }
            .addOnFailureListener {
                isLoading.value = false
            }
    }

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
            text = "Pilih Instansi Rumah Sakit",
            fontSize = 20.sp,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(40.dp))

        if (isLoading.value) {
            CircularProgressIndicator(color = Color(0xFFC7F0FD))
        } else {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(24.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                items(hospitalList.value) { hospital ->
                    // Gradient Card (Biru muda ke putih)
                    val gradientBrush = Brush.verticalGradient(
                        colors = listOf(Color(0xFFC7F0FD), Color.White)
                    )

                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp)
                            .clickable {
                                // BAWA KODE_RS KE HALAMAN ROLE BIAR LOGIKA MULTI-TENANT JALAN
                                navController.navigate("role_selection/${hospital.kode_rs}")
                            },
                        shape = RoundedCornerShape(8.dp),
                        border = BorderStroke(1.dp, Color.Black),
                        elevation = CardDefaults.cardElevation(0.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(gradientBrush),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = hospital.nama_rs,
                                fontSize = 15.sp,
                                color = Color.Black
                            )
                        }
                    }
                }
            }
        }
    }
}