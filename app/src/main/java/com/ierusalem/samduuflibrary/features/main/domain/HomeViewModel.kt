package com.ierusalem.samduuflibrary.features.main.domain

import androidx.lifecycle.ViewModel
import com.ierusalem.samduuflibrary.core.ui.navigation.DefaultNavigationEventDelegate
import com.ierusalem.samduuflibrary.core.ui.navigation.NavigationEventDelegate
import com.ierusalem.samduuflibrary.core.ui.navigation.emitNavigation
import com.ierusalem.samduuflibrary.features.main.data.HomeScreenState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel(),
    NavigationEventDelegate<HomeScreenNavigation> by DefaultNavigationEventDelegate() {

    private val _state: MutableStateFlow<HomeScreenState> = MutableStateFlow(
        HomeScreenState()
    )
    val state = _state.asStateFlow()

    private val _drawerShouldBeOpened = MutableStateFlow(false)
    val drawerShouldBeOpened = _drawerShouldBeOpened.asStateFlow()

    private fun openDrawer() {
        _drawerShouldBeOpened.value = true
    }

    fun resetOpenDrawerAction() {
        _drawerShouldBeOpened.value = false
    }

    fun handleClickIntents(intent: HomeScreenClickIntents){
        when(intent){
            HomeScreenClickIntents.DrawerSettingClick -> {
                emitNavigation(HomeScreenNavigation.NavigateToSettings)
            }

            HomeScreenClickIntents.DrawerQuickLinksClick -> {}

            HomeScreenClickIntents.DrawerSocialNetworksClick -> {}

            HomeScreenClickIntents.DrawerSecurityClick -> {}

            HomeScreenClickIntents.DrawerAboutAppClick -> {
                emitNavigation(HomeScreenNavigation.NavigateToAboutApp)
            }

            HomeScreenClickIntents.DrawerQuickLinksClick -> {
                emitNavigation(HomeScreenNavigation.NavigateToQuickLinks)
            }

            HomeScreenClickIntents.NavIconClicked -> {
                openDrawer()
            }
        }
    }

}