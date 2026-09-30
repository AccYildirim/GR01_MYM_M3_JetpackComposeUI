package com.leadercoders.jetpackcomposeui.ders8

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun D384_DinamikListeUretimi() {
    val gorevler = listOf(
        "Kahvaltı et",
        "Market alışverişi yap",
        "Faturaları öde",
        "Kediyi besle",
        "Spora git"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            item {
                Text("Yapılacaklar Listesi")
            }

            items(gorevler) { gorev ->
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.cardColors(Color(0xFF75C4C2))
                ) {
                    Text(gorev, modifier = Modifier.padding(12.dp), fontWeight = FontWeight.Medium)
                }
            }
        }
    }
}