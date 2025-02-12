package com.ierusalem.samduuflibrary.features.about.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ierusalem.samduuflibrary.R
import com.ierusalem.samduuflibrary.core.ui.theme.SamDuufLibraryTheme

@Composable
fun AboutContent(
    modifier: Modifier = Modifier,
) {
    Surface(modifier = modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.devices),
                contentDescription = "Devices Preview",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .padding(top = 16.dp)
                    .height(240.dp)
                    .fillMaxWidth()
                    .shadow(elevation = 8.dp, shape = RoundedCornerShape(12.dp)),
            )

            Text(
                modifier = Modifier
                    .padding(top = 24.dp),
                text = "Head of Department Center for Digital Educational Technologies:",
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
            )

            // Department head name
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp),
                elevation = CardDefaults.cardElevation()
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 16.dp),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "icon"
                    )
                    Text(
                        modifier = Modifier.padding(start = 16.dp),
                        text = "Erkin Usmonov",
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                    )
                }
            }

            Text(
                modifier = Modifier
                    .padding(top = 24.dp),
                text = "Project developers:",
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
            )

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp),
                elevation = CardDefaults.cardElevation()
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Icon(
                        painter = painterResource(R.drawable.mobile),
                        contentDescription = "icon"
                    )
                    Text(
                        modifier = Modifier.padding(start = 16.dp),
                        text = "Anorov Hasan",
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                    )
                }
                HorizontalDivider()
                Row(
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Icon(
                        painter = painterResource(R.drawable.server),
                        contentDescription = "icon"
                    )
                    Text(
                        modifier = Modifier.padding(start = 16.dp),
                        text = "Karimov Eldor",
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
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
        AboutContent()
    }
}

@Preview
@Composable
private fun PreviewHomeContentDark() {
    SamDuufLibraryTheme(isDarkTheme = true) {
        AboutContent()
    }
}

