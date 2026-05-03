package com.rahmat.mentalhealthcare

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.firebase.auth.FirebaseAuth
import com.rahmat.mentalhealthcare.ui.theme.TextPrimaryDark
import com.rahmat.mentalhealthcare.ui.theme.TextSecondaryGray

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginPetugasScreen(navController: NavController) {
    var idUser by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }
    var isLoading by remember { mutableStateOf(false) }

    val context = LocalContext.current
    val auth = FirebaseAuth.getInstance()
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(scrollState)
            .padding(horizontal = 32.dp, vertical = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(80.dp))

        // Logo Proporsional
        Image(
            painter = painterResource(id = R.drawable.logo_rsi),
            contentDescription = "Logo RSIJ",
            modifier = Modifier.size(130.dp)
        )

        Spacer(modifier = Modifier.height(40.dp))

        // Teks Header
        Column(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Selamat Datang kembali",
                fontSize = 24.sp,
                fontWeight = FontWeight.Medium,
                color = TextPrimaryDark
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "Masukkan ID User dan kata sandi akun anda.",
                fontSize = 12.sp,
                color = TextSecondaryGray
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Input ID User pakai CUSTOM ICON FIGMA
        TextField(
            value = idUser,
            onValueChange = { idUser = it },
            placeholder = { Text("ID User", color = TextSecondaryGray, fontSize = 14.sp) },
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_user),
                    contentDescription = "Ikon User",
                    tint = TextSecondaryGray,
                    modifier = Modifier.size(24.dp)
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            shape = RoundedCornerShape(12.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color(0xFFF3F4F6),
                unfocusedContainerColor = Color(0xFFF3F4F6),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                cursorColor = Color.Black
            ),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Input Password
        TextField(
            value = password,
            onValueChange = { password = it },
            placeholder = { Text("Password", color = TextSecondaryGray, fontSize = 14.sp) },
            leadingIcon = {
                // PAKAI CUSTOM ICON LOCK FIGMA LU
                Icon(
                    painter = painterResource(id = R.drawable.ic_lock),
                    contentDescription = "Ikon Lock",
                    tint = TextSecondaryGray,
                    modifier = Modifier.size(24.dp)
                )
            },
            trailingIcon = {
                // 👉 BALIK KE ICON BAWAAN ANDROID (TIDAK PERLU DRAWABLE FIGMA)
                val image = if (passwordVisible) Icons.Outlined.Visibility else Icons.Outlined.VisibilityOff
                IconButton(onClick = { passwordVisible = !passwordVisible }) {
                    Icon(imageVector = image, contentDescription = "Toggle Password", tint = TextSecondaryGray)
                }
            },
            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            shape = RoundedCornerShape(12.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color(0xFFF3F4F6),
                unfocusedContainerColor = Color(0xFFF3F4F6),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                cursorColor = Color.Black
            ),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Tombol Masuk
        Button(
            onClick = {
                if (idUser.isNotEmpty() && password.isNotEmpty()) {
                    isLoading = true
                    val emailLogin = "$idUser@rssukapura.com"
                    auth.signInWithEmailAndPassword(emailLogin, password)
                        .addOnCompleteListener { task ->
                            isLoading = false
                            if (task.isSuccessful) {
                                Toast.makeText(context, "Login Berhasil", Toast.LENGTH_SHORT).show()
                                navController.navigate("dashboard_petugas") {
                                    popUpTo("login_petugas") { inclusive = true }
                                }
                            } else {
                                Toast.makeText(context, "ID atau Password Salah!", Toast.LENGTH_SHORT).show()
                            }
                        }
                } else {
                    Toast.makeText(context, "Harap isi ID dan Password", Toast.LENGTH_SHORT).show()
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
            enabled = !isLoading
        ) {
            Text(
                text = if (isLoading) "Memproses..." else "Masuk",
                color = Color.White,
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp
            )
        }

        Spacer(modifier = Modifier.height(32.dp))
    }
}