package com.ierusalem.samduuflibrary.features.main.presentation.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.ierusalem.samduuflibrary.R
import com.ierusalem.samduuflibrary.core.ui.theme.SamDuufLibraryTheme

/**
 * LibraryAppBar
 */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar(
    modifier: Modifier = Modifier,
    scrollBehavior: TopAppBarScrollBehavior? = null,
    onNavIconPressed: () -> Unit = { },
    navIcon: ImageVector = Icons.Default.Menu,
    colors: TopAppBarColors = TopAppBarDefaults.centerAlignedTopAppBarColors(),
    title: @Composable () -> Unit,
    actions: @Composable RowScope.() -> Unit = {}
) {
    CenterAlignedTopAppBar(
        modifier = modifier,
        actions = actions,
        title = title,
        colors = colors,
        scrollBehavior = scrollBehavior,
        navigationIcon = {
            IconButton(
                onClick = onNavIconPressed,
                content = {
                    Icon(
                        imageVector = navIcon,
                        tint = MaterialTheme.colorScheme.onBackground,
                        contentDescription = null
                    )
                }
            )
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun AndroChatAppBarPreview() {
    SamDuufLibraryTheme(isDarkTheme = false) {
        AppBar(title = { Text(stringResource(R.string.samduuf)) })
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun AndroChatAppBarPreviewDark() {
    SamDuufLibraryTheme(isDarkTheme = true) {
        AppBar(title = { Text(stringResource(R.string.samduuf)) })
    }
}
