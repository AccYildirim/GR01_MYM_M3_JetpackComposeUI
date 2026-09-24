package com.leadercoders.jetpackcomposeui.ders7

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.leadercoders.jetpackcomposeui.R


@Composable
fun D375_PizzaSiparisEkrani() {
    var seciliBoyut by remember { mutableStateOf("Küçük") }
    var mantarEkle by remember { mutableStateOf(false) }
    var sucukEkle by remember { mutableStateOf(false) }
    var misirEkle by remember { mutableStateOf(false) }
    var hamurKalinligi by remember { mutableStateOf(2f) }
    var zileBasma by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFFDFDFD))
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Image(
            painter = painterResource(R.drawable.pizza_resmi),
            contentDescription = "Pizza Görseli",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(16.dp)),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.padding(12.dp))

        Text(
            text = "Kendi Pizzanı Oluştur",
            color = Color(0xFFE65100),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.padding(8.dp))

        Text(text = "Pizza Boyutu", fontSize = 18.sp, fontWeight = FontWeight.Bold)

        Row() {

            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = seciliBoyut == "Küçük",
                    onClick = { seciliBoyut = "Küçük" }
                )
                Text("Küçük")
            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = seciliBoyut == "Orta",
                    onClick = { seciliBoyut = "Orta" }
                )
                Text("Orta")
            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = seciliBoyut == "Büyük",
                    onClick = { seciliBoyut = "Büyük" }
                )
                Text("Büyük")
            }
        }

        Spacer(modifier = Modifier.padding(8.dp))

        Text(text = "Ekstra Malzemeler", fontSize = 18.sp, fontWeight = FontWeight.Bold)

        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = mantarEkle,
                onCheckedChange = { mantarEkle = it }
            )
            Text("Mantar")
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = sucukEkle,
                onCheckedChange = { sucukEkle = it }
            )
            Text("Sucuk")
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = misirEkle,
                onCheckedChange = { misirEkle = it }
            )
            Text("Mısır")
        }

        Spacer(modifier = Modifier.padding(8.dp))

        Text(
            text = "Hamur Kalınlığı: ${
                if (hamurKalinligi == 1f) "İnce"
                else if (hamurKalinligi == 2f) "Normal"
                else "Kalın"
            }",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        Slider(
            value = hamurKalinligi,
            onValueChange = { hamurKalinligi = it },
            valueRange = 1f..3f,
            steps = 1

        )

        Spacer(modifier = Modifier.padding(8.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("Temassız Teslimat (Zili Çalma)", fontSize = 18.sp, fontWeight = FontWeight.Bold)

            Spacer(modifier = Modifier.weight(1f))

            Switch(
                checked = zileBasma,
                onCheckedChange = { zileBasma = it }
            )
        }

        Spacer(modifier = Modifier.padding(8.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color(0xFFE65100)),
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        ) {
            Text(text = "Siparişi Onayla", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        }
    }
}