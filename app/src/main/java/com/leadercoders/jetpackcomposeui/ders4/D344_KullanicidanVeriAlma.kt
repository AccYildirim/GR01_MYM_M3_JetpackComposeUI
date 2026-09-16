package com.leadercoders.jetpackcomposeui.ders4

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun D344_KullanicidanVeriAlma() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        var isim by rememberSaveable { mutableStateOf("") }
        var yas by rememberSaveable { mutableStateOf("") }
        var eposta by rememberSaveable { mutableStateOf("") }
        var sifre by rememberSaveable { mutableStateOf("") }

        TextField(
            value = isim,
            onValueChange = { isim = it },
            label = { Text("Ad Soyad") },
            placeholder = { Text("Adınızı ve Soyadınızı giriniz...") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Next
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = yas,
            onValueChange = { yas = it },
            label = { Text("Yaşınız") },
            placeholder = { Text("Yaşınızı giriniz...") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Next
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = eposta,
            onValueChange = { eposta = it },
            label = { Text("E-Posta adresi") },
            placeholder = { Text("E-Posta adresinizi giriniz...") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Next
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = sifre,
            onValueChange = { sifre = it },
            label = { Text("Şifreniz") },
            placeholder = { Text("Şifrenizi giriniz...") },
            singleLine = true,
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done
            )
        )

    }
}