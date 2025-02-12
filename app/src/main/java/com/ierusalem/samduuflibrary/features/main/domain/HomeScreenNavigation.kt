package com.ierusalem.samduuflibrary.features.main.domain

sealed interface HomeScreenNavigation {
    data object NavigateToSettings: HomeScreenNavigation
    data object NavigateToQuickLinks: HomeScreenNavigation
    data object NavigateToAboutApp: HomeScreenNavigation
}