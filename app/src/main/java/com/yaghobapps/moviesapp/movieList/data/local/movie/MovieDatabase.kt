package com.yaghobapps.moviesapp.movieList.data.local.movie

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * @author Android Yaghob Ebrahimi
 */
@Database(
    entities = [MovieEntity::class],
    version = 1
)
abstract class MovieDatabase: RoomDatabase() {
    abstract val movieDao: MovieDao
}