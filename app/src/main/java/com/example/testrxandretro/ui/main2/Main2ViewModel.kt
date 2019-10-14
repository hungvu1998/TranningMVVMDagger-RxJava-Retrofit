package com.example.testrxandretro.ui.main2

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.*
import com.example.testrxandretro.data.model.BreedModel
import com.example.testrxandretro.data.model.Breeds
import com.example.testrxandretro.data.sources.local.BreedDao
import com.example.testrxandretro.data.sources.local.BreedsDao
import com.example.testrxandretro.network.main2.Main2Api
import com.example.testrxandretro.ui.main.Resource
import com.example.testrxandretro.util.Utils
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


import javax.inject.Inject




class Main2ViewModel  @Inject constructor(val main2Api: Main2Api, val utils: Utils,val breedDao: BreedDao,val breedsDao: BreedsDao) : ViewModel() {


     var dogs: MutableLiveData<BreedModel> = MutableLiveData()
    var breeds: MutableLiveData<ArrayList<Breeds>> = MutableLiveData()
    var dogArrayList: MutableLiveData<ArrayList<BreedModel>> = MutableLiveData()
    var breed2: MutableLiveData<ArrayList<Breeds>> = MutableLiveData()
    var nameBreed: MutableLiveData<String> = MutableLiveData()
    var boolean: MutableLiveData<Boolean> = MutableLiveData()
    fun observePosts() {
        val hasConnection = utils.isConnectedToInternet()
        if(hasConnection){
            Log.d("kiemtraMang","co mang")
            if(breedDao.loadAllUsers().isNotEmpty())
            breedDao.deleteData()
            getObjectBreedRoot()
        }
        else{
            Log.d("kiemtraMang","ko co mang")
            getDogbyDB()



        }
    }
    val arrayBreeds : ArrayList<Breeds> = ArrayList()
    val arrayDog : ArrayList<BreedModel> = ArrayList()
    fun getDogbyDB(){
        for(item in breedsDao.loadAllBreeds()){
            arrayBreeds.add(item)
        }

        for (item in breedDao.loadAllUsers()){
            arrayDog.add(item)
        }
        dogArrayList.value=arrayDog
        breed2.value=arrayBreeds

    }

    @SuppressLint("CheckResult")
    fun getObjectBreedRoot(){
        main2Api.getAllDog2()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                getListImglBreed(it.message!!)
                var x=0

                if (breedsDao.loadAllBreeds().isNotEmpty()){
                    breedsDao.deleteData()
                }
                for(item in it.message!!){
                    arrayBreeds.add(Breeds(x,item))
                    x++
                    breedsDao.insertBreed(Breeds(x,item))
                }
                breeds.value=arrayBreeds


            },{
                Log.d("kiemtra2",""+it.message)
            })
    }

    @SuppressLint("CheckResult")
    fun getListImglBreed(listName : List<String>){
        Observable.fromIterable(listName)
            .map {
                main2Api.getImage2(it)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe({rootBreed ->
                        getDetailBreed(it!!,rootBreed.message!!)

                    },{
                        Log.d("kiemtra2",""+it.message)
                    })
            }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe{

            }

    }
    var i=0
    @SuppressLint("CheckResult")
    fun getDetailBreed(name:String, listImg : List<String>){

        Observable.fromIterable(listImg)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe ({
                val breedModel = BreedModel( i++, name, it)
                dogs.value = breedModel
                 breedDao.insertModel(breedModel)
            },{

            },{
                nameBreed.value=name
            })


    }

}