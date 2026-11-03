package com.awd.teledrive.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun TeledriveTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    primaryColor: Color = Color(0xFF38BDF8),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) {
        darkColorScheme(
            primary = primaryColor,
            onPrimary = Color.White,
            primaryContainer = primaryColor.copy(alpha = 0.3f),
            onPrimaryContainer = Color.White,
            secondary = primaryColor.copy(alpha = 0.7f),
            onSecondary = Color.White,
            tertiary = Color(0xFFFFC107), // Amber for Virtual Folders
            onTertiary = Color.Black,
            surface = Color(0xFF0B2239),
            onSurface = Color(0xFFEAF6FF)
        )
    } else {
        lightColorScheme(
            primary = primaryColor,
            onPrimary = Color.White,
            primaryContainer = primaryColor.copy(alpha = 0.1f),
            onPrimaryContainer = primaryColor,
            secondary = primaryColor.copy(alpha = 0.8f),
            onSecondary = Color.White,
            tertiary = Color(0xFFFFA000), // Darker Amber for light theme
            onTertiary = Color.White,
            surface = Color(0xFFF4FAFF),
            onSurface = Color(0xFF102A43)
        )
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
