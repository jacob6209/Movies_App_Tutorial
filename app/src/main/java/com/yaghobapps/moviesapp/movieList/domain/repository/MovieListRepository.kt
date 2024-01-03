package com.yaghobapps.moviesapp.movieList.domain.repository

import com.yaghobapps.moviesapp.movieList.domain.model.Movie
import com.yaghobapps.moviesapp.movieList.util.Resource
import kotlinx.coroutines.flow.Flow

/**
 * @author Android Yaghob Ebrahimi
 */
interface MovieListRepository {
    suspend fun getMovieList(
        forceFetchFromRemote: Boolean,
        category: String,
        page: Int
    ): Flow<Resource<List<Movie>>>

    suspend fun getMovie(id: Int): Flow<Resource<Movie>>
}