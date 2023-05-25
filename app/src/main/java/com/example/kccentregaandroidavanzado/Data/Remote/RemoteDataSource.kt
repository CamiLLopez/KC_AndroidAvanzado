package com.example.kccentregaandroidavanzado.Data.Remote

import com.example.kccentregaandroidavanzado.Data.Remote.Response.GetHeroLocationResponse
import com.example.kccentregaandroidavanzado.Data.Remote.Response.GetHerosResponse
import com.example.kccentregaandroidavanzado.Data.Remote.Response.LoginResponse

interface RemoteDataSource {

    suspend fun getHeros(): List<GetHerosResponse>

    suspend fun login(credentials: String): LoginResponse

    suspend fun favouriteHero()

    suspend fun getHeroLocations(): List<GetHeroLocationResponse>
}