package com.rahmat.mentalhealthcare

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await
import java.text.SimpleDateFormat
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProgresPasienScreen(navController: NavController, idPasien: String) {
    val context = LocalContext.current
    val db = FirebaseFirestore.getInstance()
    
    val isLoading = remember { mutableStateOf(true) }
    val listRiwayatUI = remember { mutableStateOf<List<Map<String, String>>>(emptyList()) }
    val namaPasien = remember { mutableStateOf("...") }
    
    // Status Analisis DSS AI
    val statusTren = remember { mutableStateOf("Sedang menganalisis...") }
    val warnaTren = remember { mutableStateOf(Color.Gray) }
    val iconTren = remember { mutableStateOf("🔍") }

    LaunchedEffect(idPasien) {
        try {
            val historySnaps = db.collection("riwayat_screening")
                .whereEqualTo("id_pasien", idPasien)
                .get()
                .await()

            val listMentah = historySnaps.documents.mapNotNull { doc ->
                val tgl = doc.getString("tanggal_screening") ?: ""
                val validasi = doc.getString("hasil_validasi_dokter") ?: doc.getString("hasil_ai") ?: ""
                val catatan = doc.getString("catatan_dokter") ?: "Belum ada tindakan."
                
                // Ambil sekalian nama pasiennya buat ditampilin di UI
                if (namaPasien.value == "...") {
                    namaPasien.value = doc.getString("nama_pasien") ?: "Tidak diketahui"
                }

                // Ambil semua skrining (yang sudah divalidasi dokter aja)
                if (doc.getString("hasil_validasi_dokter")?.isNotEmpty() == true) {
                    mapOf("tanggal" to tgl, "kondisi" to validasi, "catatan" to catatan)
                } else null
            }

            // 1. FORMAT TANGGAL biar bisa diurutin secara kalender asli
            val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
            
            // 2. URUTKAN ASCENDING (Lama -> Baru) KHUSUS UNTUK ANALISIS AI
            val sortedAscending = listMentah.sortedBy { 
                try { sdf.parse(it["tanggal"] ?: "")?.time ?: 0L } catch (e: Exception) { 0L }
            }

            // 3. LOGIKA DSS (AI Trend Analysis) - VERSI PSIKIATER MANUSIA
            if (sortedAscending.size < 2) {
                statusTren.value = "Pemantauan awal (data belum cukup)"
                warnaTren.value = Color(0xFFEAB308)
                iconTren.value = "🔍"
            } else {
                // Konversi kondisi teks ke angka (bobot keparahan)
                fun getBobot(kondisi: String) = when {
                    kondisi.contains("Tinggi", true) -> 3
                    kondisi.contains("ringan", true) || kondisi.contains("sedang", true) -> 2
                    kondisi.contains("normal", true) -> 1
                    else -> 0
                }

                val semuaBobot = sortedAscending.map { getBobot(it["kondisi"] ?: "") }
                
                // Fokus Utama: Kondisi HARI INI (Data paling terakhir)
                val bobotHariIni = semuaBobot.last()
                
                // Fokus Kedua: Rata-rata MASA LALU (Semua riwayat sebelum hari ini)
                val masaLalu = semuaBobot.dropLast(1)
                val rataMasaLalu = masaLalu.average()

                // State-Machine Logika Klinis
                val (teks, warna, icon) = when (bobotHariIni) {
                    // --- JIKA HARI INI NORMAL (1) ---
                    1 -> {
                        if (rataMasaLalu >= 1.5) Triple("Membaik signifikan (Normal)", Color(0xFF10B981), "🌟")
                        else Triple("Kondisi stabil (Normal)", Color(0xFF10B981), "✅")
                    }
                    
                    // --- JIKA HARI INI RISIKO SEDANG (2) ---
                    2 -> {
                        when {
                            // Dulu sering merah (Tinggi), sekarang kuning (Sedang) -> Kemajuan!
                            rataMasaLalu >= 2.5 -> Triple("Menunjukkan kemajuan (Risiko menurun)", Color(0xFFB4D429), "↗️")
                            // Dulu sering hijau (Normal), sekarang kuning (Sedang) -> Memburuk!
                            rataMasaLalu <= 1.5 -> Triple("Tren memburuk (Risiko sedang)", Color(0xFFEAB308), "📉")
                            // Kalau angkanya murni naik turun di sekitar 2
                            else -> {
                                if (semuaBobot.takeLast(3).all { it == 2 }) Triple("Kondisi stagnan (Risiko sedang)", Color(0xFFEAB308), "🟡")
                                else Triple("Kondisi fluktuatif (Risiko sedang)", Color(0xFFEAB308), "⚖️")
                            }
                        }
                    }
                    
                    // --- JIKA HARI INI RISIKO TINGGI (3) ---
                    3 -> {
                        when {
                            // Dulu sering normal/sedang, sekarang jebol merah -> Memburuk drastis!
                            rataMasaLalu <= 2.2 -> Triple("Tren memburuk (Risiko meningkat)", Color(0xFFEF4444), "📉")
                            // Udah merah dari dulu, sekarang merah lagi
                            else -> {
                                if (semuaBobot.takeLast(3).all { it == 3 }) Triple("Tidak ada kemajuan (Risiko tinggi)", Color(0xFFEF4444), "🔴")
                                else Triple("Kondisi fluktuatif (Risiko tinggi)", Color(0xFFEF4444), "⚠️")
                            }
                        }
                    }
                    else -> Triple("Gagal menganalisis data", Color.Gray, "❓")
                }

                statusTren.value = teks
                warnaTren.value = warna
                iconTren.value = icon
            }

            // 4. URUTKAN DESCENDING (Baru -> Lama) KHUSUS UNTUK TAMPILAN LIST UI
            listRiwayatUI.value = sortedAscending.reversed()

        } catch (e: Exception) {
            Toast.makeText(context, "Gagal memuat riwayat", Toast.LENGTH_SHORT).show()
        } finally {
            isLoading.value = false
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Analisis Progres Pasien", fontSize = 18.sp, fontWeight = FontWeight.Bold) },
                navigationIcon = {
                    IconButton(onClick = { navController.navigateUp() }) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.White)
            )
        },
        containerColor = Color.White
    ) { padding ->
        if (isLoading.value) {
            Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) { CircularProgressIndicator() }
        } else {
            Column(modifier = Modifier.fillMaxSize().padding(padding).padding(horizontal = 24.dp)) {
                
                // KOTAK ANALISIS AI (DSS)
                Card(
                    modifier = Modifier.fillMaxWidth().padding(top = 16.dp, bottom = 24.dp),
                    colors = CardDefaults.cardColors(containerColor = warnaTren.value.copy(alpha = 0.1f)),
                    border = BorderStroke(1.dp, warnaTren.value)
                ) {
                    Row(modifier = Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
                        Text(text = iconTren.value, fontSize = 32.sp)
                        Spacer(modifier = Modifier.width(16.dp))
                        Column {
                            // Teks penjelasan yang rapi
                            Text("Sistem menganalisis perawatan pasien ${namaPasien.value} menunjukkan hasil:", fontSize = 12.sp, color = Color.Gray, lineHeight = 16.sp)
                            Spacer(modifier = Modifier.height(6.dp))
                            Text(text = statusTren.value, fontWeight = FontWeight.Bold, color = warnaTren.value, fontSize = 18.sp)
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(text = "Berdasarkan evaluasi dari total ${listRiwayatUI.value.size} riwayat skrining", fontSize = 11.sp, color = Color.DarkGray)
                        }
                    }
                }

                Text("Detail Riwayat Terakhir", fontWeight = FontWeight.Bold, fontSize = 16.sp, color = Color.Black)
                Spacer(modifier = Modifier.height(12.dp))

                if (listRiwayatUI.value.isEmpty()) {
                    Text("Belum ada data riwayat skrining.", color = Color.Gray)
                } else {
                    // LIST RIWAYAT DARI TERBARU (ATAS) KE TERLAMA (BAWAH)
                    LazyColumn {
                        items(listRiwayatUI.value) { riwayat ->
                            Card(
                                modifier = Modifier.fillMaxWidth().padding(bottom = 12.dp),
                                colors = CardDefaults.cardColors(containerColor = Color(0xFFF3F4F6)),
                                border = BorderStroke(1.dp, Color.LightGray)
                            ) {
                                Column(modifier = Modifier.padding(16.dp)) {
                                    Text(text = "Tanggal: ${riwayat["tanggal"]}", fontSize = 12.sp, fontWeight = FontWeight.Bold, color = Color.DarkGray)
                                    
                                    val warnaKondisi = when {
                                        riwayat["kondisi"]!!.contains("Tinggi", true) -> Color(0xFFEF4444)
                                        riwayat["kondisi"]!!.contains("ringan", true) || riwayat["kondisi"]!!.contains("sedang", true) -> Color(0xFFB4D429)
                                        else -> Color(0xFF10B981)
                                    }
                                    
                                    Text(text = "Kondisi: ${riwayat["kondisi"]}", fontSize = 15.sp, color = warnaKondisi, fontWeight = FontWeight.Bold)
                                    Spacer(modifier = Modifier.height(6.dp))
                                    Text(text = "Catatan/Tindakan yang di berikan:", fontSize = 12.sp, color = Color.Gray)
                                    Text(text = riwayat["catatan"] ?: "-", fontSize = 13.sp, color = Color.Black)
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}