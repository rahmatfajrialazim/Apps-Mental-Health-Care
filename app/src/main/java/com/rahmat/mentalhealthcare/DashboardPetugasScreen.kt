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

data class RiwayatPasien(
    val id: String = "",
    val nama: String = "-",
    val kondisi: String = "-",
    val waktu: String = "-",
    val validasi: String = "Belum"
)

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterialApi::class)
@Composable
fun DashboardPetugasScreen(navController: NavController) {
    val context = LocalContext.current
    val auth = FirebaseAuth.getInstance()
    val db = FirebaseFirestore.getInstance()

    BackHandler {
        (context as? Activity)?.finish()
    }

    var namaPetugas by remember { mutableStateOf("Petugas Medis") }
    var listPasien by remember { mutableStateOf<List<RiwayatPasien>>(emptyList()) }
    var totalPasien by remember { mutableStateOf(0) }
    var pasienHariIni by remember { mutableStateOf(0) }
    var resikoTinggi by remember { mutableStateOf(0) }
    var searchQuery by remember { mutableStateOf("") }
    var expandedMenu by remember { mutableStateOf(false) }
    var isRefreshing by remember { mutableStateOf(false) }

    fun fetchDataFirebase() {
        isRefreshing = true
        val email = auth.currentUser?.email ?: ""
        val idLogin = email.substringBefore("@")

        if (idLogin.isNotEmpty()) {
            db.collection("users").whereEqualTo("id_login", idLogin).get()
                .addOnSuccessListener { snaps ->
                    if (!snaps.isEmpty) {
                        namaPetugas = snaps.documents[0].getString("nama") ?: "Petugas Medis"
                    }
                }
        }

        db.collection("riwayat_screening").get()
            .addOnSuccessListener { snaps ->
                val fetchedList = snaps.documents.map { doc ->
                    val hasilValidasi = doc.getString("hasil_validasi_dokter")
                    val displayValidasi = if (hasilValidasi.isNullOrEmpty()) "Belum" else "Sudah"

                    // 👉 LOGIKA BARU: Timpa hasil AI dengan hasil Dokter kalau dokternya udah ngisi
                    val hasilAi = doc.getString("hasil_ai") ?: "Kondisi mental normal"
                    val kondisiFinal = if (hasilValidasi.isNullOrEmpty()) hasilAi else hasilValidasi

                    val tgl = doc.getString("tanggal_screening") ?: "-"
                    val jam = doc.getString("jam_screening") ?: "00.00"
                    val displayTime = "$jam WIB - $tgl"

                    RiwayatPasien(
                        id = doc.id,
                        nama = doc.getString("nama_pasien") ?: "-",
                        kondisi = kondisiFinal, // Pake variabel logika baru
                        waktu = displayTime,
                        validasi = displayValidasi
                    )
                }
                listPasien = fetchedList
                totalPasien = fetchedList.size

                val todayStr = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(Date())
                pasienHariIni = fetchedList.count { it.waktu.contains(todayStr) }

                resikoTinggi = fetchedList.count { it.kondisi.equals("Distres Psikologis Tinggi", ignoreCase = true) }
                isRefreshing = false
            }
            .addOnFailureListener {
                Toast.makeText(context, "Gagal memuat data", Toast.LENGTH_SHORT).show()
                isRefreshing = false
            }
    }

    LaunchedEffect(Unit) { fetchDataFirebase() }

    val pullRefreshState = rememberPullRefreshState(refreshing = isRefreshing, onRefresh = { fetchDataFirebase() })

    Scaffold(containerColor = Color.White) { innerPadding ->
        Box(modifier = Modifier.fillMaxSize().padding(innerPadding).pullRefresh(pullRefreshState)) {
            LazyColumn(modifier = Modifier.fillMaxSize(), contentPadding = PaddingValues(bottom = 80.dp)) {
                item {
                    Spacer(modifier = Modifier.height(16.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth().padding(horizontal = 24.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "Halo, $namaPetugas", fontSize = 24.sp, color = Color.Black)
                        Box {
                            IconButton(onClick = { expandedMenu = true }) {
                                Icon(Icons.Default.Menu, contentDescription = "Menu", modifier = Modifier.size(28.dp), tint = Color.Black)
                            }
                            DropdownMenu(
                                expanded = expandedMenu,
                                onDismissRequest = { expandedMenu = false },
                                modifier = Modifier.width(160.dp).background(Color.White).border(1.dp, Color.Black).padding(0.dp)
                            ) {
                                DropdownMenuItem(
                                    text = { Text("Profil", fontSize = 14.sp, color = Color.Black) },
                                    onClick = { expandedMenu = false },
                                    modifier = Modifier.height(36.dp),
                                    contentPadding = PaddingValues(horizontal = 16.dp)
                                )
                                HorizontalDivider(color = Color.Black, thickness = 1.dp)
                                DropdownMenuItem(
                                    text = { Text("Log Out", fontSize = 14.sp, color = Color.Black) },
                                    onClick = {
                                        expandedMenu = false
                                        auth.signOut()
                                        navController.navigate("role_selection") { popUpTo("dashboard_petugas") { inclusive = true } }
                                    },
                                    modifier = Modifier.height(36.dp),
                                    contentPadding = PaddingValues(horizontal = 16.dp)
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))
                    Text(text = "Data Pasien", fontSize = 16.sp, color = Color.Black, modifier = Modifier.padding(horizontal = 24.dp))
                    Spacer(modifier = Modifier.height(16.dp))

                    Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 24.dp), horizontalArrangement = Arrangement.SpaceBetween) {
                        StatItem(angka = totalPasien.toString(), label = "Total Pasien")
                        StatItem(angka = pasienHariIni.toString(), label = "Terdaftar Hari Ini")
                        StatItem(angka = resikoTinggi.toString(), label = "Pasien Resiko Tinggi")
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Box(
                        modifier = Modifier.fillMaxWidth().padding(horizontal = 24.dp).height(36.dp)
                            .background(Color(0xFFE5E7EB), RoundedCornerShape(18.dp)).padding(horizontal = 16.dp),
                        contentAlignment = Alignment.CenterStart
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            BasicTextField(
                                value = searchQuery,
                                onValueChange = { searchQuery = it },
                                textStyle = androidx.compose.ui.text.TextStyle(fontSize = 12.sp, color = Color.Black),
                                modifier = Modifier.weight(1f),
                                singleLine = true,
                                decorationBox = { innerTextField ->
                                    if (searchQuery.isEmpty()) Text("Nama/Gejala Pasien", fontSize = 12.sp, color = Color.Gray)
                                    innerTextField()
                                }
                            )
                            Icon(Icons.Default.Search, contentDescription = "Search", tint = Color.Gray, modifier = Modifier.size(16.dp))
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp).height(IntrinsicSize.Min)) {
                        Text("Nama Pasien", modifier = Modifier.weight(1.1f).padding(vertical = 8.dp, horizontal = 2.dp), fontSize = 9.sp, fontWeight = FontWeight.SemiBold, color = Color.Black, maxLines = 1, overflow = TextOverflow.Ellipsis)
                        VerticalDivider(color = Color(0xFFE5E7EB))
                        Text("Kondisi Pasien", modifier = Modifier.weight(1.5f).padding(vertical = 8.dp, horizontal = 2.dp), fontSize = 9.sp, fontWeight = FontWeight.SemiBold, color = Color.Black, maxLines = 1, overflow = TextOverflow.Ellipsis)
                        VerticalDivider(color = Color(0xFFE5E7EB))
                        Text("Waktu Skrinning", modifier = Modifier.weight(1.6f).padding(vertical = 8.dp, horizontal = 2.dp), fontSize = 9.sp, fontWeight = FontWeight.SemiBold, color = Color.Black, maxLines = 1, overflow = TextOverflow.Ellipsis)
                        VerticalDivider(color = Color(0xFFE5E7EB))
                        Text("Validasi", modifier = Modifier.weight(0.7f).padding(vertical = 8.dp, horizontal = 2.dp), fontSize = 9.sp, fontWeight = FontWeight.SemiBold, color = Color.Black, maxLines = 1, overflow = TextOverflow.Ellipsis, textAlign = TextAlign.Center)
                    }
                    HorizontalDivider(color = Color(0xFFE5E7EB), thickness = 1.dp, modifier = Modifier.padding(horizontal = 8.dp))
                }

                items(listPasien.filter { it.nama.contains(searchQuery, true) || it.kondisi.contains(searchQuery, true) }) { pasien ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { navController.navigate("detail_pasien_petugas/${pasien.id}") }
                            .padding(horizontal = 8.dp)
                            .height(IntrinsicSize.Min),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(pasien.nama, modifier = Modifier.weight(1.1f).padding(vertical = 10.dp, horizontal = 2.dp), fontSize = 8.sp, color = Color(0xFF4B5563), maxLines = 1, overflow = TextOverflow.Ellipsis)
                        VerticalDivider(color = Color(0xFFE5E7EB))

                        val kondisiColor = when {
                            pasien.kondisi.contains("normal", ignoreCase = true) -> Color(0xFF10B981)
                            pasien.kondisi.contains("tinggi", ignoreCase = true) -> Color(0xFFEF4444)
                            else -> Color(0xFFFBBF24)
                        }
                        Text(pasien.kondisi, modifier = Modifier.weight(1.5f).padding(vertical = 10.dp, horizontal = 2.dp), fontSize = 8.sp, fontWeight = FontWeight.Medium, color = kondisiColor, maxLines = 1, overflow = TextOverflow.Ellipsis)
                        VerticalDivider(color = Color(0xFFE5E7EB))

                        Text(pasien.waktu, modifier = Modifier.weight(1.6f).padding(vertical = 10.dp, horizontal = 2.dp), fontSize = 8.sp, color = Color(0xFF4B5563), maxLines = 1, overflow = TextOverflow.Ellipsis)
                        VerticalDivider(color = Color(0xFFE5E7EB))

                        Text(pasien.validasi, modifier = Modifier.weight(0.7f).padding(vertical = 10.dp, horizontal = 2.dp), fontSize = 8.sp, color = Color(0xFF4B5563), maxLines = 1, textAlign = TextAlign.Center)
                    }
                    HorizontalDivider(color = Color(0xFFE5E7EB), thickness = 1.dp, modifier = Modifier.padding(horizontal = 8.dp))
                }
            }
            PullRefreshIndicator(refreshing = isRefreshing, state = pullRefreshState, modifier = Modifier.align(Alignment.TopCenter), backgroundColor = Color.White, contentColor = Color.Black)
        }
    }
}

@Composable
fun StatItem(angka: String, label: String) {
    Column {
        Text(text = angka, fontSize = 28.sp, fontWeight = FontWeight.Normal, color = Color.Black)
        Spacer(modifier = Modifier.height(2.dp))
        Text(text = label, fontSize = 11.sp, color = Color(0xFFA1A1AA))
    }
}