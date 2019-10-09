package com.example.testrxandretro.di.main


import com.example.testrxandretro.network.main.MainApi
import com.example.testrxandretro.ui.main.post.PostsRecyclerAdapter
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class MainModule{
    @Provides
    fun provideMainApi(retrofit: Retrofit): MainApi {
        return retrofit.create(MainApi::class.java)
    }
 //   @MainScope
    @Provides
    internal fun provideAdapter(): PostsRecyclerAdapter {
        return PostsRecyclerAdapter()
    }
}