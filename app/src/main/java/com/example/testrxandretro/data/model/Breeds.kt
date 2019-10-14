package com.example.testrxandretro.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
data class Breeds (
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id:Int ,
    @ColumnInfo(name = "breedName")
    var breedName:String


): Serializable