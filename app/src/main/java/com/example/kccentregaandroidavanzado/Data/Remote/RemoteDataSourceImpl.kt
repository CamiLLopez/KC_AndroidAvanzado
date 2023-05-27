package com.example.kccentregaandroidavanzado.Data.Remote

import com.example.kccentregaandroidavanzado.Data.Remote.Request.FavouriteHeroRequestBody
import com.example.kccentregaandroidavanzado.Data.Remote.Request.GetHeroLocationRequestBody
import com.example.kccentregaandroidavanzado.Data.Remote.Request.GetHerosRequestBody
import com.example.kccentregaandroidavanzado.Data.Remote.Response.GetHeroLocationResponse
import com.example.kccentregaandroidavanzado.Data.Remote.Response.GetHerosResponse
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(private val api: IDragonBallAPI, private val loginAPI: ILoginAPI): RemoteDataSource {

    var heroID = "Algo que no se aun"

    override suspend fun getHeros(): List<GetHerosResponse> {
        return api.getHeroes(GetHerosRequestBody())
    }

    override suspend fun login(credentials: String): Response<String> {
        return loginAPI.login(credentials)
    }

    override suspend fun favouriteHero() {
        return api.favouriteHero(FavouriteHeroRequestBody(heroID))
    }

    override suspend fun getHeroLocations(): List<GetHeroLocationResponse> {
        return api.getHeroLocations(GetHeroLocationRequestBody(heroID))
    }
}