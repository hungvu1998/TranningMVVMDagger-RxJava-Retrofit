package com.example.testrxandretro.ui.main2

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.*
import com.example.testrxandretro.data.model.BreedModel
import com.example.testrxandretro.data.model.DogModel
import com.example.testrxandretro.data.sources.local.Dao
import com.example.testrxandretro.network.main2.Main2Api
import com.example.testrxandretro.ui.main.Resource
import com.example.testrxandretro.util.Utils
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.functions.Function
import io.reactivex.schedulers.Schedulers

import javax.inject.Inject

class Main2ViewModel  @Inject constructor(val main2Api: Main2Api, val utils: Utils) : ViewModel() {


     var dogs: MutableLiveData<DogModel> = MutableLiveData()
    private var posts: MediatorLiveData<Resource<BreedModel>>? = null

    fun observePosts(): LiveData<Resource<BreedModel>> {
        val hasConnection = utils.isConnectedToInternet()
        //Nếu có mạng
        if (posts == null) {
            posts = MediatorLiveData<Resource<BreedModel>>()
            posts!!.setValue(Resource.loading(null as BreedModel?))

            var source: LiveData<Resource<BreedModel>> ?=null
            if(hasConnection) {
                source = getDogbyApi()
            }
            else{
                source=getDogbyDB()
            }
            posts!!.addSource(source) { listResource ->
                posts!!.value=listResource
                posts!!.removeSource(source)
            }
        }
        return posts as MediatorLiveData<Resource<BreedModel>>
    }

    fun getDogbyApi():LiveData<Resource<BreedModel>>{
        Log.d("kiemtra","api")
        return LiveDataReactiveStreams.fromPublisher(
            main2Api.getAllDog2()
                .onErrorReturn { throwable ->
                    Log.d("kiemtra", "apply: ", throwable)
                    val breedModel = BreedModel(null,"Fail")
                    breedModel
                }
                .map(Function<BreedModel, Resource<BreedModel>> { posts ->
                    if (posts.status == "Fail") {
                        return@Function Resource.error("Something went wrong", null)
                    }
                    for(item in posts.message!!){
                        fetchAffenpinscher(item)
                    }
                    Resource.success(posts)
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
        )

    }
    fun getDogbyDB():LiveData<Resource<BreedModel>>{
        Log.d("kiemtra","db")
        val dao: Dao?=null
        return LiveDataReactiveStreams.fromPublisher(
            dao!!.queryRootModel()
                .toFlowable()
                .onErrorReturn { throwable ->
                    Log.d("kiemtra", "apply: ", throwable)
                    val breedModel = BreedModel(null,"Fail")
                    breedModel
                }
                .map(Function<BreedModel, Resource<BreedModel>> { posts ->
                    if (posts.status == "Fail") {
                        return@Function Resource.error("Something went wrong", null)
                    }
                    for(item in posts.message!!){
                        fetchAffenpinscher(item)
                    }


                    Resource.success(posts)
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
        )
    }



    @SuppressLint("CheckResult")
    fun fetchAffenpinscher(name: String){
        main2Api!!.getImage(name)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe {
                it.breedName=name
                dogs.value=it
            }



    }


}