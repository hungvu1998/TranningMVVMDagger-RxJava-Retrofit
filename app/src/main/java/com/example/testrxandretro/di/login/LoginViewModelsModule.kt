package com.example.testrxandretro.di.login

import androidx.lifecycle.ViewModel
import com.example.testrxandretro.di.ViewModelKey
import com.example.testrxandretro.ui.auth.AuthViewModel
import com.example.testrxandretro.ui.login.LoginViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class LoginViewModelsModule {
    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel::class)
    abstract fun bindAuthViewModel(loginViewModel: LoginViewModel): ViewModel
}