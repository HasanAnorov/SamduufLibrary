package com.ierusalem.samduuflibrary.features.social.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.ierusalem.samduuflibrary.R
import com.ierusalem.samduuflibrary.core.ui.theme.SamDuufLibraryTheme
import com.ierusalem.samduuflibrary.features.main.presentation.components.AppBar
import com.ierusalem.samduuflibrary.features.social.domain.SocialsScreenClickIntents
import com.ierusalem.samduuflibrary.features.social.presentation.components.SocialsContent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SocialsUiScreen(
    modifier: Modifier = Modifier,
    onNavIconPressed: () -> Unit = { },
    eventHandler: (SocialsScreenClickIntents) -> Unit,
) {
    Scaffold(
        modifier = modifier.fillMaxSize()
    ) { pv ->
        Column {
            AppBar(
                title = {
                    Text(
                        text = stringResource(R.string.about),
                        style = MaterialTheme.typography.titleMedium
                    )
                },
                onNavIconPressed = onNavIconPressed,
                navIcon = Icons.AutoMirrored.Filled.ArrowBack
            )
            SocialsContent(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1F)
                    .padding(bottom = pv.calculateBottomPadding())
                    .imePadding()
                    // So this basically doesn't do anything since we handle the padding ourselves
                    // BUT, we don't just want to consume it because we DO actually care when using
                    // Modifier.navigationBarsPadding()
                    .heightIn(min = pv.calculateBottomPadding()),
                eventHandler = eventHandler
            )
        }
    }
}

@Preview
@Composable
private fun HomeScreen_Light() {
    SamDuufLibraryTheme {
        SocialsUiScreen(
            modifier = Modifier,
            eventHandler = {}
        )
    }
}

@Preview
@Composable
private fun HomeScreen_Dark() {
    SamDuufLibraryTheme(isDarkTheme = true) {
        SocialsUiScreen(
            modifier = Modifier,
            eventHandler = {}
        )
    }
}