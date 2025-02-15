package com.ierusalem.samduuflibrary.core.app

import com.ierusalem.samduuflibrary.R
import com.ierusalem.samduuflibrary.core.utils.UiText

enum class AppLanguage(val languageRes: UiText, var isSelected: Boolean) {
    Uzbek(languageRes = UiText.StringResource(R.string.uzbek), isSelected =  false),
    English(languageRes = UiText.StringResource(R.string.english),  isSelected = false),
    Russian(languageRes = UiText.StringResource(R.string.russian), isSelected =  true),
}
