package com.jobautobooker.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = PrimaryTeal,
    background = BackgroundNavy,
    surface = SurfaceNavy,
    onPrimary = BackgroundNavy,
    onBackground = TextPrimary,
    onSurface = TextPrimary,
    secondary = WarningOrange,
    error = DangerRed
)

@Composable
fun JobAutoBookerTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = DarkColorScheme,
        content = content
    )
}
