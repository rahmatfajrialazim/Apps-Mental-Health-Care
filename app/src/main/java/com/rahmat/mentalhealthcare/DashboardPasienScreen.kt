package com.rahmat.mentalhealthcare

import android.app.Activity
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.pullrefresh.PullRefreshIndicator
import androidx.compose.material.pullrefresh.pullRefresh
import androidx.compose.material.pullrefresh.rememberPullRefreshState
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

// Data Class buat nampung list riwayat pasien
data class RiwayatScreeningPasien(
    val idRiwayat: String,
    val tanggal: String,
    val kondisiTampil: String,
    val isMenungguValidasi: Boolean
)

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterialApi::class)
@Composable
fun DashboardPasienScreen(navController: NavController) {
    val context = LocalContext.current
    val auth = FirebaseAuth.getInstance()
    val db = FirebaseFirestore.getInstance()

    // Mencegah pasien mencet tombol back HP terus balik ke halaman login
    BackHandler { (context as? Activity)?.finish() }

    // State Variables
    val namaPasien = remember { mutableStateOf("Memuat...") }
    val listRiwayat = remember { mutableStateOf<List<RiwayatScreeningPasien>>(emptyList()) }
    val expandedMenu = remember { mutableStateOf(false) }
    val isRefreshing = remember { mutableStateOf(false) }

    // Gradient Background Biru ke Putih (Sesuai Figma)
    val gradientBrush = Brush.verticalGradient(
        colors = listOf(Color(0xFFC7F0FD), Color.White)
    )

    // Fungsi buat narik data dari database
    fun fetchData() {
        isRefreshing.value = true
        // Ambil email dari Auth, contoh: 1234567890@rs01.com
        val email = auth.currentUser?.email ?: ""
        // Potong string sebelum lambang '@' buat dapetin NIK murninya
        val nikUser = email.substringBefore("@")

        if (nikUser.isNotEmpty()) {
            // 1. Ambil Nama Pasien dari koleksi data_pasien
            db.collection("data_pasien").document(nikUser).get()
                .addOnSuccessListener { doc ->
                    if (doc.exists()) {
                        // Nama depan aja atau nama lengkap, kita ambil nama_lengkap
                        namaPasien.value = doc.getString("nama_lengkap") ?: "Pasien"
                    }
                }

            // 2. Ambil Riwayat Screening pasien ini dari koleksi riwayat_screening
            // Diurutkan dari yang terbaru ke terlama (descending)
            db.collection("riwayat_screening")
                .whereEqualTo("id_pasien", nikUser)
                .get()
                .addOnSuccessListener { snaps ->
                    val fetchedList = snaps.documents.map { rDoc ->
                        val validasiDokter = rDoc.getString("hasil_validasi_dokter") ?: ""
                        val tgl = rDoc.getString("tanggal_screening") ?: "-"

                        // Logika Status: Kalau belum divalidasi dokter, tampilkan "Menunggu Validasi Dokter"
                        val isMenunggu = validasiDokter.isEmpty()
                        val kondisiFinal = if (isMenunggu) "Menunggu Validasi Dokter" else validasiDokter

                        RiwayatScreeningPasien(
                            idRiwayat = rDoc.id,
                            tanggal = tgl,
                            kondisiTampil = kondisiFinal,
                            isMenungguValidasi = isMenunggu
                        )
                    }
                    // Sort manual berdasarkan ID/Tanggal biar yang baru di atas
                    listRiwayat.value = fetchedList.sortedByDescending { it.tanggal }
                    isRefreshing.value = false
                }.addOnFailureListener {
                    isRefreshing.value = false
                }
        } else {
            isRefreshing.value = false
        }
    }

    // Jalankan fungsi fetchData saat halaman pertama kali dibuka
    LaunchedEffect(Unit) { fetchData() }

    val pullRefreshState = rememberPullRefreshState(isRefreshing.value, { fetchData() })

    Scaffold(containerColor = Color.White) { padding ->
        Box(modifier = Modifier.fillMaxSize().padding(padding).pullRefresh(pullRefreshState)) {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(horizontal = 24.dp)
            ) {
                item {
                    Spacer(modifier = Modifier.height(24.dp))

                    // ================= HEADER & HAMBURGER =================
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Halo, ${namaPasien.value}",
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color.Black,
                            modifier = Modifier.weight(1f).padding(end = 16.dp)
                        )

                        Box {
                            IconButton(onClick = { expandedMenu.value = true }) {
                                Icon(Icons.Default.Menu, contentDescription = "Menu", tint = Color.Black, modifier = Modifier.size(28.dp))
                            }

                            // Dropdown Menu Ramping (Sama kayak Petugas/Dokter)
                            MaterialTheme(shapes = MaterialTheme.shapes.copy(extraSmall = RoundedCornerShape(0.dp))) {
                                DropdownMenu(
                                    expanded = expandedMenu.value,
                                    onDismissRequest = { expandedMenu.value = false },
                                    modifier = Modifier.background(Color.White).border(1.dp, Color.Black).width(200.dp)
                                ) {
                                    DropdownMenuItem(
                                        text = { Text("Profil", color = Color.Black, fontSize = 14.sp) },
                                        onClick = { expandedMenu.value = false },
                                        modifier = Modifier.height(40.dp)
                                    )
                                    HorizontalDivider(color = Color.Black, thickness = 1.dp)
                                    DropdownMenuItem(
                                        text = { Text("Log Out", color = Color.Black, fontSize = 14.sp) },
                                        onClick = {
                                            expandedMenu.value = false
                                            auth.signOut()
                                            navController.navigate("hospital_selection") { popUpTo(0) { inclusive = true } }
                                        },
                                        modifier = Modifier.height(40.dp)
                                    )
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    // ================= CARD BANNER MULAI =================
                    Card(
                        modifier = Modifier.fillMaxWidth().height(160.dp),
                        shape = RoundedCornerShape(12.dp),
                        border = BorderStroke(1.dp, Color.Black),
                        elevation = CardDefaults.cardElevation(0.dp)
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize().background(gradientBrush),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = "Ayo, Cek Kesehatan Mentalmu!",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Medium,
                                color = Color.Black
                            )
                            Spacer(modifier = Modifier.height(16.dp))
                            Button(
                                onClick = {
                                    navController.navigate("form_screening")
                                },
                                colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
                                shape = RoundedCornerShape(8.dp),
                                modifier = Modifier.height(40.dp).width(120.dp)
                            ) {
                                Text("Mulai", color = Color.White, fontWeight = FontWeight.Bold)
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(32.dp))

                    // ================= TAB RIWAYAT =================
                    Column(modifier = Modifier.fillMaxWidth()) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.History,
                                contentDescription = "Riwayat",
                                tint = Color.Black,
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text("Riwayat", fontSize = 14.sp, fontWeight = FontWeight.Medium, color = Color.Black)
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        // Garis Bawah Header Riwayat
                        Box(modifier = Modifier.fillMaxWidth()) {
                            HorizontalDivider(color = Color.LightGray, thickness = 1.dp, modifier = Modifier.align(Alignment.BottomCenter))
                            HorizontalDivider(color = Color.Black, thickness = 2.dp, modifier = Modifier.width(80.dp).align(Alignment.BottomStart))
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))
                }

                // ================= LIST ITEM RIWAYAT =================
                items(listRiwayat.value) { riwayat ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp),
                        shape = RoundedCornerShape(8.dp),
                        border = BorderStroke(1.dp, Color.Black),
                        elevation = CardDefaults.cardElevation(0.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(gradientBrush)
                                .padding(16.dp)
                        ) {
                            Text(text = riwayat.tanggal, fontSize = 10.sp, color = Color.DarkGray)
                            Spacer(modifier = Modifier.height(8.dp))

                            // Logika Pewarnaan Teks
                            val textColor = when {
                                riwayat.isMenungguValidasi -> Color.Black
                                riwayat.kondisiTampil.contains("Tinggi", true) -> Color(0xFFEF4444) // Merah
                                riwayat.kondisiTampil.contains("ringan", true) || riwayat.kondisiTampil.contains("sedang", true) -> Color(0xFFB4D429) // Kuning Hijau
                                riwayat.kondisiTampil.contains("normal", true) -> Color(0xFF10B981) // Hijau
                                else -> Color.Black
                            }

                            Text(
                                text = riwayat.kondisiTampil,
                                fontSize = 16.sp,
                                fontWeight = if(riwayat.isMenungguValidasi) FontWeight.Normal else FontWeight.Medium,
                                color = textColor
                            )

                            Spacer(modifier = Modifier.height(8.dp))

                            Text(
                                text = "Lihat Selengkapnya",
                                fontSize = 10.sp,
                                color = Color.Gray,
                                textDecoration = TextDecoration.Underline,
                                modifier = Modifier.clickable {
                                    // TODO: Arahkan ke Detail Riwayat Pasien
                                    // navController.navigate("detail_riwayat_pasien/${riwayat.idRiwayat}")
                                }
                            )
                        }
                    }
                }

                item { Spacer(modifier = Modifier.height(40.dp)) }
            }

            // Loading Spinner di atas
            PullRefreshIndicator(isRefreshing.value, pullRefreshState, Modifier.align(Alignment.TopCenter), backgroundColor = Color.White, contentColor = Color.Black)
        }
    }
}