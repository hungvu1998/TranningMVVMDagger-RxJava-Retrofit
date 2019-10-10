package com.example.testrxandretro.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Dog {
    @SerializedName("message")
    @Expose
     var message: List<String>? = null

    @SerializedName("status")
    @Expose
    var status: String?=null



    constructor()
    constructor(message: List<String>?, status: String?) {
        this.message = message
        this.status = status

    }
}