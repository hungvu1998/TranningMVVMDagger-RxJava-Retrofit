package com.example.testrxandretro.data.model

class RootBreed {
    var message: List<String>?=null
    var status : String?=null
    constructor()
    constructor( message: List<String>,status : String){
        this.message=message
        this.status=status
    }
}