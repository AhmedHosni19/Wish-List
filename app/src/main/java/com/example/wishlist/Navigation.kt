package com.example.wishlist.com.example.wishlist

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.wishlist.AddEditDetailsView
import com.example.wishlist.HomeView
import com.example.wishlist.Screen
import com.example.wishlist.WishViewModel

@Composable
fun Navigation(viewModel: WishViewModel= viewModel(),
               navController: NavHostController= rememberNavController()){
    NavHost(
        navController=navController,
        startDestination = Screen.HomeScreen.rout
    ){
        composable(Screen.HomeScreen.rout){
            HomeView(navController = navController, viewModel = viewModel)
        }
        composable(Screen.AddScreen.rout +"/{id}",
            arguments = listOf(
                navArgument("id"){
                    type=NavType.LongType
                    defaultValue=0L
                    nullable=false
                }
            )
        ){ entry->
            val id=if(entry.arguments!=null)entry.arguments!!.getLong("id")else 0L
            AddEditDetailsView(id = id, viewModel = viewModel, navController = navController)
        }
    }
}