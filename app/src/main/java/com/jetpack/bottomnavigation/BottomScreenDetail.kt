package com.jetpack.bottomnavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight

@Composable
fun BottomHome() {

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Home Screen",
            style = MaterialTheme.typography.h5,
            color = Color.Green,
            fontFamily = FontFamily.Monospace,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold
        )
    }
}


@Composable
fun BottomFavourite() {

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Home Favourite",
            style = MaterialTheme.typography.h5,
            color = Color.Green,
            fontFamily = FontFamily.Monospace,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold
        )
    }
}


@Composable
fun BottomSearch() {

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Home Search",
            style = MaterialTheme.typography.h5,
            color = Color.Green,
            fontFamily = FontFamily.Monospace,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold
        )
    }
}


@Composable
fun BottomUser() {

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Home User",
            style = MaterialTheme.typography.h5,
            color = Color.Green,
            fontFamily = FontFamily.Monospace,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold
        )
    }
}


@Composable
fun BottomSetting() {

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Home Setting",
            style = MaterialTheme.typography.h5,
            color = Color.Green,
            fontFamily = FontFamily.Monospace,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold
        )
    }
}



