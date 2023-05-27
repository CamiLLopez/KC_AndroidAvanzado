package com.example.kccentregaandroidavanzado.Data.Remote

import retrofit2.Response
import retrofit2.http.Header
import retrofit2.http.POST

interface ILoginAPI {

    @POST("api/auth/login")
    suspend fun login(@Header("Authorization") credentials: String): Response<String>

}