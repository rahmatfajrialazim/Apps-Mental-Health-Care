package com.rahmat.mentalhealthcare

import android.app.DatePickerDialog
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material.icons.outlined.VisibilityOff
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterPasienScreen(navController: NavController, kodeRs: String) {
    val context = LocalContext.current
    val auth = FirebaseAuth.getInstance()
    val db = FirebaseFirestore.getInstance()
    val scrollState = rememberScrollState()
    val isLoading = remember { mutableStateOf(false) }

    // State Identitas Pasien
    val nik = remember { mutableStateOf("") }
    val namaLengkap = remember { mutableStateOf("") }
    val jkOptions = listOf("Laki-laki", "Perempuan")
    val isJkExpanded = remember { mutableStateOf(false) }
    val jkSelected = remember { mutableStateOf("") }
    val tglLahir = remember { mutableStateOf("") }
    val usia = remember { mutableStateOf("") }

    // State Kontak Pasien
    val noHp = remember { mutableStateOf("") }
    val alamat = remember { mutableStateOf("") }

    // State PJ (Penanggung Jawab)
    val pjNama = remember { mutableStateOf("") }
    val isPjJkExpanded = remember { mutableStateOf(false) }
    val pjJkSelected = remember { mutableStateOf("") }
    val pjTglLahir = remember { mutableStateOf("") }
    val pjUsia = remember { mutableStateOf("") }
    val pjNoHp = remember { mutableStateOf("") }
    val pjAlamat = remember { mutableStateOf("") }

    // State Akun & Hide/Show Password
    val password = remember { mutableStateOf("") }
    val konfirmasiPassword = remember { mutableStateOf("") }
    val passwordVisible = remember { mutableStateOf(false) }
    val konfirmasiPasswordVisible = remember { mutableStateOf(false) }
    val isChecked = remember { mutableStateOf(false) }

    // Fungsi Pembantu buat Date Picker
    fun showDatePicker(onDateSelected: (String, String) -> Unit) {
        val calendar = Calendar.getInstance()
        DatePickerDialog(context, { _, year, month, day ->
            val selectedDate = Calendar.getInstance()
            selectedDate.set(year, month, day)
            val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())

            // Hitung Umur Otomatis
            var calculatedAge = calendar.get(Calendar.YEAR) - selectedDate.get(Calendar.YEAR)
            if (calendar.get(Calendar.DAY_OF_YEAR) < selectedDate.get(Calendar.DAY_OF_YEAR)) {
                calculatedAge--
            }
            onDateSelected(sdf.format(selectedDate.time), calculatedAge.toString())
        }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH)).show()
    }

    Scaffold(
        topBar = {
            // 👉 REVISI: Top Bar sekarang polos, cuma buat nampung tombol Back
            TopAppBar(
                title = { },
                navigationIcon = {
                    IconButton(onClick = { navController.navigateUp() }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.White)
            )
        },
        containerColor = Color.White
    ) { padding ->
        Column(
            modifier = Modifier.fillMaxSize().padding(padding).verticalScroll(scrollState).padding(horizontal = 24.dp)
        ) {
            // 👉 REVISI: Judul sekarang ikut scroll dan ada di tengah
            Text("Pendaftaran Pasien Baru", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color.Black, modifier = Modifier.align(Alignment.CenterHorizontally))
            Spacer(modifier = Modifier.height(4.dp))
            Text("Silakan isi data berikut untuk Pendaftaran Pasien Baru.", fontSize = 12.sp, color = Color.Gray, modifier = Modifier.align(Alignment.CenterHorizontally))

            Spacer(modifier = Modifier.height(32.dp))

            // ================= SECTION: IDENTITAS PASIEN =================
            // 👉 REVISI: Header Section Bold
            Text("Identitas Pasien", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color.Black)
            Spacer(modifier = Modifier.height(16.dp))

            LabelRequired("Nomor Induk Kependudukan ", "(Pastikan mengisi NIK dengan benar)")
            InputAbuAbu(value = nik.value, onValueChange = { nik.value = it }, keyboardType = KeyboardType.Number)

            LabelRequired("Nama Lengkap")
            InputAbuAbu(value = namaLengkap.value, onValueChange = { namaLengkap.value = it })

            LabelRequired("Jenis Kelamin")
            ExposedDropdownMenuBox(expanded = isJkExpanded.value, onExpandedChange = { isJkExpanded.value = it }) {
                TextField(
                    value = jkSelected.value, onValueChange = {}, readOnly = true,
                    modifier = Modifier.fillMaxWidth().menuAnchor(),
                    shape = RoundedCornerShape(8.dp),
                    colors = TextFieldDefaults.colors(focusedContainerColor = Color(0xFFF3F4F6), unfocusedContainerColor = Color(0xFFF3F4F6), focusedIndicatorColor = Color.Transparent, unfocusedIndicatorColor = Color.Transparent)
                )
                ExposedDropdownMenu(expanded = isJkExpanded.value, onDismissRequest = { isJkExpanded.value = false }, modifier = Modifier.background(Color.White)) {
                    jkOptions.forEach { opt ->
                        DropdownMenuItem(text = { Text(opt, color = Color.Black) }, onClick = { jkSelected.value = opt; isJkExpanded.value = false })
                    }
                }
            }
            Spacer(modifier = Modifier.height(12.dp))

            LabelRequired("Tanggal Lahir")
            TextField(
                value = tglLahir.value, onValueChange = {}, readOnly = true,
                trailingIcon = { IconButton(onClick = { showDatePicker { date, age -> tglLahir.value = date; usia.value = age } }) { Icon(Icons.Default.CalendarMonth, null, tint = Color.Black) } },
                modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(8.dp),
                colors = TextFieldDefaults.colors(focusedContainerColor = Color(0xFFF3F4F6), unfocusedContainerColor = Color(0xFFF3F4F6), focusedIndicatorColor = Color.Transparent, unfocusedIndicatorColor = Color.Transparent)
            )
            Spacer(modifier = Modifier.height(12.dp))

            LabelRequired("Usia")
            TextField(
                value = usia.value, onValueChange = {}, readOnly = true,
                trailingIcon = { Text("Tahun", fontSize = 12.sp, color = Color.Gray, modifier = Modifier.padding(end = 16.dp)) },
                modifier = Modifier.width(120.dp), shape = RoundedCornerShape(8.dp),
                colors = TextFieldDefaults.colors(focusedContainerColor = Color(0xFFE5E7EB), unfocusedContainerColor = Color(0xFFE5E7EB), focusedIndicatorColor = Color.Transparent, unfocusedIndicatorColor = Color.Transparent)
            )
            Spacer(modifier = Modifier.height(24.dp))

            // ================= SECTION: KONTAK PASIEN =================
            // 👉 REVISI: Header Section Bold
            Text("Kontak Pasien", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color.Black)
            Spacer(modifier = Modifier.height(16.dp))

            LabelRequired("No.Telepon/WhatsApp")
            InputAbuAbu(value = noHp.value, onValueChange = { noHp.value = it }, keyboardType = KeyboardType.Phone)

            LabelRequired("Alamat Domisili")
            InputAbuAbu(value = alamat.value, onValueChange = { alamat.value = it })
            Spacer(modifier = Modifier.height(24.dp))

            // ================= SECTION: IDENTITAS PJ =================
            // 👉 REVISI: Header Section Bold
            Text("Identitas Penanggung Jawab Pasien", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color.Black)
            Spacer(modifier = Modifier.height(16.dp))

            LabelNormal("Nama Lengkap")
            InputAbuAbu(value = pjNama.value, onValueChange = { pjNama.value = it })

            LabelNormal("Jenis Kelamin")
            ExposedDropdownMenuBox(expanded = isPjJkExpanded.value, onExpandedChange = { isPjJkExpanded.value = it }) {
                TextField(
                    value = pjJkSelected.value, onValueChange = {}, readOnly = true, modifier = Modifier.fillMaxWidth().menuAnchor(),
                    shape = RoundedCornerShape(8.dp), colors = TextFieldDefaults.colors(focusedContainerColor = Color(0xFFF3F4F6), unfocusedContainerColor = Color(0xFFF3F4F6), focusedIndicatorColor = Color.Transparent, unfocusedIndicatorColor = Color.Transparent)
                )
                ExposedDropdownMenu(expanded = isPjJkExpanded.value, onDismissRequest = { isPjJkExpanded.value = false }, modifier = Modifier.background(Color.White)) {
                    jkOptions.forEach { opt ->
                        DropdownMenuItem(text = { Text(opt, color = Color.Black) }, onClick = { pjJkSelected.value = opt; isPjJkExpanded.value = false })
                    }
                }
            }
            Spacer(modifier = Modifier.height(12.dp))

            LabelNormal("Tanggal Lahir")
            TextField(
                value = pjTglLahir.value, onValueChange = {}, readOnly = true,
                trailingIcon = { IconButton(onClick = { showDatePicker { date, age -> pjTglLahir.value = date; pjUsia.value = age } }) { Icon(Icons.Default.CalendarMonth, null, tint = Color.Black) } },
                modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(8.dp),
                colors = TextFieldDefaults.colors(focusedContainerColor = Color(0xFFF3F4F6), unfocusedContainerColor = Color(0xFFF3F4F6), focusedIndicatorColor = Color.Transparent, unfocusedIndicatorColor = Color.Transparent)
            )
            Spacer(modifier = Modifier.height(12.dp))

            LabelNormal("Usia")
            TextField(
                value = pjUsia.value, onValueChange = {}, readOnly = true,
                trailingIcon = { Text("Tahun", fontSize = 12.sp, color = Color.Gray, modifier = Modifier.padding(end = 16.dp)) },
                modifier = Modifier.width(120.dp), shape = RoundedCornerShape(8.dp),
                colors = TextFieldDefaults.colors(focusedContainerColor = Color(0xFFE5E7EB), unfocusedContainerColor = Color(0xFFE5E7EB), focusedIndicatorColor = Color.Transparent, unfocusedIndicatorColor = Color.Transparent)
            )
            Spacer(modifier = Modifier.height(24.dp))

            // ================= SECTION: KONTAK PJ =================
            // 👉 REVISI: Header Section Bold
            Text("Kontak Penanggung Jawab Pasien", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color.Black)
            Spacer(modifier = Modifier.height(16.dp))
            LabelNormal("No.Telepon/WhatsApp")
            InputAbuAbu(value = pjNoHp.value, onValueChange = { pjNoHp.value = it }, keyboardType = KeyboardType.Phone)
            LabelNormal("Alamat Domisili")
            InputAbuAbu(value = pjAlamat.value, onValueChange = { pjAlamat.value = it })
            Spacer(modifier = Modifier.height(24.dp))

            // ================= SECTION: AKUN =================
            // 👉 REVISI: Header Section Bold
            Text("Buat Password untuk Akun Pasien", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color.Black)
            Spacer(modifier = Modifier.height(16.dp))

            // 👉 REVISI: Hide and See Password Form 1
            LabelRequired("Password")
            TextField(
                value = password.value, onValueChange = { password.value = it },
                visualTransformation = if (passwordVisible.value) VisualTransformation.None else PasswordVisualTransformation(),
                trailingIcon = {
                    val image = if (passwordVisible.value) Icons.Outlined.Visibility else Icons.Outlined.VisibilityOff
                    IconButton(onClick = { passwordVisible.value = !passwordVisible.value }) {
                        Icon(imageVector = image, contentDescription = null, tint = Color.Gray)
                    }
                },
                modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(8.dp),
                colors = TextFieldDefaults.colors(focusedContainerColor = Color(0xFFF3F4F6), unfocusedContainerColor = Color(0xFFF3F4F6), focusedIndicatorColor = Color.Transparent, unfocusedIndicatorColor = Color.Transparent)
            )
            Spacer(modifier = Modifier.height(12.dp))

            // 👉 REVISI: Hide and See Password Form 2
            LabelRequired("Konfirmasi Ulang Password")
            TextField(
                value = konfirmasiPassword.value, onValueChange = { konfirmasiPassword.value = it },
                visualTransformation = if (konfirmasiPasswordVisible.value) VisualTransformation.None else PasswordVisualTransformation(),
                trailingIcon = {
                    val image = if (konfirmasiPasswordVisible.value) Icons.Outlined.Visibility else Icons.Outlined.VisibilityOff
                    IconButton(onClick = { konfirmasiPasswordVisible.value = !konfirmasiPasswordVisible.value }) {
                        Icon(imageVector = image, contentDescription = null, tint = Color.Gray)
                    }
                },
                modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(8.dp),
                colors = TextFieldDefaults.colors(focusedContainerColor = Color(0xFFF3F4F6), unfocusedContainerColor = Color(0xFFF3F4F6), focusedIndicatorColor = Color.Transparent, unfocusedIndicatorColor = Color.Transparent)
            )
            Spacer(modifier = Modifier.height(16.dp))

            // Checkbox
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = isChecked.value, onCheckedChange = { isChecked.value = it }, colors = CheckboxDefaults.colors(checkedColor = Color.Black))
                Text("Saya menyatakan bahwa data yang saya isi benar", fontSize = 12.sp, color = Color.Black)
            }
            Spacer(modifier = Modifier.height(16.dp))

            // TOMBOL SIMPAN
            Button(
                onClick = {
                    if (nik.value.isEmpty() || namaLengkap.value.isEmpty() || jkSelected.value.isEmpty() || tglLahir.value.isEmpty() || noHp.value.isEmpty() || alamat.value.isEmpty() || password.value.isEmpty()) {
                        Toast.makeText(context, "Harap lengkapi semua data wajib (*)", Toast.LENGTH_SHORT).show()
                        return@Button
                    }
                    if (password.value != konfirmasiPassword.value) {
                        Toast.makeText(context, "Password tidak cocok!", Toast.LENGTH_SHORT).show()
                        return@Button
                    }
                    if (!isChecked.value) {
                        Toast.makeText(context, "Centang persetujuan terlebih dahulu!", Toast.LENGTH_SHORT).show()
                        return@Button
                    }

                    isLoading.value = true

                    // Cek apakah NIK udah ada di database
                    db.collection("data_pasien").document(nik.value).get().addOnSuccessListener { doc ->
                        if (doc.exists()) {
                            isLoading.value = false
                            Toast.makeText(context, "NIK sudah terdaftar!", Toast.LENGTH_SHORT).show()
                        } else {
                            // Bikin Akun Firebase
                            val emailLogin = "${nik.value}@${kodeRs.lowercase()}.com"
                            auth.createUserWithEmailAndPassword(emailLogin, password.value).addOnSuccessListener {

                                // Simpan ke Firestore
                                val dataPasien = mapOf(
                                    "kode_rs" to kodeRs,
                                    "nik" to nik.value,
                                    "nama_lengkap" to namaLengkap.value,
                                    "jenis_kelamin" to jkSelected.value,
                                    "tanggal_lahir" to tglLahir.value,
                                    "usia" to usia.value,
                                    "no_hp" to noHp.value,
                                    "alamat" to alamat.value,
                                    "pj_nama" to pjNama.value,
                                    "pj_jenis_kelamin" to pjJkSelected.value,
                                    "pj_tanggal_lahir" to pjTglLahir.value,
                                    "pj_usia" to pjUsia.value,
                                    "pj_no_hp" to pjNoHp.value,
                                    "pj_alamat" to pjAlamat.value
                                )

                                db.collection("data_pasien").document(nik.value).set(dataPasien).addOnSuccessListener {
                                    isLoading.value = false
                                    Toast.makeText(context, "Pendaftaran Berhasil!", Toast.LENGTH_SHORT).show()
                                    navController.navigate("dashboard_pasien") { popUpTo(0) }
                                }
                            }.addOnFailureListener {
                                isLoading.value = false
                                Toast.makeText(context, "Gagal bikin akun: ${it.message}", Toast.LENGTH_LONG).show()
                            }
                        }
                    }
                },
                modifier = Modifier.fillMaxWidth().height(50.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
                enabled = !isLoading.value
            ) {
                Text(if (isLoading.value) "Menyimpan..." else "Simpan & Lanjutkan", color = Color.White, fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.height(40.dp))
        }
    }
}

