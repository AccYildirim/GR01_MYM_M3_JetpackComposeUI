package com.leadercoders.jetpackcomposeui.ders10


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Proje_TeknolojiKatalogu() {
    val tumUrunler = listOf(
        Urun(
            1,
            "Kablosuz Kulaklık X-Pro",
            "Aktif gürültü engelleme, 24 saat şarj",
            1450.0,
            4.8,
            true
        ),
        Urun(2, "Akıllı Saat S3", "Nabız ölçer, su geçirmez, çelik kordon", 2100.0, 4.5, true),
        Urun(3, "Mekanik Klavye K1", "RGB aydınlatmalı, kırmızı switch", 850.0, 4.2, false),
        Urun(4, "Oyuncu Faresi M4", "10000 DPI, ergonomik tasarım", 450.0, 4.7, false),
        Urun(5, "Tablet 10 inç", "64 GB hafıza, 8 GB RAM", 3200.0, 4.9, true)
    )
    var kargoBedavaFiltresi by remember { mutableStateOf(false) }
    var menuAcikMi by remember { mutableStateOf(false) }
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Teknoloji Kataloğu") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF2563EB),
                    titleContentColor = Color.White,
                    actionIconContentColor = Color.White
                ),
                actions = {
                    Box() {
                        IconButton(onClick = {}) {
                            Icon(
                                imageVector = Icons.Default.MoreVert,
                                contentDescription = "Ayarlar"
                            )
                        }
                        DropdownMenu(
                            onDismissRequest = { menuAcikMi = false },
                            expanded = menuAcikMi
                        ) {
                            DropdownMenuItem(
                                text = { Text("Hakkımızda") },
                                onClick = { menuAcikMi = false })
                            DropdownMenuItem(
                                text = { Text("İletişim") },
                                onClick = { menuAcikMi = false })
                        }
                    }
                }
            )
        }
    ) { icBosluklar ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFFF3F4F6))
                .padding(icBosluklar),

            ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(0.dp),
                elevation = CardDefaults.cardElevation(2.dp),
                colors = CardDefaults.cardColors(Color.White)
            ) {
                Row(modifier = Modifier.padding(24.dp)) {
                    Text("Sadece Kargo Bedava Ürünler")
                    Switch(
                        checked = kargoBedavaFiltresi,
                        onCheckedChange = { kargoBedavaFiltresi = it })
                }
            }



            LazyColumn(modifier = Modifier, contentPadding = PaddingValues(12.dp)) {
                items(tumUrunler) { urun ->
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        shape = RoundedCornerShape(12.dp),
                        elevation = CardDefaults.cardElevation(4.dp),
                    ) {
                        Column() {
                            Row() {
                                Row() {

                                }
                            }

                            Row() {
                                Button(onClick = {}) {

                                }
                            }
                        }
                    }
                }

            }
        }
    }
}