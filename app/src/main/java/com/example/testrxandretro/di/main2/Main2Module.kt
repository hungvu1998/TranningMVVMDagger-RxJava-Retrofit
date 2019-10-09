package com.example.testrxandretro.di.main2

import com.example.testrxandretro.network.main2.Main2Api

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class Main2Module{
    @Provides
    fun provideMain2Api(retrofit: Retrofit): Main2Api {
        return retrofit.create(Main2Api::class.java)
    }

}