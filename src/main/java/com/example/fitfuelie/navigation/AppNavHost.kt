package com.example.fitfuelie.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavHostController
import com.example.fitfuelie.ui.*

//draws Ui
@Composable
fun AppNavHost(navController: NavHostController) {

    NavHost( //watches navController state
        navController = navController,
        startDestination = NavRoutes.Onboarding.route // shows Onboarding screen first
    ) {
        composable(NavRoutes.Onboarding.route) {
            OnboardingScreen() // shows screen
        }
        composable(NavRoutes.Home.route) {
            HomeScreen()
        }
        composable(NavRoutes.Detail.route) {
            DetailScreen()
        }
        composable(NavRoutes.AddEdit.route) {
            AddEditScreen()
        }
        composable(NavRoutes.Settings.route) {
            SettingsScreen()
        }
    }
}


