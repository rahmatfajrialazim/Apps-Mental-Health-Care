package com.rahmat.mentalhealthcare

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailRiwayatPasienScreen(navController: NavController, idSkrining: String) {
    var isLoading by remember { mutableStateOf(true) }
    var tanggalSkrining by remember { mutableStateOf("-") }
    var kondisiPasien by remember { mutableStateOf("Memuat...") }
    var catatanRS by remember { mutableStateOf("") }
    var catatanDokter by remember { mutableStateOf("") }
    var gejalaMap by remember { mutableStateOf<Map<String, Boolean>>(emptyMap()) }

    // Gradient Background Biru ke Putih (Sesuai Figma)
    val gradientBrush = Brush.verticalGradient(
        colors = listOf(Color(0xFFC7F0FD), Color.White)
    )

    // Mengambil data dari Firebase Cloud Firestore
    // Mengambil data dari Firebase Cloud Firestore
    LaunchedEffect(idSkrining) {
        try {
            val db = FirebaseFirestore.getInstance()
            val document = db.collection("riwayat_screening").document(idSkrining).get().await()

            if (document.exists()) {
                // 1. Ambil Tanggal
                tanggalSkrining = document.getString("tanggal_screening") ?: "-"

                // 2. Logika Status Kondisi
                val hasilValidasi = document.getString("hasil_validasi_dokter") ?: ""
                kondisiPasien = if (hasilValidasi.isEmpty()) "Menunggu Validasi Dokter" else hasilValidasi

                // 3. Ambil Catatan
                val catRS = document.getString("catatan_rs") ?: ""
                catatanRS = if (catRS.isEmpty()) "Belum ada catatan" else catRS

                val catDok = document.getString("catatan_dokter") ?: ""
                catatanDokter = if (catDok.isEmpty()) "Belum ada catatan" else catDok

                val fetchedGejala = mutableMapOf<String, Boolean>()
                val gejalaArray = document.get("gejala_dipilih") as? List<String> ?: emptyList()

                val gejalaKeys = listOf(
                    "G11","G12","G13","G14","G15",
                    "G21","G22","G23","G24","G25","G26","G27","G28","G29",
                    "G31","G32","G33","G34","G35","G36","G37","G38","G39",
                    "G41","G42","G43","G44","G45","G46","G47",
                    "G51","G52","G53","G54","G55","G56",
                    "G61","G62","G63","G64","G65"
                )

                // Cek apakah kode gejala (misal "G11") ada di dalam Array Firebase
                for (key in gejalaKeys) {
                    fetchedGejala[key] = gejalaArray.contains(key)
                }
                gejalaMap = fetchedGejala
            }
        } catch (e: Exception) {
            kondisiPasien = "Gagal memuat data"
        } finally {
            isLoading = false
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back", tint = Color.Black)
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.White)
            )
        },
        containerColor = Color.White
    ) { innerPadding ->
        if (isLoading) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                CircularProgressIndicator(color = Color.Black)
            }
        } else {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .padding(horizontal = 24.dp)
                    .verticalScroll(rememberScrollState())
            ) {

                // 1. KOTAK HEADER KONDISI
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(brush = gradientBrush, shape = RoundedCornerShape(12.dp))
                        .border(1.dp, Color.Black, RoundedCornerShape(12.dp))
                        .padding(16.dp)
                ) {
                    Column {
                        Text(
                            text = "Kondisi : $tanggalSkrining",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.height(8.dp))

                        // Pewarnaan Dinamis Teks
                        val warnaKondisi = when {
                            kondisiPasien.contains("Tinggi", true) -> Color(0xFFEF4444)
                            kondisiPasien.contains("ringan", true) || kondisiPasien.contains("sedang", true) -> Color(0xFFB4D429)
                            kondisiPasien.contains("normal", true) -> Color(0xFF10B981)
                            else -> Color.Black
                        }

                        Text(
                            text = kondisiPasien,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Normal,
                            color = warnaKondisi
                        )
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                // 2. HEADER DAFTAR GEJALA (Sejajar Ya & Tidak)
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Gejala yang di alami :",
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        color = Color.Black,
                        modifier = Modifier.weight(1f)
                    )
                    Text(
                        text = "Ya",
                        fontWeight = FontWeight.Bold,
                        fontSize = 12.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.width(40.dp)
                    )
                    Text(
                        text = "Tidak",
                        fontWeight = FontWeight.Bold,
                        fontSize = 12.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.width(40.dp)
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))

                // 3. LIST KATEGORI DAN GEJALA
                KategoriGejala("Halusinasi")
                RowGejala("Halusinasi Dengar", gejalaMap["G11"] == true)
                RowGejala("Halusinasi Lihat", gejalaMap["G12"] == true)
                RowGejala("Halusinasi Penciuman", gejalaMap["G13"] == true)
                RowGejala("Halusinasi Rasa", gejalaMap["G14"] == true)
                RowGejala("Halusinasi Raba", gejalaMap["G15"] == true)

                KategoriGejala("Marah-marah")
                RowGejala("Mengucapkan Kata-kata Kotor", gejalaMap["G21"] == true)
                RowGejala("Menyentuh Dengar Kasar", gejalaMap["G22"] == true)
                RowGejala("Merusak Barang-barang", gejalaMap["G23"] == true)
                RowGejala("Mengancam Orang Lain", gejalaMap["G24"] == true)
                RowGejala("Memukul atau Melukai", gejalaMap["G25"] == true)
                RowGejala("Memaksakan Kemauan", gejalaMap["G26"] == true)
                RowGejala("Pandangan Tajam", gejalaMap["G27"] == true)
                RowGejala("Wajah Memerah", gejalaMap["G28"] == true)
                RowGejala("Suara Tinggi", gejalaMap["G29"] == true)

                KategoriGejala("Percobaan Bunuh Diri")
                RowGejala("Putus Asa", gejalaMap["G31"] == true)
                RowGejala("Rasa Bersalah", gejalaMap["G32"] == true)
                RowGejala("Merasa Gagal", gejalaMap["G33"] == true)
                RowGejala("Tidak Bisa Tidur", gejalaMap["G34"] == true)
                RowGejala("Tidak bisa diam", gejalaMap["G35"] == true)
                RowGejala("Berat Badan Turun", gejalaMap["G36"] == true)
                RowGejala("Tidak Memiliki Semangat Hidup", gejalaMap["G37"] == true)
                RowGejala("Menyimpan benda berbahaya dikamar", gejalaMap["G38"] == true)
                RowGejala("Meninggalkan pesan kematian", gejalaMap["G39"] == true)

                KategoriGejala("Tidak Merawat Diri")
                RowGejala("Badan Bau dan Kotor", gejalaMap["G41"] == true)
                RowGejala("Gigi Kotor", gejalaMap["G42"] == true)
                RowGejala("Nafas bau", gejalaMap["G43"] == true)
                RowGejala("Rambut kusam, kusut, kotor", gejalaMap["G44"] == true)
                RowGejala("Kuku panjang dan kotor", gejalaMap["G45"] == true)
                RowGejala("Pakaian tidak sesuai", gejalaMap["G46"] == true)
                RowGejala("BAK/BAB sembarangan", gejalaMap["G47"] == true)

                KategoriGejala("Minder")
                RowGejala("Sering menyendiri", gejalaMap["G51"] == true)
                RowGejala("Menunduk", gejalaMap["G52"] == true)
                RowGejala("Tidak mau menatap mata lawan bicara", gejalaMap["G53"] == true)
                RowGejala("Sering mengeluh", gejalaMap["G54"] == true)
                RowGejala("Menilai dirinya negatif", gejalaMap["G55"] == true)
                RowGejala("Menganggap orang lain lebih baik", gejalaMap["G56"] == true)

                KategoriGejala("Tidak Mau Bergaul")
                RowGejala("Tidak perlu bergaul", gejalaMap["G61"] == true)
                RowGejala("Tidak butuh orang lain", gejalaMap["G62"] == true)
                RowGejala("Tidak berguna", gejalaMap["G63"] == true)
                RowGejala("Tidak disayang/dicintai", gejalaMap["G64"] == true)
                RowGejala("Sering dihina takut bertemu orang lain", gejalaMap["G65"] == true)

                Spacer(modifier = Modifier.height(24.dp))

                // 4. KOTAK CATATAN RS JIWA
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(brush = gradientBrush, shape = RoundedCornerShape(8.dp))
                        .border(1.dp, Color.Black, RoundedCornerShape(8.dp))
                        .padding(16.dp)
                ) {
                    Column {
                        Text("Catatan RS Jiwa :", color = Color.Black, fontSize = 12.sp)
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = catatanRS, color = Color.Black, fontSize = 12.sp)
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                // 5. KOTAK CATATAN DOKTER
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(brush = gradientBrush, shape = RoundedCornerShape(8.dp))
                        .border(1.dp, Color.Black, RoundedCornerShape(8.dp))
                        .padding(16.dp)
                ) {
                    Column {
                        Text("Catatan Dokter :", color = Color.Black, fontSize = 12.sp)
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = catatanDokter, color = Color.Black, fontSize = 12.sp)
                    }
                }

                Spacer(modifier = Modifier.height(32.dp))
            }
        }
    }
}

