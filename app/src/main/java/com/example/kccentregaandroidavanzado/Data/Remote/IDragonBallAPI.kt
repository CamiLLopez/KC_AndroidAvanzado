package com.example.kccentregaandroidavanzado.Data.Remote

import com.example.kccentregaandroidavanzado.Data.Remote.Request.FavouriteHeroRequestBody
import com.example.kccentregaandroidavanzado.Data.Remote.Request.GetHeroLocationRequestBody
import com.example.kccentregaandroidavanzado.Data.Remote.Request.GetHerosRequestBody
import com.example.kccentregaandroidavanzado.Data.Remote.Response.GetHeroLocationResponse
import com.example.kccentregaandroidavanzado.Data.Remote.Response.GetHerosResponse
import retrofit2.http.Body
import retrofit2.http.POST


interface IDragonBallAPI {

    @POST("api/heros/all")
    suspend fun getHeroes(@Body getHerosRequestBody: GetHerosRequestBody ): List<GetHerosResponse>


    @POST("api/data/herolike")
    suspend fun favouriteHero(@Body favouriteHeroRequestBody: FavouriteHeroRequestBody)

    @POST("api/heros/locations")
    suspend fun getHeroLocations(getHeroLocationRequestBody: GetHeroLocationRequestBody): List<GetHeroLocationResponse>
}