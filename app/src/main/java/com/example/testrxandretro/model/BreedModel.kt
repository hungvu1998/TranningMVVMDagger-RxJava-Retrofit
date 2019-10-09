package com.example.testrxandretro.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class BreedModel {
    @SerializedName("message")
    @Expose
    var message: List<String>?=null



    @SerializedName("status")
    @Expose
    var status: String? = null

    var listDogModel:ArrayList<DogModel> =  ArrayList()
    constructor()
    constructor(message: List<String>,status: String, listDogModel:ArrayList<DogModel>) {
       this.message=message
        this.status=status
        this.listDogModel=listDogModel
    }

}