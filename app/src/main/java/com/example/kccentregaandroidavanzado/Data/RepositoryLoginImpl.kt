package com.example.kccentregaandroidavanzado.Data

import com.example.kccentregaandroidavanzado.Data.Remote.RemoteDataSource
import com.example.kccentregaandroidavanzado.Data.Remote.RemoteDataSourceImpl
import javax.inject.Inject

class RepositoryLoginImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource): RepositoryLogin {

    override suspend fun login(credentials: String): String? {
        val response = remoteDataSource.login(credentials)

        response?.let {
            return it.toString()
        }
        return null
    }
}