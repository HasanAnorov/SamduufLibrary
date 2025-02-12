package com.ierusalem.samduuflibrary.features.about.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.ierusalem.samduuflibrary.core.ui.theme.SamDuufLibraryTheme

class AboutFragment:Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                SamDuufLibraryTheme {
                    AboutUiScreen(
                        modifier = Modifier,
                        onNavIconPressed = { findNavController().popBackStack() }
                    )
                }
            }
        }
    }

}