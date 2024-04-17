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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.androidassignment.ui.theme.AndroidAssignmentTheme
import com.example.androidassignment.ui.theme.Sandboffwhite
import com.example.androidassignment.ui.theme.Serc
import com.example.androidassignment.ui.theme.LightGrey

@Composable
fun ClothingScreen() {

        Box(modifier = Modifier.fillMaxSize()) {
            Column (modifier = Modifier
                .fillMaxSize()
                .background(color = Sandboffwhite)//CHANGE BACKGROUND COLOUR
                .align(Alignment.Center),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Clothing", fontSize = 30.sp)
                Text(text = "Browse our Clothing Collection!", fontSize = 16.sp)
            }
        }
    }

@Preview
@Composable
fun ClothingScreenPreview(){
    AndroidAssignmentTheme{
        ClothingScreen()
    }
}
