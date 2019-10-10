package com.example.testrxandretro.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
import java.io.Serializable

@Entity(
    tableName = "root"
)
data class RootModel(

    @Json(name = "message")
    @ColumnInfo(name = "message")
    val message: List<String>,

    @Json(name = "status")
    @ColumnInfo(name = "status")
    val status: String
) : Serializable