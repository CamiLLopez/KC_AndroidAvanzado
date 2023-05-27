package com.example.kccentregaandroidavanzado.Data.Remote

import com.example.kccentregaandroidavanzado.Data.Remote.Request.FavouriteHeroRequestBody
import com.example.kccentregaandroidavanzado.Data.Remote.Request.GetHeroLocationRequestBody
import com.example.kccentregaandroidavanzado.Data.Remote.Request.GetHerosRequestBody
import com.example.kccentregaandroidavanzado.Data.Remote.Response.GetHeroLocationResponse
import com.example.kccentregaandroidavanzado.Data.Remote.Response.GetHerosResponse
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RemoteDataSourceImpl @Inject constructor(private val api: IDragonBallAPI, private val loginAPI: ILoginAPI): RemoteDataSource {

    var heroID = "Algo q ue no se aun"
    private var token = "Bearer eyJraWQiOiJwcml2YXRlIiwiYWxnIjoiSFMyNTYiLCJ0eXAiOiJKV1QifQ.eyJpZGVudGlmeSI6IjFFQzk5RDAzLTRDMTMtNEZFNS1CMERBLUJCQjQxRkFFMzdERiIsImVtYWlsIjoiY2FtaWxhbGxvcGV6OTVAZ21haWwuY29tIiwiZXhwaXJhdGlvbiI6NjQwOTIyMTEyMDB9.mCt5VQOCzuB4cdv8sm_RDmEGoINTeS3tCZlZ2l2pLYY"
    override suspend fun getHeros(): List<GetHerosResponse> {
        return api.getHeroes(token, GetHerosRequestBody())
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