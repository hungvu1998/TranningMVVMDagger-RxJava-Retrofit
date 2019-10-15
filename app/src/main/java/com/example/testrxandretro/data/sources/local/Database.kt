package com.example.testrxandretro.data.sources.local
import androidx.room.RoomDatabase
import  androidx.room.Database
import com.example.testrxandretro.data.model.BreedModel
import com.example.testrxandretro.data.model.Breeds

@Database(entities = arrayOf(BreedModel::class, Breeds::class), version = 10)
abstract class Database : RoomDatabase() {
    abstract fun breedDao(): BreedDao
    abstract fun breedsDao(): BreedsDao
}
