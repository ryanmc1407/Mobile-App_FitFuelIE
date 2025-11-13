package com.example.fitfuelie

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.fitfuelie.ui.theme.FitFuelIETheme

class MainActivity : ComponentActivity() {
    // start up function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // Everything on screen goes inside here
        setContent {
            FitFuelIETheme {
                FitFuelIEApp()
            }
        }
    }
}


