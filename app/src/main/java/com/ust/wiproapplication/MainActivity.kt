package com.example.wiproapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint
import com.example.wiproapplication.ui.screen.HomeScreen
import com.example.wiproapplication.ui.theme.WiproApplicationTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            WiproApplicationTheme {
                HomeScreen()
            }
        }
    }
}