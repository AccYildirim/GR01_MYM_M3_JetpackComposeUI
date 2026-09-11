package com.leadercoders.jetpackcomposeui.ders3

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.unit.dp

@Composable
fun D333_ButonCesitleri() {
    Column(modifier = Modifier.padding(24.dp)) {
        //Dolu buton
        Button(onClick = { println("Sepete Ekle butonuna basıldı.") }) {
            Text("Sepete Ekle")
        }

        HorizontalDivider(
            thickness = 1.dp,
            color = Color.Blue,
            modifier = Modifier.padding(vertical = 16.dp)
        )

        //Çerçeveli buton
        OutlinedButton(onClick = { println("İptal Et butonuna basıldı.") }) {
            Text("İptal Et")
        }

        Spacer(modifier = Modifier.padding(20.dp))

        //Metin Butonu
        TextButton(onClick = {}) {
            Text("Şifremi unuttum!")
        }

        Spacer(modifier = Modifier.padding(20.dp))

        Row(modifier = Modifier.fillMaxWidth()) {
            OutlinedButton(
                onClick = {},
                modifier = Modifier.weight(1f)
            ) {
                Text("Vazgeç")
            }

            Button(
                onClick = {},
                modifier = Modifier.weight(1f)
            ) {
                Text("Onayla")
            }
        }

        Spacer(modifier = Modifier.weight(1f))

        //Tam genişlikte renkli buton
        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE91E63))
        ) {
            Text("Tam Genişlikte Buton")
        }
    }
}