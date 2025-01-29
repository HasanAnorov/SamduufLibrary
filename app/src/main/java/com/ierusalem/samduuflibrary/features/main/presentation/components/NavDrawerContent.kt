package com.ierusalem.samduuflibrary.features.main.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ierusalem.samduuflibrary.R
import com.ierusalem.samduuflibrary.core.ui.theme.SamDuufLibraryTheme
import com.ierusalem.samduuflibrary.features.main.domain.HomeScreenClickIntents

@Composable
fun NavDrawerContent(
    onDrawerItemClick: (HomeScreenClickIntents) -> Unit
) {
    // Use windowInsetsTopHeight() to add a spacer which pushes the drawer content
    // below the status bar (y-axis)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        Spacer(Modifier.windowInsetsTopHeight(WindowInsets.statusBars))
        DrawerHeader()
        DividerItem(modifier = Modifier.padding(vertical = 8.dp))
        ChatItem(
            text = stringResource(id = R.string.interactive_service),
            image = painterResource(id = R.drawable.services),
            onChatClicked = { onDrawerItemClick(HomeScreenClickIntents.DrawerProfileClick) }
        )
        ChatItem(
            text = stringResource(id = R.string.links),
            image = painterResource(id = R.drawable.link),
            onChatClicked = { onDrawerItemClick(HomeScreenClickIntents.DrawerSettingClick) }
        )
        ChatItem(
            text = stringResource(id = R.string.socials),
            image = painterResource(id = R.drawable.telegram),
            onChatClicked = { onDrawerItemClick(HomeScreenClickIntents.DrawerSettingClick) }
        )
        ChatItem(
            text = stringResource(id = R.string.security_policy),
            image = painterResource(id = R.drawable.security),
            onChatClicked = { onDrawerItemClick(HomeScreenClickIntents.DrawerSettingClick) }
        )
        ChatItem(
            text = stringResource(id = R.string.about),
            image = painterResource(id = R.drawable.info),
            onChatClicked = { onDrawerItemClick(HomeScreenClickIntents.DrawerSupportClick) }
        )
        ChatItem(
            text = stringResource(id = R.string.settings),
            image = painterResource(id = R.drawable.settings_sharp),
            onChatClicked = { onDrawerItemClick(HomeScreenClickIntents.DrawerSettingClick) }
        )
    }
}

@Composable
private fun DrawerHeader() {
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .background(color = MaterialTheme.colorScheme.background)
            .padding(start = 16.dp, end = 16.dp, top = 32.dp)
    ) {
        Image(
            modifier = Modifier.size(100.dp),
            painter = painterResource(R.drawable.samduuf),
            contentDescription = "university logo",
            contentScale = ContentScale.Crop
        )
        Text(
            modifier = Modifier.padding(top = 12.dp),
            text = stringResource(R.string.samduuf_name),
            overflow = TextOverflow.Ellipsis,
            maxLines = 2,
            textAlign = TextAlign.Start,
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}


@Composable
private fun ChatItem(
    text: String,
    image: Painter,
    onChatClicked: () -> Unit
) {
    Row(
        modifier = Modifier
            .height(48.dp)
            .fillMaxWidth()
            .clip(CircleShape)
            .clickable(onClick = onChatClicked),
        verticalAlignment = CenterVertically
    ) {
        Icon(
            modifier = Modifier.padding(start = 16.dp),
            painter = image,
            tint = MaterialTheme.colorScheme.onSurfaceVariant,
            contentDescription = null
        )
        Text(
            text = text,
            style = MaterialTheme.typography.titleMedium,
            fontSize = 14.sp,
            color = MaterialTheme.colorScheme.onSurface,
            modifier = Modifier.padding(start = 12.dp)
        )
    }
}

@Composable
fun DividerItem(modifier: Modifier = Modifier) {
    HorizontalDivider(
        modifier = modifier,
        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.12f)
    )
}

@Composable
@Preview
fun DrawerPreview() {
    SamDuufLibraryTheme {
        Surface {
            Column {
                NavDrawerContent {}
            }
        }
    }
}

@Composable
@Preview
fun DrawerPreviewDark() {
    SamDuufLibraryTheme (isDarkTheme = true) {
        Surface {
            Column {
                NavDrawerContent {}
            }
        }
    }
}