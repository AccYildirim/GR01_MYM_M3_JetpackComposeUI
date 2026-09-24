package com.leadercoders.jetpackcomposeui.ders5


import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.TextButton
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Proje_KullaniciKayitEkrani() {
    var adSoyad by rememberSaveable { mutableStateOf("") }
    var eposta by rememberSaveable { mutableStateOf("") }
    var sifre by rememberSaveable { mutableStateOf("") }
    var yas by rememberSaveable { mutableStateOf("") }
    var mesajGonderildi by rememberSaveable { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .background(color = Color(0xFFF8F9FA))
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Box(
            modifier = Modifier
                .background(color = Color(0xFF2196F3), shape = RoundedCornerShape(12.dp))
                .fillMaxWidth()
                .border(width = 1.dp, color = Color.White, shape = RoundedCornerShape(12.dp))
                .padding(16.dp)

        ) {
            Column() {
                Text(
                    text = "Aramıza Katılın!",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(13.dp))

                Text(
                    text = "Lütfen bilgilerinizi eksiksiz doldurun.",
                    fontSize = 14.sp,
                    color = Color(0xFFE3F2FD),
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )

            }

        }

        Spacer(modifier = Modifier.height(32.dp))

        OutlinedTextField(
            value = adSoyad,
            onValueChange = { adSoyad = it },
            label = { Text("Ad Soyad") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Next
            ),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = eposta,
            onValueChange = { eposta = it },
            label = { Text("E-Posta Adresi") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Next
            ),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = sifre,
            onValueChange = { sifre = it },
            label = { Text("Şifre") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Next
            ),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = yas,
            onValueChange = { yas = it },
            label = { Text("Yaşınız") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = {
                if (adSoyad.isNotEmpty() && eposta.isNotEmpty() && sifre.isNotEmpty() && yas.isNotEmpty()) {
                    mesajGonderildi = true
                }
            },
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50))
        ) {
            Text(text = "Hesap Oluştur", fontSize = 18.sp, fontWeight = FontWeight.Bold)
        }

        Spacer(modifier = Modifier.height(16.dp))

        if (mesajGonderildi) {
            Text(
                text = "Tebrikler! Hesabınız başarıyla oluşturuldu.",
                color = Color(0xFF388E3C),
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(50.dp))

        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(16.dp)) {
            Text(text = "Zaten hesabınız var mı?", color = Color.Gray, fontSize = 16.sp)

            TextButton(
                onClick = {}, Modifier.padding()
            ) { Text(text = "Giriş yap", color = Color(0xFF2196F3), fontSize = 16.sp) }
        }
    }
}