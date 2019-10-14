package com.example.testrxandretro.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import javax.inject.Inject
import javax.inject.Singleton

//
@Singleton
class SessionValueBreed @Inject constructor() {

    private val cachedBreed = MediatorLiveData<String>()


    fun setValue(source: LiveData<String>) {
        if (cachedBreed != null){
                cachedBreed.addSource(source) {
                cachedBreed.value = it
                cachedBreed.removeSource(source)
            }
        }
    }





    fun getValue(): LiveData<String> {
        return cachedBreed
    }

}