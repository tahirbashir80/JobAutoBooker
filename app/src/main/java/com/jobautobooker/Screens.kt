package com.jobautobooker

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jobautobooker.ui.theme.*

@Composable
fun OverviewScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize().background(BackgroundNavy).padding(16.dp)) {
        Text("Operations Overview", color = PrimaryTeal, fontWeight = FontWeight.Bold, fontSize = 12.sp)
        Spacer(modifier = Modifier.height(8.dp))
        
        Card(colors = CardDefaults.cardColors(containerColor = SurfaceNavy), shape = RoundedCornerShape(12.dp)) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("Today's Schedule", color = TextPrimary, fontWeight = FontWeight.Bold)
                Text("2 Jobs Scheduled", color = TextSecondary, fontSize = 12.sp)
            }
        }
    }
}

@Composable
fun JobsScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize().background(BackgroundNavy).padding(16.dp)) {
        Text("Jobs", color = TextPrimary, fontWeight = FontWeight.Bold, fontSize = 24.sp)
    }
}

@Composable
fun PassengersScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize().background(BackgroundNavy).padding(16.dp)) {
        Text("Allowed Passengers", color = TextPrimary, fontWeight = FontWeight.Bold, fontSize = 24.sp)
    }
}

@Composable
fun SmsFeedScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize().background(BackgroundNavy).padding(16.dp)) {
        Text("Real-Time SMS Audit Trail", color = TextPrimary, fontWeight = FontWeight.Bold, fontSize = 24.sp)
    }
}

@Composable
fun SettingsScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize().background(BackgroundNavy).padding(16.dp)) {
        Text("Settings", color = TextPrimary, fontWeight = FontWeight.Bold, fontSize = 24.sp)
    }
}
