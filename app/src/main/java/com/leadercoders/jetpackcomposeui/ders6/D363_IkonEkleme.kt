package com.leadercoders.jetpackcomposeui.ders6

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.ReplayCircleFilled
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun D363_IkonEkleme() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Icon(
            imageVector = Icons.Default.ReplayCircleFilled,
            contentDescription = "Beğen",
            tint = Color.Red,
            modifier = Modifier.size(48.dp)
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("E-Postanızı yazın") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Eposta",
                    tint = Color.Gray
                )
            },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Info,
                    contentDescription = "Beğen",
                    tint = Color.LightGray
                )
            }
        )
    }
}