package com.example.testrxandretro.data.sources.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.testrxandretro.data.model.BreedModel
import com.example.testrxandretro.data.model.RootModel
import io.reactivex.Single

@Dao
interface Dao {

    @Query("SELECT * FROM root ")
    fun queryRootModel(): Single<BreedModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCryptocurrency(rootModel: RootModel)

}