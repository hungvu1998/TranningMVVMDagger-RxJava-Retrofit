package com.example.testrxandretro.ui.main2.dog


import androidx.lifecycle.*

import com.example.testrxandretro.viewmodels.SessionValueBreed

import javax.inject.Inject

class DogViewModel  : ViewModel {
    var sessionValueBreed: SessionValueBreed?=null
    @Inject
    constructor(sessionValueBreed:SessionValueBreed){
        this.sessionValueBreed=sessionValueBreed
    }

    var liveData: MutableLiveData<String> = MutableLiveData()
    fun setValueSession(img: String){
        liveData.value=img
        sessionValueBreed!!.setValue(liveData!!)
    }
    fun observeValueBreed(): LiveData<String> {
        return sessionValueBreed!!.getValue()

    }


}



