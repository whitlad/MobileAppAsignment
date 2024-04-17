package com.example.androidassignment



sealed class Screens (val screen: String) {
    data object Home: Screens("home")
    data object Clothing: Screens("clothing")
    data object Help: Screens("help")
    data object Contact: Screens("contact")
}