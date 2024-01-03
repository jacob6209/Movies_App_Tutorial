package com.yaghobapps.moviesapp.movieList.util

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.yaghobapps.moviesapp.core.presentation.HomeScreen
import com.yaghobapps.moviesapp.details.presentation.DetailsScreen

@Composable
fun Navigation(){
    val navController= rememberNavController()

    NavHost(
        navController =navController ,
        startDestination = Screen.Home.rout
    )

    {
        composable(Screen.Home.rout){
            HomeScreen(navController)
        }
        composable(
            route=Screen.Details.rout + "/{movieId}",
            arguments = listOf(
                navArgument("movieId") { type = NavType.IntType }
            )
        ) {
            DetailsScreen()
        }

    }
}