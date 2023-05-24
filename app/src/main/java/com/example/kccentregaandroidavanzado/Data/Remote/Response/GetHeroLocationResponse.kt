package com.example.kccentregaandroidavanzado.Data.Remote.Response

import com.squareup.moshi.Json

data class GetHeroLocationResponse (

    @Json(name = "id") val id: String,
    @Json(name = "longitud") val longitud : Double,
    @Json(name = "latitud") val latitud : Double,

)


