package com.sge_inventario.core.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.sge_inventario.core.theme.SGEInventarioColors


// Esquema de colores para modo claro
private val LightColorScheme = lightColorScheme(
    primary = SGEInventarioColors.Primary,
    secondary = SGEInventarioColors.Secondary,
    background = SGEInventarioColors.Background,
    surface = SGEInventarioColors.Surface,
    error = SGEInventarioColors.Error,
    onPrimary = SGEInventarioColors.OnPrimary,
    onSecondary = SGEInventarioColors.OnSecondary
)

// Esquema de colores para modo oscuro
private val DarkColorScheme = darkColorScheme(
    primary = SGEInventarioColors.PrimaryVariant,
    secondary = SGEInventarioColors.SecondaryVariant,
    background = Color.Black,
    surface = Color.DarkGray,
    error = SGEInventarioColors.Error
)

@Composable
fun SGEInventarioTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
}