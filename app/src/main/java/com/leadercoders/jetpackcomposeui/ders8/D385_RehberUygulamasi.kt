package com.leadercoders.jetpackcomposeui.ders8

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Alignment

@Composable
fun D385_RehberUygulamasi() {
    val kisilerListesi = listOf(
        Kisi("Ahmet Yılmaz", "0532 123 45 67"),
        Kisi("Ayşe Demir", "0555 987 65 43"),
        Kisi("Mehmet Kaya", "0505 111 22 33"),
        Kisi("Fatma Şahin", "0544 444 55 66"),
        Kisi("Ali Çelik", "0533 777 88 99"),
        Kisi("Zeynep Yıldız", "0542 333 44 55"),
        Kisi("Mustafa Öztürk", "0554 999 88 77"),
        Kisi("Hatice Doğan", "0506 222 33 44"),
        Kisi("Ömer Arslan", "0535 555 66 77"),
        Kisi("Emine Kılıç", "0543 888 99 00"),
        Kisi("Hüseyin Çetin", "0532 222 11 00"),
        Kisi("Merve Tekin", "0555 333 22 11"),
        Kisi("Hasan Polat", "0505 444 33 22"),
        Kisi("Esra Gür", "0544 555 44 33"),
        Kisi("Kemal Can", "0533 666 55 44")
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF3F4F6))
            .padding(24.dp)
    ) {
        Text(
            text = "Rehber",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1F2937),
            modifier = Modifier.padding(bottom = 16.dp)
        )

        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            //contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(kisilerListesi) { kisi ->
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.cardColors(Color.White),
                    elevation = CardDefaults.cardElevation(2.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp, horizontal = 16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .background(Color(0xFFE0E7FF), CircleShape)
                                .size(50.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.Person,
                                contentDescription = "Profil Resmi",
                                tint = Color(0xFF4F46E5),
                                modifier = Modifier.size(30.dp)
                            )
                        }

                        Column(
                            modifier = Modifier
                                .weight(1f)
                                .padding(12.dp)
                        ) {
                            Text(
                                text = kisi.isim,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF111827)
                            )

                            Text(
                                text = kisi.telefon,
                                fontSize = 14.sp,
                                color = Color(0xFF6B7280)
                            )
                        }

                        IconButton(onClick = {}) {
                            Icon(
                                imageVector = Icons.Default.Call,
                                contentDescription = "Telefon İkonu",
                                tint = Color(0xFF10B981)
                            )
                        }
                    }
                }
            }

        }
    }
}