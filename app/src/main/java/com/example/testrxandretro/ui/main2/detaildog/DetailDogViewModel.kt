package com.example.testrxandretro.ui.main2.detaildog

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.testrxandretro.viewmodels.SessionValueBreed
import javax.inject.Inject

class DetailDogViewModel :ViewModel{

    var sessionValueBreed: SessionValueBreed?=null
    @Inject
    constructor( sessionValueBreed: SessionValueBreed) {
        this.sessionValueBreed = sessionValueBreed
    }

    fun getValueBreed(): LiveData<String> {
        return sessionValueBreed!!.getValue()
    }
}