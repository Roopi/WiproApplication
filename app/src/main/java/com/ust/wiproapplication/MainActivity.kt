package com.ust.wiproapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ust.wiproapplication.ui.screen.HomeScreen
import com.ust.wiproapplication.ui.theme.WiproApplicationTheme
import dagger.hilt.android.AndroidEntryPoint


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