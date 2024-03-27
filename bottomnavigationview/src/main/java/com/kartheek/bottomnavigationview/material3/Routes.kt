package com.kartheek.bottomnavigationview.material3

sealed class Routes(val route : String) {
    object Home : Routes("home_screen")
    object Search : Routes("search_screen")
    object Profile : Routes("profile_screen")
}