// ================= FUNGSI BANTUAN UI ================= //

@Composable
fun KategoriGejala(nama: String) {
    Text(
        text = nama,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        color = Color.Black,
        modifier = Modifier.padding(top = 12.dp, bottom = 4.dp)
    )
}

@Composable
fun RowGejala(namaGejala: String, isYa: Boolean) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = namaGejala,
            fontSize = 12.sp,
            color = Color.Black,
            modifier = Modifier.weight(1f)
        )

        // Checkbox "Ya"
        Box(
            modifier = Modifier.width(40.dp),
            contentAlignment = Alignment.Center
        ) {
            CustomCheckIcon(isChecked = isYa)
        }

        // Checkbox "Tidak"
        Box(
            modifier = Modifier.width(40.dp),
            contentAlignment = Alignment.Center
        ) {
            CustomCheckIcon(isChecked = !isYa)
        }
    }
}

@Composable
fun CustomCheckIcon(isChecked: Boolean) {
    Box(
        modifier = Modifier
            .size(16.dp)
            .background(Color(0xFFE5E7EB), RoundedCornerShape(2.dp)),
        contentAlignment = Alignment.Center
    ) {
        if (isChecked) {
            Icon(
                imageVector = Icons.Default.Check,
                contentDescription = "Checked",
                tint = Color.Black,
                modifier = Modifier.size(14.dp)
            )
        }
    }
}