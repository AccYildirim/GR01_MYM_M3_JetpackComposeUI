package com.leadercoders.jetpackcomposeui.ders7

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BrightnessMedium
import androidx.compose.material.icons.filled.Language
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Wifi
import androidx.compose.material3.Checkbox
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Slider
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun D376_AyarlarSayfasi() {
    var wifiAcik by remember { mutableStateOf(true) }
    var bildirimler by remember { mutableStateOf(true) }
    var parlaklik by remember { mutableStateOf(50f) }
    var seciliDil by remember { mutableStateOf("Türkçe") }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
            .background(color = Color(0xFFF4F4F9))
    ) {
        Text(text = "Ayarlar", fontSize = 28.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.padding(16.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Wifi,
                contentDescription = "Wifi",
                tint = Color(0xFF6200EE),

                )
            Spacer(modifier = Modifier.width(16.dp))

            Text(text = "Wi-Fi Bağlantısı", fontSize = 18.sp)

            Spacer(modifier = Modifier.weight(1f))

            Switch(
                checked = wifiAcik,
                onCheckedChange = { wifiAcik = it }
            )
        }

        HorizontalDivider(modifier = Modifier.padding(16.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Notifications,
                contentDescription = "Bildirim",
                tint = Color(0xFF6200EE),

                )
            Spacer(modifier = Modifier.width(16.dp))

            Text(text = "Uygulama Bildirimleri", fontSize = 18.sp)

            Spacer(modifier = Modifier.weight(1f))

            Checkbox(
                checked = bildirimler,
                onCheckedChange = { bildirimler = it }
            )
        }

        HorizontalDivider(modifier = Modifier.padding(16.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.BrightnessMedium,
                contentDescription = "Parlaklık",
                tint = Color(0xFF6200EE),

                )
            Spacer(modifier = Modifier.width(16.dp))

            Text(text = "Ekran Parlaklığı", fontSize = 18.sp)

        }
        Slider(
            value = parlaklik,
            onValueChange = { parlaklik = it },
            valueRange = 0f..100f,
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        HorizontalDivider(modifier = Modifier.padding(16.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Language,
                contentDescription = "Dil",
                tint = Color(0xFF6200EE),

                )
            Spacer(modifier = Modifier.width(16.dp))

            Text(text = "Uygulama Dili", fontSize = 18.sp)
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = seciliDil == "Türkçe",
                    onClick = { seciliDil = "Türkçe" }
                )
                Text("Türkçe")
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = seciliDil == "English",
                    onClick = { seciliDil = "English" }
                )
                Text("English")
            }
        }

    }
}