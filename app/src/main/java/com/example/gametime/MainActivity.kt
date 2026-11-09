package com.example.gametime

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.gametime.Landing.LandingScreen
import com.example.gametime.Landing.Side.SideMenu

import com.example.gametime.ui.theme.GameTimeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GameTimeTheme {
                SideMenu()
            }
        }
    }
}

