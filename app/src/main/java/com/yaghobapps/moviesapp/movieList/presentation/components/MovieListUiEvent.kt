package com.yaghobapps.moviesapp.movieList.presentation.components

sealed interface MovieListUiEvent {
    data class Paginate(val category:String): MovieListUiEvent
    object Navigate: MovieListUiEvent
}