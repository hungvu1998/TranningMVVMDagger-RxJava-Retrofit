package com.example.testrxandretro.di

import androidx.lifecycle.ViewModelProvider
import com.example.testrxandretro.viewmodels.ViewModelProvidersFactory
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class ViewModelFactoryModule {
    @Binds
    abstract fun bindViewModelFactory(modelProviderFactory: ViewModelProvidersFactory):ViewModelProvider.Factory

}