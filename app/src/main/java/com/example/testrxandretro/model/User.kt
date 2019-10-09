package com.example.testrxandretro.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class User {

    @SerializedName("id")
    @Expose
     var id: Int = 0

    @SerializedName("username")
    @Expose
     var username: String? = null

    @SerializedName("email")
    @Expose
     var email: String? = null

    @SerializedName("website")
    @Expose
     var website: String? = null

    constructor()
    constructor(id: Int, username: String?, email: String?, website: String?) {
        this.id = id
        this.username = username
        this.email = email
        this.website = website
    }

}