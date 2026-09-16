package com.leadercoders.jetpackcomposeui.ders4

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BizeUlasinFormu() {
    var ad by rememberSaveable { mutableStateOf("") }
    var eposta by rememberSaveable { mutableStateOf("") }
    var telefon by rememberSaveable { mutableStateOf("") }
    var mesaj by rememberSaveable { mutableStateOf("") }
    var mesajGonderildi by rememberSaveable { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Text(text = "Bize Ulaşın", fontSize = 28.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField( //Ad kutusu
            value = ad,
            onValueChange = { ad = it },
            label = { Text("Adınız Soyadınız") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Next
            ),
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField( //E-Posta kutusu
            value = eposta,
            onValueChange = { eposta = it },
            label = { Text("E-Posta Adresiniz") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Next
            ),
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField( //Telefon kutusu
            value = telefon,
            onValueChange = { telefon = it },
            label = { Text("Telefon Numaranız") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Next
            ),
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField( //Mesaj kutusu
            value = mesaj,
            onValueChange = { mesaj = it },
            label = { Text("Mesajınız") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            ),
            singleLine = false,
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                if (ad.isNotEmpty() && eposta.isNotEmpty() && telefon.isNotEmpty() && mesaj.isNotEmpty()) {
                    mesajGonderildi = true
                }
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4BAF50))
        ) {
            Text(text = "Gönder", fontSize = 16.sp)
        }
        if (mesajGonderildi) {
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Mesajınız başarıyla gönderildi",
                color = Color(0xFF4BAF50),
                fontWeight = FontWeight.Bold
            )
        }


    }
}