package com.rahmat.mentalhealthcare

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material.icons.outlined.VisibilityOff
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginPasienScreen(navController: NavController, kodeRs: String) {
    val idUser = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }
    val passwordVisible = remember { mutableStateOf(false) }
    val isLoading = remember { mutableStateOf(false) }
    val auth = FirebaseAuth.getInstance()
    val db = FirebaseFirestore.getInstance()
    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize().background(Color.White).verticalScroll(rememberScrollState()).padding(horizontal = 32.dp, vertical = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(60.dp))
        Image(painter = painterResource(id = R.drawable.logo), contentDescription = null, modifier = Modifier.size(100.dp))
        Spacer(modifier = Modifier.height(40.dp))
        Column(modifier = Modifier.fillMaxWidth()) {
            Text("Selamat Datang kembali", fontSize = 24.sp, fontWeight = FontWeight.Normal, color = Color.Black)
            Spacer(modifier = Modifier.height(4.dp))
            Text("Masukkan NIK anda.", fontSize = 13.sp, color = Color.Gray) // Teks NIK sesuai Figma
        }
        Spacer(modifier = Modifier.height(24.dp))

        TextField(
            value = idUser.value, onValueChange = { idUser.value = it },
            placeholder = { Text("Nomor Induk Kependudukan", color = Color.Gray) },
            leadingIcon = { Icon(painter = painterResource(id = R.drawable.ic_user), contentDescription = null, tint = Color.Gray, modifier = Modifier.size(20.dp)) },
            modifier = Modifier.fillMaxWidth().height(56.dp),
            shape = RoundedCornerShape(12.dp),
            colors = TextFieldDefaults.colors(focusedContainerColor = Color(0xFFF3F4F6), unfocusedContainerColor = Color(0xFFF3F4F6), focusedIndicatorColor = Color.Transparent, unfocusedIndicatorColor = Color.Transparent)
        )
        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = password.value, onValueChange = { password.value = it },
            placeholder = { Text("Password", color = Color.Gray) },
            leadingIcon = { Icon(painter = painterResource(id = R.drawable.ic_lock), contentDescription = null, tint = Color.Gray, modifier = Modifier.size(20.dp)) },
            trailingIcon = {
                val image = if (passwordVisible.value) Icons.Outlined.Visibility else Icons.Outlined.VisibilityOff
                IconButton(onClick = { passwordVisible.value = !passwordVisible.value }) { Icon(imageVector = image, contentDescription = null, tint = Color.Gray) }
            },
            visualTransformation = if (passwordVisible.value) VisualTransformation.None else PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth().height(56.dp),
            shape = RoundedCornerShape(12.dp),
            colors = TextFieldDefaults.colors(focusedContainerColor = Color(0xFFF3F4F6), unfocusedContainerColor = Color(0xFFF3F4F6), focusedIndicatorColor = Color.Transparent, unfocusedIndicatorColor = Color.Transparent)
        )
        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = {
                if (idUser.value.isEmpty() || password.value.isEmpty()) return@Button
                isLoading.value = true

                // LOGIKA AUTHENTICATION PASIEN
                db.collection("data_pasien").whereEqualTo("nik", idUser.value).get().addOnSuccessListener { snaps ->
                    if (snaps.isEmpty) {
                        // Cek apakah dia Nakes yang nyasar
                        db.collection("users").whereEqualTo("id_login", idUser.value).get().addOnSuccessListener { uSnaps ->
                            isLoading.value = false
                            if(!uSnaps.isEmpty) {
                                Toast.makeText(context, "Akun Tidak Terdaftar Pada Rumah Sakit Ini", Toast.LENGTH_LONG).show() // Nakes nyasar ke pasien
                            } else {
                                Toast.makeText(context, "NIK Pasien Tidak Terdaftar Pada Rumah Sakit Ini", Toast.LENGTH_LONG).show() // Gak ada sama sekali
                            }
                        }
                    } else {
                        val doc = snaps.documents[0]
                        val dbKodeRs = doc.getString("kode_rs") ?: ""

                        if (dbKodeRs != kodeRs) {
                            isLoading.value = false
                            Toast.makeText(context, "NIK Pasien Tidak Terdaftar Pada Rumah Sakit Ini", Toast.LENGTH_LONG).show() // Salah RS
                        } else {
                            // Lolos semua, login Firebase Auth (asumsi pake nik@kode_rs.com)
                            val emailLogin = "${idUser.value}@${kodeRs.lowercase()}.com"
                            auth.signInWithEmailAndPassword(emailLogin, password.value).addOnSuccessListener {
                                isLoading.value = false
                                // TODO: Navigate to dashboard_pasien
                                Toast.makeText(context, "Login Pasien Berhasil", Toast.LENGTH_SHORT).show()
                            }.addOnFailureListener {
                                isLoading.value = false
                                Toast.makeText(context, "Password Salah!", Toast.LENGTH_SHORT).show()
                            }
                        }
                    }
                }.addOnFailureListener {
                    isLoading.value = false
                    Toast.makeText(context, "Gagal koneksi ke server", Toast.LENGTH_SHORT).show()
                }
            },
            modifier = Modifier.fillMaxWidth().height(50.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
            enabled = !isLoading.value
        ) {
            Text(if (isLoading.value) "Memproses..." else "Masuk", color = Color.White, fontWeight = FontWeight.Bold)
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Teks Daftar Sekarang Sesuai Figma
        Text(
            text = buildAnnotatedString {
                append("Belum mendaftar Pasien? ")
                withStyle(style = SpanStyle(textDecoration = TextDecoration.Underline, color = Color.Black, fontWeight = FontWeight.Medium)) {
                    append("Daftar Sekarang")
                }
            },
            fontSize = 12.sp,
            color = Color.Gray,
            modifier = Modifier.clickable {
                navController.navigate("register_pasien/$kodeRs")
            }
        )
    }
}