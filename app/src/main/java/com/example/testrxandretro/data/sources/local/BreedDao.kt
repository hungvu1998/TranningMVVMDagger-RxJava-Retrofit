package com.example.testrxandretro.data.sources.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.testrxandretro.data.model.BreedModel
import com.example.testrxandretro.data.model.Breeds
import io.reactivex.Observable


@Dao
interface BreedDao {


    @Query("SELECT * FROM BreedModel where id =:i_d ")
    fun selectOne(i_d:Int): Observable<BreedModel>

    @Query("SELECT * FROM BreedModel")
    fun loadAllUsers(): Array<BreedModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertModel(breedModel: BreedModel)

    @Query("DELETE FROM BreedModel")
    fun deleteData()

}