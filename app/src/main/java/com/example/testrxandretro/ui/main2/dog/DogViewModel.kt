package com.example.testrxandretro.ui.main2.dog


import androidx.lifecycle.*

import com.example.testrxandretro.viewmodels.SessionValueBreed

import javax.inject.Inject

class DogViewModel @Inject constructor() : ViewModel() {
    var sessionValueBreed:SessionValueBreed?=null
    var liveData:MutableLiveData<String> = MutableLiveData()


}



