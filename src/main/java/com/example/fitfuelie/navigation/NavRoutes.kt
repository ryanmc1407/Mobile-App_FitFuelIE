package com.example.fitfuelie.navigation

//define my navigation routes in a type-safe way
sealed class NavRoutes(val route: String) { // has string used by navigation
    object Onboarding : NavRoutes("onboarding")
    object Home : NavRoutes("home")
    object Detail : NavRoutes("detail" )
    object AddEdit : NavRoutes("add_edit")
    object Settings : NavRoutes("settings")
}