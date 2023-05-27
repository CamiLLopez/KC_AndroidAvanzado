package com.example.kccentregaandroidavanzado.Data.Local

import com.example.kccentregaandroidavanzado.Data.Local.Model.LocalHero

interface ILocalDataSource {


    suspend fun getHeros(): List<LocalHero>

    suspend fun insertHero(localHero: LocalHero)

    suspend fun insertHeros(localHero: List<LocalHero>)
}