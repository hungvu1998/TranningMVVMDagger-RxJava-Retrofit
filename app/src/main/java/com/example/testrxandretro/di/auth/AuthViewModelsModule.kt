package com.example.testrxandretro.di.auth

import androidx.lifecycle.ViewModel
import com.example.testrxandretro.di.ViewModelKey
import com.example.testrxandretro.ui.auth.AuthViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class AuthViewModelsModule {
    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel::class)
    abstract fun bindAuthViewModel(authViewmodel:AuthViewModel): ViewModel
}