package com.ierusalem.samduuflibrary.features.settings.domain

sealed interface SettingsScreenNavigation {
    data object NavIconClick: SettingsScreenNavigation
}