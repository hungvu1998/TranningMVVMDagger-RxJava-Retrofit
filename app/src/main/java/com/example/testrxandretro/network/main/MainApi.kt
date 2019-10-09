package com.example.testrxandretro.network.main

import com.example.testrxandretro.model.Post
import com.example.testrxandretro.model.User
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MainApi{

    // /posts?userId=1/
    @GET("posts")
    abstract fun getPostsFromUser(@Query("userId") id: Int): Flowable<List<Post>>
}