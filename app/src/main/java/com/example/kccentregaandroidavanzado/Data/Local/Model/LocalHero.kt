package com.example.kccentregaandroidavanzado.Data.Local.Model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "heros")
data class LocalHero(

    @PrimaryKey @ColumnInfo(name = "id") val id: String,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "favorite") val favorite: Boolean
)
