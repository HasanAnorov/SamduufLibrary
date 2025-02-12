package com.ierusalem.samduuflibrary.features.social.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ierusalem.samduuflibrary.R
import com.ierusalem.samduuflibrary.core.ui.theme.SamDuufLibraryTheme
import com.ierusalem.samduuflibrary.features.social.domain.SocialsScreenClickIntents

@Composable
fun SocialsContent(
    modifier: Modifier = Modifier,
    eventHandler: (SocialsScreenClickIntents) -> Unit = { }
) {
    Surface(modifier = modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val rotationAngle = 310f

            Spacer(Modifier.height(24.dp))

            //Telegram
            Card(
                modifier = Modifier
                    .clickable {  }
                    .fillMaxWidth(),
                elevation = CardDefaults.cardElevation()
            ) {
                Row(
                    modifier = Modifier
                        .padding(horizontal = 16.dp, vertical = 16.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(
                        painter = painterResource(R.drawable.telegram_logo),
                        contentDescription = "icon"
                    )
                    Text(
                        modifier = Modifier
                            .padding(start = 16.dp)
                            .weight(1F),
                        text = stringResource(R.string.telegram_channel),
                        textAlign = TextAlign.Start,
                        fontWeight = FontWeight.Bold,
                    )
                    Icon(
                        modifier = Modifier.rotate(rotationAngle),
                        imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                        contentDescription = "icon"
                    )
                }
            }

            Spacer(Modifier.height(16.dp))

            //Instagram
            Card(
                modifier = Modifier
                    .clickable {  }
                    .fillMaxWidth(),
                elevation = CardDefaults.cardElevation()
            ) {
                Row(
                    modifier = Modifier
                        .padding(horizontal = 16.dp, vertical = 16.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(
                        painter = painterResource(R.drawable.instagram),
                        contentDescription = "icon"
                    )
                    Text(
                        modifier = Modifier
                            .padding(start = 16.dp)
                            .weight(1F),
                        text = stringResource(R.string.instagram),
                        textAlign = TextAlign.Start,
                        fontWeight = FontWeight.Bold,
                    )
                    Icon(
                        modifier = Modifier.rotate(rotationAngle),
                        imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                        contentDescription = "icon"
                    )
                }
            }

            Spacer(Modifier.height(16.dp))

            //You-Tube
            Card(
                modifier = Modifier
                    .clickable {  }
                    .fillMaxWidth(),
                elevation = CardDefaults.cardElevation()
            ) {
                Row(
                    modifier = Modifier
                        .padding(horizontal = 16.dp, vertical = 16.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(
                        painter = painterResource(R.drawable.youtube),
                        contentDescription = "icon"
                    )
                    Text(
                        modifier = Modifier
                            .padding(start = 16.dp)
                            .weight(1F),
                        text = stringResource(R.string.youtube),
                        textAlign = TextAlign.Start,
                        fontWeight = FontWeight.Bold,
                    )
                    Icon(
                        modifier = Modifier.rotate(rotationAngle),
                        imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                        contentDescription = "icon"
                    )
                }
            }

            Spacer(Modifier.height(16.dp))

            //Facebook
            Card(
                modifier = Modifier
                    .clickable {  }
                    .fillMaxWidth(),
                elevation = CardDefaults.cardElevation()
            ) {
                Row(
                    modifier = Modifier
                        .padding(horizontal = 16.dp, vertical = 16.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(
                        painter = painterResource(R.drawable.facebook),
                        contentDescription = "icon"
                    )
                    Text(
                        modifier = Modifier
                            .padding(start = 16.dp)
                            .weight(1F),
                        text = stringResource(R.string.facebook),
                        textAlign = TextAlign.Start,
                        fontWeight = FontWeight.Bold,
                    )
                    Icon(
                        modifier = Modifier.rotate(rotationAngle),
                        imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                        contentDescription = "icon"
                    )
                }
            }

            Spacer(Modifier.height(16.dp))

            //LinkedIn
            Card(
                modifier = Modifier
                    .clickable {  }
                    .fillMaxWidth(),
                elevation = CardDefaults.cardElevation()
            ) {
                Row(
                    modifier = Modifier
                        .padding(horizontal = 16.dp, vertical = 16.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(
                        painter = painterResource(R.drawable.linkedin),
                        contentDescription = "icon"
                    )
                    Text(
                        modifier = Modifier
                            .padding(start = 16.dp)
                            .weight(1F),
                        text = stringResource(R.string.linkedin),
                        textAlign = TextAlign.Start,
                        fontWeight = FontWeight.Bold,
                    )
                    Icon(
                        modifier = Modifier.rotate(rotationAngle),
                        imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                        contentDescription = "icon"
                    )
                }
            }
        }
    }

}

@Preview
@Composable
private fun PreviewHomeContentLight() {
    SamDuufLibraryTheme(isDarkTheme = false) {
        SocialsContent()
    }
}

@Preview
@Composable
private fun PreviewHomeContentDark() {
    SamDuufLibraryTheme(isDarkTheme = true) {
        SocialsContent()
    }
}