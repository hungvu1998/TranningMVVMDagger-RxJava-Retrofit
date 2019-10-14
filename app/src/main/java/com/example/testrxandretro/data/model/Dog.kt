package com.example.testrxandretro.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Dog {
    var breedName:String?=null
    var listBreeds : ArrayList<BreedModel> = ArrayList()
    constructor()
    constructor(breedName:String,listBreeds : ArrayList<BreedModel>){
        this.breedName=breedName
        this.listBreeds=listBreeds
    }
}