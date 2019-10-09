package com.example.testrxandretro.di.main2

import androidx.lifecycle.ViewModel
import com.example.testrxandretro.di.ViewModelKey
import com.example.testrxandretro.ui.main2.Main2ViewModel
import com.example.testrxandretro.ui.main2.dog.DogViewModel


import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class Main2ViewModelsModule {


    @Binds
    @IntoMap
    @ViewModelKey(Main2ViewModel::class)
    abstract fun binMain2ViewModel(viewModel: Main2ViewModel): ViewModel



    @Binds
    @IntoMap
    @ViewModelKey(DogViewModel::class)
    abstract fun bindCatViewModel(viewModel: DogViewModel): ViewModel



}