// === KOMPONEN PEMBANTU UI ===
@Composable
fun LabelRequired(text: String, subtext: String = "") {
    Text(
        text = buildAnnotatedString {
            append(text)
            withStyle(style = SpanStyle(color = Color.Red)) { append(" *") }
            if (subtext.isNotEmpty()) {
                withStyle(style = SpanStyle(color = Color.Gray, fontSize = 10.sp)) { append(" $subtext") }
            }
        },
        fontSize = 12.sp, color = Color.Black, modifier = Modifier.padding(bottom = 4.dp)
    )
}

@Composable
fun LabelNormal(text: String) {
    Text(text, fontSize = 12.sp, color = Color.Black, modifier = Modifier.padding(bottom = 4.dp))
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputAbuAbu(value: String, onValueChange: (String) -> Unit, keyboardType: KeyboardType = KeyboardType.Text) {
    TextField(
        value = value, onValueChange = onValueChange,
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
        modifier = Modifier.fillMaxWidth().padding(bottom = 12.dp),
        shape = RoundedCornerShape(8.dp),
        colors = TextFieldDefaults.colors(focusedContainerColor = Color(0xFFF3F4F6), unfocusedContainerColor = Color(0xFFF3F4F6), focusedIndicatorColor = Color.Transparent, unfocusedIndicatorColor = Color.Transparent)
    )
}