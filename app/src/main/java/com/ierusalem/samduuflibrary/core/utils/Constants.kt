package com.ierusalem.samduuflibrary.core.utils

import com.ierusalem.samduuflibrary.core.app.AppLanguage

object Constants {

    const val DATA_STORE_NAME = "AppDataStore"

    const val PREFERENCE_LANGUAGE = "device_language"
    const val PREFERENCE_THEME = "device_theme"

    private const val UZBEK_LOCALE = "uz"
    private const val ENGLISH_LOCALE = "en"
    private const val RUSSIAN_LOCALE = "ru"

    const val DEFAULT_THEME = false
    const val DEFAULT_LOCALE = RUSSIAN_LOCALE

    fun getLanguageCode(language: AppLanguage): String {
        return when (language) {
            AppLanguage.Uzbek -> UZBEK_LOCALE
            AppLanguage.English -> ENGLISH_LOCALE
            AppLanguage.Russian -> RUSSIAN_LOCALE
        }
    }

    fun getLanguageFromCode(languageCode: String): AppLanguage {
        return when (languageCode) {
            ENGLISH_LOCALE -> AppLanguage.English
            RUSSIAN_LOCALE -> AppLanguage.Russian
            UZBEK_LOCALE -> AppLanguage.Uzbek
            else -> AppLanguage.Russian
        }
    }

}