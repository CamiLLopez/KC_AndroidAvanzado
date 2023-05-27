package com.example.kccentregaandroidavanzado.Data.MappingClasses

import com.example.kccentregaandroidavanzado.Data.Local.Model.LocalHero
import com.example.kccentregaandroidavanzado.Data.Remote.Response.GetHerosResponse
import com.example.kccentregaandroidavanzado.SuperHero
import javax.inject.Inject

class LocalToSuperHeroMapper @Inject constructor() {

    fun mapLocalToSuperHeros(localHeros: List<LocalHero>): List<SuperHero>{
        return localHeros.map { mapLocalToSuperHero(it) }
    }

    private fun mapLocalToSuperHero(localHero: LocalHero) : SuperHero {
        return SuperHero(localHero.id, localHero.name, "", "")

    }
}