package com.ierusalem.samduuflibrary.features.social.domain


sealed interface SocialsScreenClickIntents {
    data object TelegramClicked : SocialsScreenClickIntents
    data object InstagramClicked : SocialsScreenClickIntents
    data object YouTubeClicked : SocialsScreenClickIntents
    data object FacebookClicked : SocialsScreenClickIntents
    data object LinkedInClicked : SocialsScreenClickIntents
}