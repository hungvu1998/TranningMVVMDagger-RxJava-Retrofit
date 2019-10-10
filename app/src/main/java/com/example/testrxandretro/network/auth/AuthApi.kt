package com.example.testrxandretro.network.auth

import com.example.testrxandretro.data.model.User
import io.reactivex.Flowable

import retrofit2.http.GET
import retrofit2.http.Path

interface AuthApi{
    @GET("users/{id}")
    abstract fun getUser(@Path("id") id: Int): Flowable<User>
}