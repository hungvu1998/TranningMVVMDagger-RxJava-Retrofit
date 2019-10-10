package com.example.testrxandretro.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import com.squareup.moshi.Json
import java.io.Serializable

//class BreedModel {
//    @SerializedName("message")
//    @Expose
//    var message: List<String>?=null
//
//
//
//    @SerializedName("status")
//    @Expose
//    var status: String? = null
//
//    var listDogModel:ArrayList<DogModel> =  ArrayList()
//    constructor()
//    constructor(message: List<String>,status: String, listDogModel:ArrayList<DogModel>) {
//       this.message=message
//        this.status=status
//        this.listDogModel=listDogModel
//    }
//
//}


@Entity(
    tableName = "tblBreed"
)
data class BreedModel(
//    @PrimaryKey(autoGenerate=true)
//    @ColumnInfo(name = "id")
//    val id: Int,

    @Json(name = "message")
    @ColumnInfo(name = "message")
    val message: List<String>?,

    @Json(name = "status")
    @ColumnInfo(name = "status")
    val status: String


): Serializable