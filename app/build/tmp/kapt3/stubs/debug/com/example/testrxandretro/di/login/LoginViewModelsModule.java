package com.example.testrxandretro.di.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/example/testrxandretro/di/login/LoginViewModelsModule;", "", "()V", "bindAuthViewModel", "Landroidx/lifecycle/ViewModel;", "loginViewModel", "Lcom/example/testrxandretro/ui/login/LoginViewModel;", "app_debug"})
@dagger.Module()
public abstract class LoginViewModelsModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.example.testrxandretro.di.ViewModelKey(value = com.example.testrxandretro.ui.login.LoginViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindAuthViewModel(@org.jetbrains.annotations.NotNull()
    com.example.testrxandretro.ui.login.LoginViewModel loginViewModel);
    
    public LoginViewModelsModule() {
        super();
    }
}