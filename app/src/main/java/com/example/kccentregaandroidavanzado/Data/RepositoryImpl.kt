package com.example.kccentregaandroidavanzado.Data

import com.example.kccentregaandroidavanzado.Data.Remote.RemoteDataSource
import com.example.kccentregaandroidavanzado.SuperHero

class RepositoryImpl(

    private val remoteDataSource: RemoteDataSource

): Repository {

    override suspend fun getHeros(): List<SuperHero> {
        TODO("Not yet implemented")
    }

    override suspend fun login(): String {
        TODO("Not yet implemented")
    }
}