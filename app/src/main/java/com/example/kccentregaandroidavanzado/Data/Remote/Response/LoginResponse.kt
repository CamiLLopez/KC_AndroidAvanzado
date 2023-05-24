package com.example.kccentregaandroidavanzado.Data.Remote.Response

import com.squareup.moshi.Json

data class LoginResponse(

    @Json(name = "token") val token: String
)
