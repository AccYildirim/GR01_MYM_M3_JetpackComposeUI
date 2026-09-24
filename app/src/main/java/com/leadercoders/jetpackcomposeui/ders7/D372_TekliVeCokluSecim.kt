package com.leadercoders.jetpackcomposeui.ders7

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun D372_TekliVeCokluSecim() {
    // Çoklu Seçim -> Checkbox
    var mantar by remember { mutableStateOf(false) }
    var sucuk by remember { mutableStateOf(false) }
    var misir by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = mantar,
                onCheckedChange = { mantar = it }
            )
            Text("Mantar Ekle")
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = sucuk,
                onCheckedChange = { sucuk = it }
            )
            Text("Sucuk Ekle")
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = misir,
                onCheckedChange = { misir = it }
            )
            Text("Mısır Ekle")
        }

        Spacer(modifier = Modifier.height(40.dp))

        // Tekli Seçim -> RadioButton
        var seciliHamur by remember { mutableStateOf("İnce") }


        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = seciliHamur == "İnce",
                onClick = { seciliHamur = "İnce" }
            )
            Text("İnce Hamur")
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = seciliHamur == "Kalın",
                onClick = { seciliHamur = "Kalın" }
            )
            Text("Kalın Hamur")
        }

    }
}