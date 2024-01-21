package com.sagarannaldas.moderndiaryapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.sagarannaldas.mylibrary.auth.authNavGraph
import com.sagarannaldas.mylibrary.auth.authRoute

@Composable
fun ModernDiaryAppNavHost(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = authRoute) {

        authNavGraph(
            navController = navHostController,
            onAuthSuccess = {}
            )
    }
}