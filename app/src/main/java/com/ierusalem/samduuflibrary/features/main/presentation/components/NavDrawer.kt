package com.ierusalem.samduuflibrary.features.main.presentation.components

import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue.Closed
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import com.ierusalem.samduuflibrary.features.main.domain.HomeScreenClickIntents

@Composable
fun NavDrawer(
    drawerState: DrawerState = rememberDrawerState(initialValue = Closed),
    onDrawerItemClick: (HomeScreenClickIntents) -> Unit,
    content: @Composable () -> Unit
) {
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                NavDrawerContent (onDrawerItemClick = onDrawerItemClick)
            }
        },
        content = content
    )
}