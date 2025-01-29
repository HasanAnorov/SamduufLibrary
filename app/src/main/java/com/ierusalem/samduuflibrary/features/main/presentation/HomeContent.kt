package com.ierusalem.samduuflibrary.features.main.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ierusalem.samduuflibrary.core.ui.theme.SamDuufLibraryTheme
import com.ierusalem.samduuflibrary.features.main.data.HomeScreenState
import com.ierusalem.samduuflibrary.features.main.domain.HomeScreenClickIntents

@Composable
fun HomeContent(
    modifier: Modifier = Modifier,
    uiState: HomeScreenState,
    eventHandler: (HomeScreenClickIntents) -> Unit
) {

}

@Preview
@Composable
private fun PreviewHomeContentLight() {
    SamDuufLibraryTheme(isDarkTheme = false) {
        HomeContent(
            uiState = HomeScreenState(),
            eventHandler = {}
        )
    }
}

@Preview
@Composable
private fun PreviewHomeContentDark() {
    SamDuufLibraryTheme(isDarkTheme = true) {
        HomeContent(
            uiState = HomeScreenState(),
            eventHandler = {}
        )
    }
}