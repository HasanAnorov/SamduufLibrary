package com.ierusalem.samduuflibrary.features.settings.domain

import com.ierusalem.samduuflibrary.core.app.AppLanguage

sealed interface SettingsScreenEvents {
    data object NavIconClick : SettingsScreenEvents
    data object LanguageCLick: SettingsScreenEvents
    data class OnLanguageChange(val language: AppLanguage) : SettingsScreenEvents
    data object OnThemeChange : SettingsScreenEvents
    data object OnDismissLanguageDialog : SettingsScreenEvents
}
