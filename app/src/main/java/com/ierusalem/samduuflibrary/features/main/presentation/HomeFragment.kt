package com.ierusalem.samduuflibrary.features.main.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.compose.BackHandler
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.fragment.findNavController
import com.ierusalem.samduuflibrary.R
import com.ierusalem.samduuflibrary.core.ui.theme.SamDuufLibraryTheme
import com.ierusalem.samduuflibrary.core.utils.executeWithLifecycle
import com.ierusalem.samduuflibrary.features.main.domain.HomeScreenNavigation
import com.ierusalem.samduuflibrary.features.main.domain.HomeViewModel
import com.ierusalem.samduuflibrary.features.main.presentation.components.NavDrawer
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private val viewModel: HomeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {

                val uiState by viewModel.state.collectAsStateWithLifecycle()
                val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
                val drawerOpen by viewModel.drawerShouldBeOpened.collectAsStateWithLifecycle()
                val scope = rememberCoroutineScope()

                if (drawerOpen) {
                    // Open drawer and reset state in VM.
                    LaunchedEffect(Unit) {
                        // wrap in try-finally to handle interruption whiles opening drawer
                        try {
                            drawerState.open()
                        } finally {
                            viewModel.resetOpenDrawerAction()
                        }
                    }
                }

                // Intercepts back navigation when the drawer is open4
                if (drawerState.isOpen) {
                    BackHandler {
                        scope.launch {
                            drawerState.close()
                        }
                    }
                }

                SamDuufLibraryTheme {
                    NavDrawer(
                        drawerState = drawerState,
                        content = {
                            HomeUiScreen(
                                modifier = Modifier,
                                uiState = uiState,
                                eventHandler = viewModel::handleClickIntents
                            )
                        },
                        onDrawerItemClick = {
                            scope.launch {
                                drawerState.close()
                                viewModel.handleClickIntents(it)
                            }
                        },
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

    private fun executeNavigation(navigation: HomeScreenNavigation) {
        when (navigation) {
            HomeScreenNavigation.NavigateToSettings -> {
            }
            HomeScreenNavigation.NavigateToQuickLinks ->{
            }
            HomeScreenNavigation.NavigateToAboutApp -> {
                findNavController().navigate(R.id.action_homeFragment_to_aboutFragment)
            }
        }
    }

}