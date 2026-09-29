package com.leadercoders.jetpackcomposeui.ders9

import androidx.compose.foundation.layout.Box
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun D394_DropDownMenu() {
    var menuAcikMi by remember() { mutableStateOf(false) }

    Box() {
        IconButton(onClick = { menuAcikMi = true }) {
            Icon(imageVector = Icons.Default.MoreVert, contentDescription = "Açılır Menü")
        }

        DropdownMenu(
            expanded = menuAcikMi,
            onDismissRequest = { menuAcikMi = false }
        ) {
            DropdownMenuItem(
                text = { Text("Ayarlar") },
                onClick = { menuAcikMi = false }
            )

            DropdownMenuItem(
                text = { Text("Çıkış Yap") },
                onClick = { menuAcikMi = false }
            )
        }

    }
}