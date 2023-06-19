package com.ali.sadapayclone.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.ViewCompat

private val DarkColorScheme = darkColorScheme(
    primary = PeachDark,
    secondary = PeachLight,
    tertiary = Teal
)

private val LightColorScheme = lightColorScheme(
    primary = PeachDark,
    secondary = PeachLight,
    tertiary = Teal

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun SPMaterialTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            (view.context as Activity).window.statusBarColor = colorScheme.primary.toArgb()
            ViewCompat.getWindowInsetsController(view)?.isAppearanceLightStatusBars = darkTheme
        }
    }


    CompositionLocalProvider(
        //LocalOBColorColorScheme provides colorScheme,
        //LocalOBTypography provides typography,
        //LocalOBSpace provides space,
        LocalSPSize provides size,
        //LocalOBWeight provides weight,
        LocalSPPadding provides padding,
        // LocalOBFloats provides floats,
        content = content
    )
}

object SPMaterialTheme {
    //    val colors: OBColor
//        @Composable
//        get() = LocalOBColorColorScheme.current
//    val typography: OBTypography
//        @Composable
//        get() = LocalOBTypography.current
//    val space: OBSpace
//        @Composable
//        get() = LocalOBSpace.current
    val size: SPSize
        @Composable
        get() = LocalSPSize.current

    //    val weight: OBWeight
//        @Composable
//        get() = LocalOBWeight.current
    val padding: SPPadding
        @Composable
        get() = LocalSPPadding.current
/*    val floats: OBFloats
        @Composable
        get() = LocalOBFloats.current*/
}