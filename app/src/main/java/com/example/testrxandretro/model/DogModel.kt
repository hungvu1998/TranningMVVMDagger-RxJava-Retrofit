package com.example.testrxandretro.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class DogModel {
    @SerializedName("message")
    @Expose
    var message: ArrayList<String>?=null



    @SerializedName("status")
    @Expose
    var status: String? = null

    var breedName:String?=null

    constructor()
    constructor(message: ArrayList<String>,status: String,breedName:String) {
        this.message=message
        this.status=status
        this.breedName=breedName
    }

}