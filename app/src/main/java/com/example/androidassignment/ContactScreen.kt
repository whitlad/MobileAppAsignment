package com.example.androidassignment

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.androidassignment.ui.theme.AndroidAssignmentTheme
import com.example.androidassignment.ui.theme.Midgrey
import com.example.androidassignment.ui.theme.Serc

@Composable
fun ContactScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column (modifier = Modifier
            .fillMaxSize()
            .background(color = Midgrey)//CHANGE BACKGROUND COLOUR
            .align(Alignment.Center),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Contact", fontSize = 30.sp)
            Text(text = "Here's our contact details", fontSize = 16.sp)
        }
    }
}
@Preview
@Composable
fun ContactScreenPreview(){
    AndroidAssignmentTheme{
        ClothingScreen()
    }
}
