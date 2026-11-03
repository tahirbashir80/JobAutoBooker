package com.jobautobooker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.jobautobooker.ui.theme.BackgroundNavy

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            androidx.compose.foundation.layout.Box(modifier = Modifier.fillMaxSize().background(BackgroundNavy)) {
                App()
            }
        }
    }
}
