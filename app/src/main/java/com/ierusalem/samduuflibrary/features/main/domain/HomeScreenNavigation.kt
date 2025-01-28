package com.ierusalem.samduuflibrary.features.main.domain

sealed interface HomeScreenNavigation {
    data object NavigateToSettings: HomeScreenNavigation
    data object NavigateToSupport: HomeScreenNavigation
    data object NavigateToDiploma: HomeScreenNavigation
}