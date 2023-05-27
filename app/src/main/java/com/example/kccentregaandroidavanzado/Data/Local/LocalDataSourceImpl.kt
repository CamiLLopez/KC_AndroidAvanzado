package com.example.kccentregaandroidavanzado.Data.Local

import com.example.kccentregaandroidavanzado.Data.Local.Model.LocalHero

class LocalDataSourceImpl: ILocalDataSource {


    override suspend fun getHeros(): List<LocalHero> {
        TODO("Not yet implemented")
    }

    override suspend fun insertHero(localHero: LocalHero) {
        TODO("Not yet implemented")
    }

    override suspend fun insertHeros(localHero: List<LocalHero>) {
        TODO("Not yet implemented")
    }
}