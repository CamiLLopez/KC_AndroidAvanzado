package com.example.kccentregaandroidavanzado.Data.Remote

import com.example.kccentregaandroidavanzado.Data.Remote.Response.LoginResponse
import retrofit2.http.Header
import retrofit2.http.POST

interface ILoginAPI {

    @POST("api/auth/login")
    suspend fun login(@Header("Authorization") credentials: String): LoginResponse

}