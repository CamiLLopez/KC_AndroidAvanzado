package com.example.kccentregaandroidavanzado.Data.Remote

import com.example.kccentregaandroidavanzado.Data.Remote.Request.GetHerosRequestBody
import com.example.kccentregaandroidavanzado.Data.Remote.Response.GetHeroLocationResponse
import com.example.kccentregaandroidavanzado.Data.Remote.Response.GetHerosResponse
import com.example.kccentregaandroidavanzado.Data.Remote.Response.LoginResponse
import retrofit2.http.Body
import retrofit2.http.POST


interface DragonBallAPI {

    @POST("api/heros/all")
    suspend fun getHeroes(@Body getHerosRequestBody: GetHerosRequestBody ): List<GetHerosResponse>

    @POST("api/auth/login")
    suspend fun login(): LoginResponse


    @POST("api/data/herolike")
    suspend fun favouriteHero()

    @POST("api/heros/locations")
    suspend fun getHeroLocations(): List<GetHeroLocationResponse>
}