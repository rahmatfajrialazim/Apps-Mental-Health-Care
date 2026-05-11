package com.rahmat.mentalhealthcare

import android.app.Activity
import android.widget.Toast
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.pullrefresh.PullRefreshIndicator
import androidx.compose.material.pullrefresh.pullRefresh
import androidx.compose.material.pullrefresh.rememberPullRefreshState
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

// Model Data di luar kelas biar universal
data class RiwayatPasien(
    val id: String = "",
    val nama: String = "-",
    val kondisiTampil: String = "-",
    val waktu: String = "-",
    val validasi: String = "Belum"
)

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterialApi::class)
@Composable
fun DashboardPetugasScreen(navController: NavController) {
    val context = LocalContext.current
    val auth = FirebaseAuth.getInstance()
    val db = FirebaseFirestore.getInstance()

    // Biar gak balik ke halaman login pas dipencet tombol back HP
    BackHandler { (context as? Activity)?.finish() }

    // State menggunakan .value
    val namaPetugas = remember { mutableStateOf("Memuat...") }
    val listPasien = remember { mutableStateOf<List<RiwayatPasien>>(emptyList()) }
    val totalPasien = remember { mutableStateOf(0) }
    val pasienHariIni = remember { mutableStateOf(0) }
    val resikoTinggi = remember { mutableStateOf(0) }
    val searchQuery = remember { mutableStateOf("") }
    val expandedMenu = remember { mutableStateOf(false) }
    val isRefreshing = remember { mutableStateOf(false) }

    fun fetchData() {
        isRefreshing.value = true
        val email = auth.currentUser?.email ?: ""
        val idLogin = email.substringBefore("@")

        if (idLogin.isNotEmpty()) {
            db.collection("users").whereEqualTo("id_login", idLogin).get()
                .addOnSuccessListener { snaps ->
                    if (!snaps.isEmpty) {
                        val doc = snaps.documents[0]
                        namaPetugas.value = doc.getString("nama") ?: "Petugas Medis"
                        val kodeRs = doc.getString("kode_rs") ?: ""

                        if (kodeRs.isNotEmpty()) {
                            db.collection("riwayat_screening")
                                .whereEqualTo("kode_rs", kodeRs)
                                .get()
                                .addOnSuccessListener { riwayatSnaps ->
                                    val fetchedList = riwayatSnaps.documents.map { rDoc ->
                                        val hasilAi = rDoc.getString("hasil_ai") ?: "Belum ada hasil"
                                        val validasiDokter = rDoc.getString("hasil_validasi_dokter") ?: ""

                                        // LOGIKA: Prioritas Dokter > AI
                                        val kondisiFinal = if (validasiDokter.isNotEmpty()) validasiDokter else hasilAi
                                        val statusValidasi = if (validasiDokter.isNotEmpty()) "Sudah" else "Belum"

                                        val tgl = rDoc.getString("tanggal_screening") ?: "-"
                                        val jam = rDoc.getString("jam_screening") ?: "00.00"

                                        RiwayatPasien(
                                            id = rDoc.id,
                                            nama = rDoc.getString("nama_pasien") ?: "-",
                                            kondisiTampil = kondisiFinal,
                                            waktu = "$jam WIB - $tgl",
                                            validasi = statusValidasi
                                        )
                                    }
                                    listPasien.value = fetchedList
                                    totalPasien.value = fetchedList.size

                                    val today = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(Date())
                                    pasienHariIni.value = fetchedList.count { it.waktu.contains(today) }
                                    resikoTinggi.value = fetchedList.count {
                                        it.kondisiTampil.contains("Tinggi", ignoreCase = true) || it.kondisiTampil.contains("Berat", ignoreCase = true)
                                    }
                                    isRefreshing.value = false
                                }
                        } else { isRefreshing.value = false }
                    } else { isRefreshing.value = false }
                }.addOnFailureListener { isRefreshing.value = false }
        } else { isRefreshing.value = false }
    }

    // Load data pas halaman dibuka
    LaunchedEffect(Unit) { fetchData() }

    val pullRefreshState = rememberPullRefreshState(isRefreshing.value, { fetchData() })

    Scaffold(containerColor = Color.White) { padding ->
        Box(modifier = Modifier.fillMaxSize().padding(padding).pullRefresh(pullRefreshState)) {
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                item {
                    Spacer(modifier = Modifier.height(24.dp))

                    // HEADER: Halo, Petugas Medis + Menu
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 24.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Halo, ${namaPetugas.value}",
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color.Black
                        )
                        Box {
                            IconButton(onClick = { expandedMenu.value = true }) {
                                Icon(Icons.Default.Menu, contentDescription = "Menu", tint = Color.Black, modifier = Modifier.size(28.dp))
                            }

                            // 👉 DROPDOWN MENU KOTAK RAMPING SESUAI FIGMA
                            MaterialTheme(
                                shapes = MaterialTheme.shapes.copy(extraSmall = RoundedCornerShape(0.dp)) // Bikin sudut kotak lancip
                            ) {
                                DropdownMenu(
                                    expanded = expandedMenu.value,
                                    onDismissRequest = { expandedMenu.value = false },
                                    modifier = Modifier
                                        .background(Color.White)
                                        .border(1.dp, Color.Black) // Border hitam keliling kotak
                                        .width(160.dp) // Ukuran lebar pas
                                ) {
                                    // Item Profil
                                    DropdownMenuItem(
                                        text = { Text("Profil", color = Color.Black, fontSize = 16.sp) },
                                        onClick = {
                                            expandedMenu.value = false
                                            Toast.makeText(context, "Halaman Profil Segera Hadir", Toast.LENGTH_SHORT).show()
                                        },
                                        modifier = Modifier.height(44.dp), // Ukuran ramping
                                        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 0.dp)
                                    )

                                    // Garis pembatas hitam di tengah
                                    HorizontalDivider(color = Color.Black, thickness = 1.dp)

                                    // Item Log Out
                                    DropdownMenuItem(
                                        text = { Text("Log Out", color = Color.Black, fontSize = 16.sp) },
                                        onClick = {
                                            expandedMenu.value = false
                                            auth.signOut()
                                            navController.navigate("hospital_selection") {
                                                popUpTo(0) { inclusive = true }
                                            }
                                        },
                                        modifier = Modifier.height(44.dp), // Ukuran ramping
                                        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 0.dp)
                                    )
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    // Sub-header Data Pasien
                    Text(
                        text = "Data Pasien",
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(horizontal = 24.dp)
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    // STATISTIK
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 24.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        StatBox(totalPasien.value.toString(), "Total Pasien")
                        StatBox(pasienHariIni.value.toString(), "Terdaftar Hari Ini")
                        StatBox(resikoTinggi.value.toString(), "Pasien Resiko Tinggi")
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    // SEARCH BAR (Icon di kanan sesuai Figma)
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 24.dp)
                            .height(40.dp)
                            .background(Color(0xFFE5E7EB), RoundedCornerShape(20.dp))
                            .padding(horizontal = 16.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            BasicTextField(
                                value = searchQuery.value,
                                onValueChange = { searchQuery.value = it },
                                textStyle = TextStyle(fontSize = 12.sp, color = Color.Black),
                                modifier = Modifier.weight(1f),
                                decorationBox = { innerTextField ->
                                    if(searchQuery.value.isEmpty()) Text("Nama/Gejala Pasien", color = Color.Gray, fontSize = 12.sp)
                                    innerTextField()
                                },
                                singleLine = true
                            )
                            Icon(Icons.Default.Search, contentDescription = "Search", tint = Color.Gray, modifier = Modifier.size(18.dp))
                        }
                    }

                    Spacer(modifier = Modifier.height(32.dp))
                }

                // TABLE HEADER
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp)
                            .height(IntrinsicSize.Min),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("Nama Pasien", Modifier.weight(1.2f).padding(8.dp), fontSize = 11.sp, color = Color.Black)
                        TableDivider()
                        Text("Kondisi Pasien", Modifier.weight(1.5f).padding(8.dp), fontSize = 11.sp, color = Color.Black)
                        TableDivider()
                        Text("Waktu Skrinning", Modifier.weight(1.3f).padding(8.dp), fontSize = 11.sp, color = Color.Black)
                        TableDivider()
                        Text("Validasi Kondisi", Modifier.weight(1f).padding(8.dp), fontSize = 11.sp, color = Color.Black, textAlign = TextAlign.Center)
                    }
                    HorizontalDivider(color = Color(0xFFD1D5DB), thickness = 1.dp, modifier = Modifier.padding(horizontal = 16.dp))
                }

                // TABLE ITEMS
                items(listPasien.value.filter { it.nama.contains(searchQuery.value, true) || it.kondisiTampil.contains(searchQuery.value, true) }) { pasien ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { navController.navigate("detail_pasien_petugas/${pasien.id}") }
                            .padding(horizontal = 16.dp)
                            .height(IntrinsicSize.Min),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // NAMA
                        Text(pasien.nama, Modifier.weight(1.2f).padding(8.dp), fontSize = 10.sp, color = Color(0xFF374151), maxLines = 2, overflow = TextOverflow.Ellipsis)

                        TableDivider()

                        // KONDISI (Warna Disesuaikan dengan Figma)
                        val textColor = when {
                            pasien.kondisiTampil.contains("Tinggi", ignoreCase = true) -> Color(0xFFEF4444) // Merah
                            pasien.kondisiTampil.contains("ringan", ignoreCase = true) || pasien.kondisiTampil.contains("sedang", ignoreCase = true) -> Color(0xFFB4D429) // Hijau Kekuningan
                            pasien.kondisiTampil.contains("normal", ignoreCase = true) -> Color(0xFF10B981) // Hijau
                            else -> Color(0xFF6B7280) // Abu-abu default
                        }
                        Text(pasien.kondisiTampil, Modifier.weight(1.5f).padding(8.dp), fontSize = 10.sp, color = textColor)

                        TableDivider()

                        // WAKTU
                        Text(pasien.waktu, Modifier.weight(1.3f).padding(8.dp), fontSize = 10.sp, color = Color(0xFF374151))

                        TableDivider()

                        // VALIDASI
                        Text(pasien.validasi, Modifier.weight(1f).padding(8.dp), fontSize = 10.sp, color = Color(0xFF374151), textAlign = TextAlign.Center)
                    }
                    HorizontalDivider(color = Color(0xFFE5E7EB), thickness = 1.dp, modifier = Modifier.padding(horizontal = 16.dp))
                }

                // Tambahan jarak bawah biar gak mepet
                item { Spacer(modifier = Modifier.height(40.dp)) }
            }

            // Loading Indicator di atas
            PullRefreshIndicator(isRefreshing.value, pullRefreshState, Modifier.align(Alignment.TopCenter), backgroundColor = Color.White, contentColor = Color.Black)
        }
    }
}

// Komponen Pembantu UI biar kodingan rapi
@Composable
fun StatBox(angka: String, label: String) {
    Column {
        Text(text = angka, fontSize = 32.sp, fontWeight = FontWeight.Normal, color = Color.Black)
        Text(text = label, fontSize = 12.sp, color = Color.Gray)
    }
}

@Composable
fun TableDivider() {
    Box(
        modifier = Modifier
            .width(1.dp)
            .fillMaxHeight()
            .background(Color(0xFFD1D5DB)) // Warna garis abu-abu
    )
}