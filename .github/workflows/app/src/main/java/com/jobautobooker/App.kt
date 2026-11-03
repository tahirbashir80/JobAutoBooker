package com.jobautobooker

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Dashboard
import androidx.compose.material.icons.filled.DirectionsCar
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Sms
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import com.jobautobooker.ui.theme.*

sealed class Screen(val route: String, val title: String, val icon: ImageVector) {
    object Overview : Screen("overview", "Overview", Icons.Default.Dashboard)
    object Jobs : Screen("jobs", "Jobs", Icons.Default.DirectionsCar)
    object Passengers : Screen("passengers", "Passengers", Icons.Default.People)
    object SmsFeed : Screen("sms", "SMS Feed", Icons.Default.Sms)
    object Settings : Screen("settings", "Settings", Icons.Default.Settings)
}

@Composable
fun App() {
    JobAutoBookerTheme {
        var currentScreen by remember { mutableStateOf<Screen>(Screen.Overview) }

        Scaffold(
            bottomBar = {
                NavigationBar(containerColor = SurfaceNavy) {
                    val items = listOf(Screen.Overview, Screen.Jobs, Screen.Passengers, Screen.SmsFeed, Screen.Settings)
                    items.forEach { screen ->
                        NavigationBarItem(
                            icon = { Icon(screen.icon, contentDescription = screen.title) },
                            label = { Text(screen.title, color = if (currentScreen == screen) PrimaryTeal else TextSecondary) },
                            selected = currentScreen == screen,
                            onClick = { currentScreen = screen },
                            colors = NavigationBarItemDefaults.colors(
                                selectedIconColor = PrimaryTeal,
                                indicatorColor = SurfaceNavy
                            )
                        )
                    }
                }
            }
        ) { paddingValues ->
            when (currentScreen) {
                Screen.Overview -> OverviewScreen(Modifier.padding(paddingValues))
                Screen.Jobs -> JobsScreen(Modifier.padding(paddingValues))
                Screen.Passengers -> PassengersScreen(Modifier.padding(paddingValues))
                Screen.SmsFeed -> SmsFeedScreen(Modifier.padding(paddingValues))
                Screen.Settings -> SettingsScreen(Modifier.padding(paddingValues))
            }
        }
    }
}
