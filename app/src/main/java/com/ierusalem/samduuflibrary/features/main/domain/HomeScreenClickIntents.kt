package com.ierusalem.samduuflibrary.features.main.domain

sealed interface HomeScreenClickIntents {
    data object NavIconClicked : HomeScreenClickIntents
    data object DrawerSupportClick : HomeScreenClickIntents
    data object DrawerProfileClick : HomeScreenClickIntents
    data object DrawerSettingClick : HomeScreenClickIntents
}