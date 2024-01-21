package com.sagarannaldas.mylibrary.auth.splash

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.sagarannaldas.mylibrary.auth.R
import com.sagarannaldas.mylibrary.theme.ModernDiaryAppTheme
import com.sagarannaldas.mylibrary.theme.components.ModernDiaryAppPreview

@Composable
fun SplashScreen() {
    Splash()
}

@Composable
fun Splash() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Icon(
            painter = painterResource(id = R.drawable.mini_tales),
            contentDescription = "mini tales"
        )
    }
}

@ModernDiaryAppPreview
@Composable
private fun SplashPreview() {
    ModernDiaryAppTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            Splash()
        }
    }
}