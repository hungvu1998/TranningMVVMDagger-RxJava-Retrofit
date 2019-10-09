package com.example.testrxandretro.network.main2

import com.example.testrxandretro.model.*
import io.reactivex.Flowable
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface Main2Api{


    @GET("breeds/list/all")
    abstract fun getAllDog():Observable<ResponseBreedList>


    @GET("breed/{name}/images")
    abstract fun getImage(@Path("name") name: String): Observable<DogModel>



    @GET("breeds/list/")
    abstract fun getAllDog2():Flowable<BreedModel>


    @GET("breed/{name}/images")
    abstract fun getImage2(@Path("name") name: String): Flowable<BreedModel>
}