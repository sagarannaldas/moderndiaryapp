package com.sagarannaldas.moderndiaryapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.sagarannaldas.mylibrary.theme.ModernDiaryAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ModernDiaryAppTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Text(text = "Hello World!")
                }
            }
        }
    }
}
