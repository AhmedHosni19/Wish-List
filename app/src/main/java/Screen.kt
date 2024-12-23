package com.example.wishlist


sealed class Screen (val rout:String){
    object HomeScreen:Screen("home_screen")
    object AddScreen:Screen("add_screen")
}