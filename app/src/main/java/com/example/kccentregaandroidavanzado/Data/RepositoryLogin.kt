package com.example.kccentregaandroidavanzado.Data

interface RepositoryLogin {

    suspend fun login(credentials: String): String?

}