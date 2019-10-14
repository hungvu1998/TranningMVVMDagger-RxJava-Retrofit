package com.example.testrxandretro.di.main2

import com.example.testrxandretro.ui.main2.detaildog.DetailDogFragment
import com.example.testrxandretro.ui.main2.dog.DogFragment

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class Main2FragmentBuildersModule {


    @ContributesAndroidInjector
    abstract fun constributeCatFragment():DogFragment
    @ContributesAndroidInjector
    abstract fun constributeDetailDogFragment(): DetailDogFragment
}