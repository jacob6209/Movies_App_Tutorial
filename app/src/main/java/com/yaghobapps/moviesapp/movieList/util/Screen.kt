package com.yaghobapps.moviesapp.movieList.util

/**
 * @author Android Yaghob Ebrahimi
 */
sealed class Screen(val rout: String) {
    object Home : Screen("main")
    object PopularMovieList : Screen("popularMovie")
    object UpcomingMovieList : Screen("upcomingMovie")
    object Details : Screen("details")
}
