package ui.components.drawer

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Category
import androidx.compose.material.icons.rounded.ExitToApp
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import common.types.DrawerItem
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import ui.theme.AppColors.white



@OptIn(ExperimentalResourceApi::class)
@Composable
fun DashboardDrawerContent(
    drawerScreen: MutableState<DrawerItem>
) {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.primaryContainer)
            .padding(16.dp)
            .width(200.dp)
            .verticalScroll(scrollState)
            .fillMaxHeight()
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("Hive v1.0.0", color = white)
        }
        Spacer(Modifier.height(32.dp))
        DrawerItem.entries.forEach { item ->
            val selected = item.itemId == drawerScreen.value.itemId
            DrawerItem(
                label = {
                    Text(item.title)
                },
                onClick = {
                    drawerScreen.value = item
                },
                icon = {
                    Image(
                        painter = painterResource(item.icon),
                        contentDescription = "${item.itemId}"
                    )
                },
                selected = selected
            )
            Spacer(Modifier.height(4.dp))
        }
        Column(
            modifier = Modifier.fillMaxHeight().weight(1f),
            verticalArrangement = Arrangement.Bottom
        ) {
            Divider()
            Spacer(Modifier.height(12.dp))
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Column {
                    Text("Jhon Doe", color = white)
                    Text("jhondoe@gmail.com", color = white)
                }
                Spacer(Modifier.width(8.dp))
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Rounded.ExitToApp,
                        contentDescription = "Exit",
                        tint = white
                    )
                }
            }
        }
    }
}