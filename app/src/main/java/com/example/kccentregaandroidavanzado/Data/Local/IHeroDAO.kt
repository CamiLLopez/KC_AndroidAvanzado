package com.example.kccentregaandroidavanzado.Data.Local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.kccentregaandroidavanzado.Data.Local.Model.LocalHero


@Dao
interface IHeroDAO {

    @Query("SELECT * FROM heros")
    suspend fun getAll(): List<LocalHero>


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllVararg(vararg users: LocalHero)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllList(users: List<LocalHero>)


    @Delete
    suspend fun delete(user: LocalHero)

}