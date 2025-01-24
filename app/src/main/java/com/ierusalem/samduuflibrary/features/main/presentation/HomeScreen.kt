package com.ierusalem.samduuflibrary.features.main.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ierusalem.samduuflibrary.core.ui.theme.SamDuufLibraryTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

}

@Preview
@Composable
private fun HomeScreen_Light() {
    SamDuufLibraryTheme {
        HomeScreen(
            modifier = Modifier
        )
    }
}

@Preview
@Composable
private fun HomeScreen_Dark() {
    SamDuufLibraryTheme {
        HomeScreen(
            modifier = Modifier
        )
    }
}