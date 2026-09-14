package com.leadercoders.jetpackcomposeui.ders3

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun D336_GununSozu() {

    Column(
        modifier = Modifier
            .background(Color(0xFFF9FAFB))
            .padding(all = 24.dp)
    ) {
        Column(
            modifier = Modifier
                .background(Color.White)
                .border(1.dp, Color.LightGray, shape = RoundedCornerShape(12.dp))
                .padding(24.dp)
        ) {
            Text(
                text = "✨ Günün Sözü",
                color = Color(0xFFD946EF),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Dün zekiydim, dünyayı değiştirmek isterdim. Bugün bilgeyim, kendimi değiştiriyorum.",
                fontSize = 24.sp,
                fontStyle = FontStyle.Italic,
                lineHeight = 32.sp
            )
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Mevlana Celaleddin-i Rumi’ye atfedilen bu harika söz, değişimin önce insanın kendi içinde başlaması gerektiğini anlatır. Kişisel gelişimin en temel kuralıdır.",
                fontSize = 14.sp,
                color = Color.DarkGray,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "- Mevlana",
                color = Color.Gray,
                fontSize = 16.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.End

            )

            HorizontalDivider(
                thickness = 1.dp,
                color = Color(0xFFE5E7EB),
                modifier = Modifier.padding(vertical = 20.dp)
            )
            Box(
                modifier = Modifier
                    .clickable {}
                    .background(Color(0xFFF1F5F9), shape = RoundedCornerShape(8.dp))
                    .padding(12.dp)
            ) {
                Text(
                    text = "❤\uFE0F 124 Beğeni (Tıklamak için dokunun)",
                    color = Color.Gray,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.height(16.dp))

            Row() {
                TextButton(onClick = {}) {
                    Text(text = "Kaydet")

                }

                Spacer(modifier = Modifier.weight(1f))

                OutlinedButton(onClick = {}) {
                    Text(text = "Kopyala")
                }
            }
            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Paylaş")
            }


        }


    }

}