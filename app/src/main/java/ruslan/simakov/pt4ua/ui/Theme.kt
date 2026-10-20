package ruslan.simakov.pt4ua.ui

import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

object AppColors {
    val Indigo = Color(0xFF4263EB)
    val IndigoSoft = Color(0xFFEDF2FF)
    val IndigoDark = Color(0xFF2F44B3)
    val Sky = Color(0xFF339AF0)
    val Violet = Color(0xFF7048E8)
    val Teal = Color(0xFF0CA678)
    val Background = Color(0xFFF4F6FB)
    val Ink = Color(0xFF1F2433)
    val Muted = Color(0xFF6B7285)
    val Line = Color(0xFFE3E7F0)
    val Stripe = Color(0xFFF8F9FD)
    val Success = Color(0xFF2F9E44)
    val SuccessSoft = Color(0xFFEBFBEE)
    val Error = Color(0xFFE03131)
    val ErrorSoft = Color(0xFFFFF5F5)
    val NoteBackground = Color(0xFFFFF9DB)
    val NoteText = Color(0xFF5C4A00)
}

val HeaderGradient = Brush.linearGradient(listOf(AppColors.Indigo, AppColors.Sky))

@Composable
fun Pt4uaTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = lightColorScheme(
            primary = AppColors.Indigo,
            onPrimary = Color.White,
            primaryContainer = AppColors.IndigoSoft,
            onPrimaryContainer = AppColors.IndigoDark,
            secondary = AppColors.Teal,
            onSecondary = Color.White,
            secondaryContainer = Color(0xFFE6FCF5),
            onSecondaryContainer = Color(0xFF087F5B),
            background = AppColors.Background,
            onBackground = AppColors.Ink,
            surface = Color.White,
            onSurface = AppColors.Ink,
            surfaceVariant = Color(0xFFEEF1F8),
            onSurfaceVariant = AppColors.Muted,
            // Neutral containers instead of the default purple tint
            surfaceTint = AppColors.Indigo,
            surfaceContainerLowest = Color.White,
            surfaceContainerLow = AppColors.Stripe,
            surfaceContainer = Color(0xFFF1F3F9),
            surfaceContainerHigh = Color(0xFFECEFF6),
            surfaceContainerHighest = Color(0xFFE6E9F2),
            outline = AppColors.Line,
            error = AppColors.Error
        ),
        content = content
    )
}

// Draw behind the system bars: light status bar icons over the gradient headers, dark navigation bar icons
fun ComponentActivity.enableAppEdgeToEdge() = enableEdgeToEdge(
    statusBarStyle = SystemBarStyle.dark(android.graphics.Color.TRANSPARENT),
    navigationBarStyle = SystemBarStyle.light(android.graphics.Color.TRANSPARENT, android.graphics.Color.TRANSPARENT)
)
