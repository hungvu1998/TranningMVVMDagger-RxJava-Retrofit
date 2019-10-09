package com.example.testrxandretro.ui.main2

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.*
import com.example.testrxandretro.model.BreedModel
import com.example.testrxandretro.model.DogModel
import com.example.testrxandretro.network.main2.Main2Api
import com.example.testrxandretro.ui.main.Resource
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.functions.Function
import io.reactivex.schedulers.Schedulers

import javax.inject.Inject

class Main2ViewModel : ViewModel {
    var main2Api: Main2Api?=null
    @Inject
    constructor(main2Api: Main2Api) {
        this.main2Api=main2Api

    }
     var dogs: MutableLiveData<DogModel> = MutableLiveData()
    private var posts: MediatorLiveData<Resource<BreedModel>>? = null

    fun observePosts(): LiveData<Resource<BreedModel>> {
        if (posts == null) {
            posts = MediatorLiveData<Resource<BreedModel>>()
            posts!!.setValue(Resource.loading(null as BreedModel?))

            val source = LiveDataReactiveStreams.fromPublisher(

                main2Api!!.getAllDog2()

                    .onErrorReturn { throwable ->
                        Log.d("kiemtra", "apply: ", throwable)
                        val breedModel = BreedModel()
                        breedModel.status="Fail"
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

            posts!!.addSource(source,
                Observer<Resource<BreedModel>> { listResource ->
                    posts!!.setValue(listResource)
                    posts!!.removeSource(source)
                })
        }
        return posts as MediatorLiveData<Resource<BreedModel>>
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