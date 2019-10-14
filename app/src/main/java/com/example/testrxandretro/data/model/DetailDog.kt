package com.example.testrxandretro.data.model

import android.graphics.Bitmap

class DetailDog {
    var breedName:String?=null
    var bitmap:Bitmap?=null
    constructor(breedName: String,bitmap: Bitmap){
        this.breedName=breedName
        this.bitmap=bitmap
    }

}