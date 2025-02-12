package com.ierusalem.samduuflibrary.features.main.domain

sealed interface HomeScreenClickIntents {
    data object NavIconClicked : HomeScreenClickIntents
    data object DrawerQuickLinksClick : HomeScreenClickIntents
    data object DrawerSocialNetworksClick : HomeScreenClickIntents
    data object DrawerSecurityClick: HomeScreenClickIntents
    data object DrawerAboutAppClick : HomeScreenClickIntents
    data object DrawerSettingClick : HomeScreenClickIntents
}