package com.leadercoders.jetpackcomposeui.ders2

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun D322_TemelDizilimler() {
    Column(
        modifier = Modifier
            .background(color = Color.LightGray)
            .border(width = 2.dp, color = Color.Red)
            .fillMaxSize()
            .padding(all = 24.dp)
    ) {
        Text("\uD83D\uDC64")
        Text("Ali Yılmaz")
        Text("Android Geliştirici")

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier
                .background(color = Color(0xFFFFFFFF))
                .border(width = 2.dp, color = Color.Green)
                .fillMaxWidth()
                .padding(vertical = 20.dp)
        ) {
            Text("Takipçi: 500")
            Spacer(modifier = Modifier.weight(1f))
            Text("Takip Edilen: 120")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Box(
            modifier = Modifier
                .background(color = Color.White)
                .border(width = 2.dp, color = Color.Blue)
                .width(100.dp)
                .height(100.dp)
                .padding(top = 20.dp, start = 20.dp)
        ) {
            Text("\uD83D\uDFE5")
            Text("Beğen")

            Spacer(modifier = Modifier.height(20.dp))
        }
    }


}