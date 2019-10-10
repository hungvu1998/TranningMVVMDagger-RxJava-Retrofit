package com.example.testrxandretro.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json
import java.io.Serializable
//class DogModel {
//    @SerializedName("message")
//    @Expose
//    var message: ArrayList<String>?= ArrayList()
//
//
//
//    @SerializedName("status")
//    @Expose
//    var status: String? = null
//
//    var breedName:String?=null
//
//    constructor()
//    constructor(message: ArrayList<String>,status: String,breedName:String) {
//        this.message=message
//        this.status=status
//        this.breedName=breedName
//    }
//
//}

@Entity(
    tableName = "tblDetailDog"
)
data class DogModel(
    @PrimaryKey
    @ColumnInfo(name = "breedName")
    var breedName: String,

    @Json(name = "message")
    @ColumnInfo(name = "message")
    val message: ArrayList<String>?,

    @Json(name = "status")
    @ColumnInfo(name = "status")
    val status: String
): Serializable