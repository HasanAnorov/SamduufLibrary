package com.ierusalem.samduuflibrary.features.settings.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.ierusalem.samduuflibrary.core.ui.theme.SamDuufLibraryTheme
import com.ierusalem.samduuflibrary.core.utils.executeWithLifecycle
import com.ierusalem.samduuflibrary.features.settings.domain.SettingsScreenNavigation
import com.ierusalem.samduuflibrary.features.settings.domain.SettingsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SettingsFragment:Fragment() {

    private val viewModel: SettingsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                val uiState by viewModel.state.collectAsState()
                SamDuufLibraryTheme(isDarkTheme = uiState.appTheme){
                    SettingsScreen(
                        uiState = uiState,
                        eventHandler = {
                            viewModel.handleEvents(it)
                        }
                    )
                }
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.screenNavigation.executeWithLifecycle(
            lifecycle = viewLifecycleOwner.lifecycle,
            action = ::executeNavigation
        )
    }

    private fun executeNavigation(navigation: SettingsScreenNavigation) {
        when (navigation) {
            SettingsScreenNavigation.NavIconClick -> {
                findNavController().popBackStack()
            }
        }
    }

}