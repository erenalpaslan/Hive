package ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.PermanentNavigationDrawer
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import common.types.DrawerItem
import ui.components.drawer.DashboardDrawerContent
import ui.theme.AppColors.white
import ui.theme.AppTheme

@Composable
fun HiveMain() {
    AppTheme {
        val drawerScreen = remember {
            mutableStateOf(DrawerItem.Dashboard)
        }

        PermanentNavigationDrawer(
            drawerContent = {
                DashboardDrawerContent(
                    drawerScreen = drawerScreen
                )
            },
            modifier = Modifier.background(MaterialTheme.colorScheme.primaryContainer)
        ) {
            Box(
                modifier = Modifier
                    .background(white)
                    .fillMaxSize()
            ) {
                Column(modifier = Modifier.padding(8.dp)) {
                    when(drawerScreen.value) {
                        else -> {}
                    }
                }
            }
        }
    }
}