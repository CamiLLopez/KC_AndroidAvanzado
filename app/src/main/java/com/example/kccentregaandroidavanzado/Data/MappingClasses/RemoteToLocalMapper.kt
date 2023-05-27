package com.example.kccentregaandroidavanzado.Data.MappingClasses

import com.example.kccentregaandroidavanzado.Data.Local.Model.LocalHero
import com.example.kccentregaandroidavanzado.Data.Remote.Response.GetHerosResponse
import javax.inject.Inject

class RemoteToLocalMapper @Inject constructor() {

    fun mapGetHerosResponse(getHerosResponse: List<GetHerosResponse>): List<LocalHero>{
        return getHerosResponse.map { mapGetHeroResponse(it) }
    }

    private fun mapGetHeroResponse(getHeroResponse: GetHerosResponse) : LocalHero {
        return LocalHero(getHeroResponse.id, getHeroResponse.name, false)

    }
}