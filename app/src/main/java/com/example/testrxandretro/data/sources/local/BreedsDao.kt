package com.example.testrxandretro.data.sources.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.testrxandretro.data.model.BreedModel
import com.example.testrxandretro.data.model.Breeds
import io.reactivex.Observable

@Dao
interface BreedsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertBreed(breeds: Breeds)


    @Query("SELECT * FROM Breeds")
    fun loadAllBreeds(): Array<Breeds>

    @Query("DELETE FROM Breeds")
    fun deleteData()
}