package com.example.androidassignment

import HelpScreen
import android.os.Bundle
import android.widget.Toolbar
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Help
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.outlined.HelpOutline
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.material.icons.outlined.ShoppingBag
import androidx.compose.material.icons.rounded.Help
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.ShoppingBag
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androidassignment.ui.theme.AndroidAssignmentTheme
import com.example.androidassignment.ui.theme.Darkgrey
import com.example.androidassignment.ui.theme.Sandbblack
import com.example.androidassignment.ui.theme.Sandbgrey
import com.example.androidassignment.ui.theme.Serc
import com.example.androidassignment.ui.theme.Darkgrey
import com.example.androidassignment.ui.theme.LightGrey


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidAssignmentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BottomAppBar()

                    TopAppBar()
                }
            }
        }
    }
}

            @Composable
            fun BottomAppBar() {
                //val secondaryColor = Color.Gray
                val navigationController = rememberNavController()
                val context = LocalContext.current.applicationContext
                val selected = remember {
                    mutableStateOf(Icons.Rounded.Home)
                }
                Scaffold(
                    bottomBar = {
                        BottomAppBar(
                            containerColor = LightGrey

                        ) {

                            IconButton(
                                onClick = {
                                    selected.value = Icons.Rounded.Home
                                    navigationController.navigate(Screens.Home.screen) {
                                        popUpTo(0)
                                    }
                                }
                            ) {
                                Icon(
                                    imageVector = if (selected.value == Icons.Rounded.Home) {
                                        Icons.Rounded.Home
                                    } else {
                                        Icons.Outlined.Home // Change to the outline version when not selected
                                    },
                                    contentDescription = null,
                                    modifier = Modifier.size(24.dp),
                                )
                            }
                            Spacer(modifier = Modifier.weight(1f)) // Add Spacer between items

                            IconButton(
                                onClick = {
                                    selected.value = Icons.Rounded.ShoppingBag
                                    navigationController.navigate(Screens.Clothing.screen) {
                                        popUpTo(0)
                                    }
                                }
                            ) {
                                Icon(
                                    imageVector = if (selected.value == Icons.Rounded.ShoppingBag) {
                                        Icons.Rounded.ShoppingBag
                                    } else {
                                        Icons.Outlined.ShoppingBag // Change to the outline version when not selected
                                    },
                                    contentDescription = null,
                                    modifier = Modifier.size(24.dp),
                                )
                            }

                            Spacer(modifier = Modifier.weight(1f)) // Add Spacer between items}

                            IconButton(
                                onClick = {
                                    selected.value = Icons.Filled.Help
                                    navigationController.navigate(Screens.Help.screen) {
                                        popUpTo(0)
                                    }
                                }
                            ) {
                                Icon(
                                    imageVector = if (selected.value == Icons.Filled.Help) {
                                        Icons.Rounded.Help
                                    } else {
                                        Icons.Outlined.HelpOutline// Change to the outline version when not selected
                                    },
                                    contentDescription = null,
                                    modifier = Modifier.size(24.dp),
                                )
                            }

                            Spacer(modifier = Modifier.weight(1f)) // Add Spacer between items

                            IconButton(
                                onClick = {
                                    selected.value = Icons.Default.Mail
                                    navigationController.navigate(Screens.Contact.screen) {
                                        popUpTo(0)
                                    }
                                }
                            ) {
                                Icon(
                                    imageVector = if (selected.value == Icons.Filled.Mail) {
                                        Icons.Filled.Mail
                                    } else {
                                        Icons.Outlined.Mail // Change to the outline version when not selected
                                    },
                                    contentDescription = null,
                                    modifier = Modifier.size(24.dp),
                                )
                            }
                        }
                    }
                ) {

                        paddingValues ->
                    NavHost(
                        navController = navigationController,
                        startDestination = Screens.Home.screen,
                        modifier = Modifier.padding(paddingValues)
                    ) {
                        composable(Screens.Home.screen) { HomeScreen() }
                        composable(Screens.Clothing.screen) { ClothingScreen() }
                        composable(Screens.Help.screen) { HelpScreen() }
                        composable(Screens.Contact.screen) { ContactScreen() }
                    }

                }


            }
@Composable
fun TopAppBar() {
    //val secondaryColor = Color.Gray
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = R.drawable.sblightlogo),
                contentDescription = null
            )

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
    }
@Preview
@Composable
fun BottomAppBarPreview() {
    AndroidAssignmentTheme {

        BottomAppBar()
        TopAppBar()

    }
}








