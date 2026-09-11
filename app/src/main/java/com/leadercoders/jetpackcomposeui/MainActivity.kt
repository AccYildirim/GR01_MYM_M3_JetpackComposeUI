package com.leadercoders.jetpackcomposeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.leadercoders.jetpackcomposeui.ders1.SelamlamaEkrani
import com.leadercoders.jetpackcomposeui.ders2.D322_TemelDizilimler
import com.leadercoders.jetpackcomposeui.ders2.D326_ProfilKarti
import com.leadercoders.jetpackcomposeui.ders2.UrunDetayKarti
import com.leadercoders.jetpackcomposeui.ders3.D332_TextBileseni
import com.leadercoders.jetpackcomposeui.ders3.D333_ButonCesitleri
import com.leadercoders.jetpackcomposeui.ui.theme.GR01_MYM_M3_JetpackComposeUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GR01_MYM_M3_JetpackComposeUITheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
 //                               DERS-1
 //                           SelamlamaEkrani()

 //                               DERS-2
 //                           D322_TemelDizilimler()
 //                           D326_ProfilKarti()

 //                               Alıştırma
 //                           UrunDetayKarti()

 //                               DERS-3
                       D332_TextBileseni()
 //                           D333_ButonCesitleri()


                    }
                }
            }
        }
    }
}

