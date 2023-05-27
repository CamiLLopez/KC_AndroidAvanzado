package com.example.kccentregaandroidavanzado.Utils

import com.example.kccentregaandroidavanzado.Data.Remote.RemoteDataSource
import com.example.kccentregaandroidavanzado.Data.Remote.RemoteDataSourceImpl
import com.example.kccentregaandroidavanzado.Data.Repository
import com.example.kccentregaandroidavanzado.Data.RepositoryImpl
import com.example.kccentregaandroidavanzado.Data.RepositoryLogin
import com.example.kccentregaandroidavanzado.Data.RepositoryLoginImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoriesModule {

    @Binds
    abstract fun bindsRepository(repositoryImpl: RepositoryImpl): Repository

    @Binds
    abstract fun bindsLoginRepository(repositoryLoginImpl: RepositoryLoginImpl): RepositoryLogin

    @Binds
    abstract fun bindsRemoteDataSource(remoteDataSourceImpl: RemoteDataSourceImpl): RemoteDataSource
}