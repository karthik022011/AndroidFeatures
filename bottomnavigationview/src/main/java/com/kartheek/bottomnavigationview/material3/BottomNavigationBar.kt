package com.kartheek.bottomnavigationview.material3

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.kartheek.bottomnavigationview.screens.Screen1
import com.kartheek.bottomnavigationview.screens.Screen2
import com.kartheek.bottomnavigationview.screens.Screen3

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomNavigationBar() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

        Scaffold(
            bottomBar = {
                NavigationBar {
                    BottomNavigationItem().bottomNavigationItems()
                        .forEachIndexed { _, navigationItem ->
                            NavigationBarItem(
                                selected = navigationItem.route == currentDestination?.route,
                                label = {
                                    Text(navigationItem.label)
                                },
                                icon = {
                                    Icon(
                                        navigationItem.icon,
                                        contentDescription = navigationItem.label
                                    )
                                },
                                onClick = {
                                    navController.navigate(navigationItem.route) {
                                        popUpTo(navController.graph.findStartDestination().id) {
                                            saveState = true
                                        }
                                        launchSingleTop = true
                                        restoreState = true
                                    }
                                }
                            )
                        }
                }
            }
        ){paddingValues ->
            NavHost(
                navController = navController,
                startDestination = Routes.Home.route,
                modifier = Modifier.padding(paddingValues = paddingValues)) {
                composable(Routes.Home.route) {
                    //call our composable screens here
                    Screen1(
                        navController
                    )
                }
                composable(Routes.Search.route) {
                    //call our composable screens here
                    Screen3(
                        navController
                    )
                }
                composable(Routes.Profile.route) {
                    //call our composable screens here
                    Screen2(
                        navController
                    )
                }
            }
        }
    }