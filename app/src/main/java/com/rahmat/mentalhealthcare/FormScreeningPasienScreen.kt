package com.rahmat.mentalhealthcare

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormScreeningPasienScreen(navController: NavController) {
    val context = LocalContext.current
    val auth = FirebaseAuth.getInstance()
    val db = FirebaseFirestore.getInstance()
    val scrollState = rememberScrollState()

    val isLoading = remember { mutableStateOf(true) }
    val isSaving = remember { mutableStateOf(false) }

    val nikPasien = remember { mutableStateOf("") }
    val namaPasien = remember { mutableStateOf("") }
    val kodeRs = remember { mutableStateOf("") }

    val listKategori = remember { mutableStateOf<List<KategoriHirarkiUI>>(emptyList()) }
    val listGejala = remember { mutableStateOf<List<GejalaHirarkiUI>>(emptyList()) }

    // State jawaban (bisa null/kosong di awal)
    val jawabanPasien = remember { mutableStateMapOf<String, Boolean?>() }

    // 👉 FUNGSI BARU: Prediksi menggunakan Random Forest (M2CGEN)
    fun jalankanPrediksiRandomForest(gejalaList: List<GejalaHirarkiUI>): String {
        try {
            // 1. Siapkan array input Double (41 Gejala) sesuai urutan ID
            val inputVal = DoubleArray(41)
            val sortedGejala = gejalaList.sortedBy { it.idGejala }

            for (i in sortedGejala.indices) {
                val idGejala = sortedGejala[i].idGejala
                val apakahYa = jawabanPasien[idGejala] == true
                inputVal[i] = if (apakahYa) 1.0 else 0.0
            }

            // 2. Panggil file Java Random Forest yang udah lu masukin ke Android Studio
            val hasilSkor = MentalHealthRFModel.score(inputVal)

            // 3. Cari Index Tertinggi (0, 1, atau 2) dari output array
            var maxIndex = 0
            var maxScore = hasilSkor[0]
            for (j in hasilSkor.indices) {
                if (hasilSkor[j] > maxScore) {
                    maxScore = hasilSkor[j]
                    maxIndex = j
                }
            }

            // 4. Terjemahkan ke String sesuai urutan Class lu di Colab
            return when (maxIndex) {
                0 -> "Kondisi mental normal"
                1 -> "Risiko ringan hingga sedang"
                2 -> "Distres Psikologis Tinggi"
                else -> "Kondisi mental normal"
            }

        } catch (e: Exception) {
            e.printStackTrace()
            return "Gagal memproses prediksi AI"
        }
    }

    // Mengambil data awal indikator gejala dari Firestore
    LaunchedEffect(Unit) {
        try {
            val email = auth.currentUser?.email ?: ""
            val nik = email.substringBefore("@")
            nikPasien.value = nik

            if (nik.isNotEmpty()) {
                val pDoc = db.collection("data_pasien").document(nik).get().await()
                if (pDoc.exists()) {
                    namaPasien.value = pDoc.getString("nama_lengkap") ?: "Pasien"
                    kodeRs.value = pDoc.getString("kode_rs") ?: ""
                }
            }

            val katDocs = db.collection("kategori_gejala").get().await()
            val tempKategori = katDocs.documents.map { doc ->
                KategoriHirarkiUI(id = doc.id, nama = doc.getString("nama_induk") ?: "Kategori ${doc.id}")
            }.sortedBy { it.id }

            val masterDocs = db.collection("master_gejala").get().await()
            val tempGejala = masterDocs.documents.map { doc ->
                val idGejala = doc.id
                // Awal mula kosong semua
                jawabanPasien[idGejala] = null

                GejalaHirarkiUI(
                    idGejala = idGejala,
                    idKategori = doc.getString("parent") ?: "",
                    namaGejala = doc.getString("nama_gejala") ?: "Gejala ${doc.id}",
                    isChecked = false
                )
            }.sortedBy { it.idGejala }

            listKategori.value = tempKategori
            listGejala.value = tempGejala

        } catch (e: Exception) {
            Toast.makeText(context, "Gagal memuat form skrinning", Toast.LENGTH_SHORT).show()
        } finally {
            isLoading.value = false
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { },
                navigationIcon = {
                    IconButton(onClick = { navController.navigateUp() }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back", tint = Color.Black)
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
            Column(
                modifier = Modifier.fillMaxSize().padding(padding).verticalScroll(scrollState).padding(horizontal = 24.dp)
            ) {
                Text(
                    text = "Indikator Gejala",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp),
                    textAlign = TextAlign.Center
                )

                Text(
                    text = "Mohon mengisi Gejala yang anda alami, dengan cara mencentang kotak Ya/Tidak di bawah ini",
                    fontSize = 12.sp, color = Color.Gray, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth().padding(bottom = 24.dp)
                )

                Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                    Text("Gejala yang di alami :", modifier = Modifier.weight(1f), fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color.Black)
                    Text("Ya", modifier = Modifier.width(50.dp), textAlign = TextAlign.Center, fontSize = 14.sp, fontWeight = FontWeight.Bold, color = Color.Black)
                    Text("Tidak", modifier = Modifier.width(50.dp), textAlign = TextAlign.Center, fontSize = 14.sp, fontWeight = FontWeight.Bold, color = Color.Black)
                }

                Spacer(Modifier.height(8.dp))

                listKategori.value.forEach { kategori ->
                    Text(text = kategori.nama, fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color.Black, modifier = Modifier.padding(top = 16.dp, bottom = 8.dp))

                    val childGejala = listGejala.value.filter { it.idKategori == kategori.id }

                    childGejala.forEach { gejala ->
                        val stateJawaban = jawabanPasien[gejala.idGejala]

                        Row(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp), verticalAlignment = Alignment.CenterVertically) {
                            Text(text = gejala.namaGejala, modifier = Modifier.weight(1f).padding(start = 12.dp), fontSize = 14.sp, color = Color.DarkGray)

                            Box(modifier = Modifier.width(50.dp), contentAlignment = Alignment.Center) {
                                Checkbox(
                                    checked = stateJawaban == true,
                                    onCheckedChange = { jawabanPasien[gejala.idGejala] = true },
                                    colors = CheckboxDefaults.colors(checkedColor = Color.Black, uncheckedColor = Color.LightGray)
                                )
                            }

                            Box(modifier = Modifier.width(50.dp), contentAlignment = Alignment.Center) {
                                Checkbox(
                                    checked = stateJawaban == false,
                                    onCheckedChange = { jawabanPasien[gejala.idGejala] = false },
                                    colors = CheckboxDefaults.colors(checkedColor = Color.Black, uncheckedColor = Color.LightGray)
                                )
                            }
                        }
                    }
                }

                Spacer(Modifier.height(32.dp))

                Button(
                    onClick = {
                        val adaYangKosong = listGejala.value.any { jawabanPasien[it.idGejala] == null }
                        if (adaYangKosong) {
                            Toast.makeText(context, "Mohon centang Ya/Tidak untuk seluruh gejala!", Toast.LENGTH_LONG).show()
                            return@Button
                        }

                        isSaving.value = true

                        val gejalaTerpilih = jawabanPasien.filter { it.value == true }.keys.toList()

                        // 👉 EKSEKUSI PREDIKSI RANDOM FOREST NATIVE
                        val hasilAIPrediksi = jalankanPrediksiRandomForest(listGejala.value)

                        val tglSkg = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(Date())
                        val jamSkg = SimpleDateFormat("HH:mm", Locale.getDefault()).format(Date())

                        val dataRiwayat = mapOf(
                            "id_pasien" to nikPasien.value,
                            "nama_pasien" to namaPasien.value,
                            "kode_rs" to kodeRs.value,
                            "gejala_dipilih" to gejalaTerpilih,
                            "hasil_ai" to hasilAIPrediksi,
                            "hasil_validasi_dokter" to "",
                            "catatan_dokter" to "",
                            "catatan_rs" to "",
                            "tanggal_screening" to tglSkg,
                            "jam_screening" to jamSkg
                        )

                        db.collection("riwayat_screening").add(dataRiwayat)
                            .addOnSuccessListener { docRef ->
                                isSaving.value = false
                                Toast.makeText(context, "Data berhasil diproses!", Toast.LENGTH_SHORT).show()
                                navController.navigate("detail_riwayat_pasien/${docRef.id}") {
                                    popUpTo("dashboard_pasien")
                                }
                            }
                            .addOnFailureListener {
                                isSaving.value = false
                                Toast.makeText(context, "Gagal menyimpan data", Toast.LENGTH_SHORT).show()
                            }
                    },
                    modifier = Modifier.fillMaxWidth().height(50.dp),
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
                    enabled = !isSaving.value
                ) {
                    Text(if (isSaving.value) "Menyimpan..." else "Kirim dan Simpan", color = Color.White, fontWeight = FontWeight.Bold)
                }
                Spacer(Modifier.height(40.dp))
            }
        }
    }
}