package com.example.kccentregaandroidavanzado.Data

import com.example.kccentregaandroidavanzado.Data.Local.ILocalDataSource
import com.example.kccentregaandroidavanzado.Data.Local.Model.LocalHero
import com.example.kccentregaandroidavanzado.Data.MappingClasses.LocalToSuperHeroMapper
import com.example.kccentregaandroidavanzado.Data.MappingClasses.RemoteToLocalMapper
import com.example.kccentregaandroidavanzado.Data.Remote.RemoteDataSource
import com.example.kccentregaandroidavanzado.SuperHero

class RepositoryImpl(

    private val localDataSource: ILocalDataSource,
    private val remoteDataSource: RemoteDataSource,
    private val  remoteToLocalMapper: RemoteToLocalMapper,
    private val localToSuperHeroMapper: LocalToSuperHeroMapper

): Repository {

    override suspend fun getHeros(): List<SuperHero> {
        if (localDataSource.getHeros().isEmpty()){
            val remoteHeros = remoteDataSource.getHeros()
            localDataSource.insertHeros(remoteToLocalMapper.mapGetHerosResponse(remoteHeros))
        }
        return localToSuperHeroMapper.mapLocalToSuperHeros(localDataSource.getHeros())
    }
}