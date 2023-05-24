package com.example.kccentregaandroidavanzado.Data

import com.example.kccentregaandroidavanzado.SuperHero

interface Repository {

    suspend fun getHeros(): List<SuperHero>


    suspend fun login(): String

}