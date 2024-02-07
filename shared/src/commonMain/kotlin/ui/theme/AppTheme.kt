package ui.theme

import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import ui.theme.AppColors.cultured
import ui.theme.AppColors.darkBlue
import ui.theme.AppColors.gray200
import ui.theme.AppColors.orange
import ui.theme.AppColors.white

@Composable
fun AppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = darkColorScheme(
            primary = darkBlue,
            onPrimary = white,
            primaryContainer = orange,
            onPrimaryContainer = white,
            tertiary = cultured,
            secondary = darkBlue,
            outlineVariant = gray200
        )
    ) {
        ProvideTextStyle(LocalTextStyle.current.copy(letterSpacing = 0.sp)) {
            content()
        }
    }
}