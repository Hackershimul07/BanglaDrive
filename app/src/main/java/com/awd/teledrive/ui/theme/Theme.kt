package com.awd.teledrive.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun TeledriveTheme(
    darkTheme: Boolean = true,
    primaryColor: Color = SkyBlue,
    content: @Composable () -> Unit
) {
    // Premium Dark is the product's visual identity. Keep the palette consistent
    // across devices rather than allowing wallpaper-based dynamic colors to shift it.
    val colorScheme = darkColorScheme(
        primary = primaryColor,
        onPrimary = DeepNavy,
        primaryContainer = Color(0xFF123B55),
        onPrimaryContainer = LightSkyBlue,
        secondary = Color(0xFF8B9CFF),
        onSecondary = DeepNavy,
        tertiary = Color(0xFFFFC66D),
        onTertiary = DeepNavy,
        background = DeepNavy,
        onBackground = Color(0xFFEAF2FC),
        surface = NavyBlue,
        onSurface = Color(0xFFEAF2FC),
        surfaceVariant = SurfaceNavy,
        onSurfaceVariant = MutedBlue,
        outline = BorderNavy,
        error = Color(0xFFFF7185),
        onError = DeepNavy,
        errorContainer = Color(0xFF4A1F2A),
        onErrorContainer = Color(0xFFFFD9DE)
    )

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
