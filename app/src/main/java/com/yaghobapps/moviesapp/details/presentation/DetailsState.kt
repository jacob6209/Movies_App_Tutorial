package com.yaghobapps.moviesapp.details.presentation

import com.yaghobapps.moviesapp.movieList.domain.model.Movie

data class DetailsState(
    val isLoading:Boolean=false,
    val movie: Movie?=null
)
