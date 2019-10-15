package com.example.testrxandretro.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
import java.io.Serializable

@Entity
data class BreedModel (
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id:Int ,
    @ColumnInfo(name = "breedName")
    var breedName:String,
    @ColumnInfo(name = "img")
    var img:String,

    @ColumnInfo(typeAffinity = ColumnInfo.BLOB)
    var imgbyte: ByteArray? = null


): Serializable