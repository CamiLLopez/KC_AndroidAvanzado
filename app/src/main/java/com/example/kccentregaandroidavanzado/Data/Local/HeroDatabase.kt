package com.example.kccentregaandroidavanzado.Data.Local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.kccentregaandroidavanzado.Data.Local.Model.LocalHero


@Database(entities = [LocalHero::class], version = 1)
abstract class HeroDatabase: RoomDatabase() {

    abstract fun heroDao(): IHeroDAO
}