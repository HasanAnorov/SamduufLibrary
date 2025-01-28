package com.ierusalem.samduuflibrary.features.main.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ierusalem.samduuflibrary.core.ui.theme.SamDuufLibraryTheme
import com.ierusalem.samduuflibrary.features.main.data.HomeScreenState

@Composable
fun HomeUiScreen(
    modifier: Modifier = Modifier,
    uiState: HomeScreenState,
) {

}

@Preview
@Composable
private fun HomeScreen_Light() {
    SamDuufLibraryTheme {
        HomeUiScreen(
            modifier = Modifier,
            uiState = HomeScreenState()
        )
    }
}

@Preview
@Composable
private fun HomeScreen_Dark() {
    SamDuufLibraryTheme {
        HomeUiScreen(
            modifier = Modifier,
            uiState = HomeScreenState()
        )
    }
}