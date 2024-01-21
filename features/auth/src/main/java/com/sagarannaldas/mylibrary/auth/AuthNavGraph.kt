package com.sagarannaldas.mylibrary.auth

import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.sagarannaldas.mylibrary.auth.login.LoginScreen
import com.sagarannaldas.mylibrary.auth.splash.SplashScreen

const val authRoute = "auth"

sealed class AuthScreen(val route: String) {
    data object Splash: AuthScreen("$authRoute/splash")
    data object Login: AuthScreen("$authRoute/login")
    data object Signup: AuthScreen("$authRoute/signup")
}

fun NavGraphBuilder.authNavGraph(
    onAuthSuccess: () -> Unit,
    navController: NavController
) {
    navigation(startDestination = AuthScreen.Splash.route, route = authRoute) {

        composable(AuthScreen.Splash.route) {
            SplashScreen()
            navController.navigate(AuthScreen.Login.route)
        }

        composable(AuthScreen.Login.route) {
            LoginScreen(viewModel())
        }
    }
}