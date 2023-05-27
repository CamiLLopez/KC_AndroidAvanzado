package com.example.kccentregaandroidavanzado.Data.Remote

import com.example.kccentregaandroidavanzado.Data.Remote.Response.GetHeroLocationResponse
import com.example.kccentregaandroidavanzado.Data.Remote.Response.GetHerosResponse
import retrofit2.Response

interface RemoteDataSource {

    suspend fun getHeros(): List<GetHerosResponse>

    suspend fun login(credentials: String): Response<String>

    suspend fun favouriteHero()

    suspend fun getHeroLocations(): List<GetHeroLocationResponse>
}