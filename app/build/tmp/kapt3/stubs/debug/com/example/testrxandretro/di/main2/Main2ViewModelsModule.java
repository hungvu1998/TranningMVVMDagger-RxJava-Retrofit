package com.example.testrxandretro.di.main2;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/example/testrxandretro/di/main2/Main2ViewModelsModule;", "", "()V", "binDetailDogViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/example/testrxandretro/ui/main2/detaildog/DetailDogViewModel;", "binMain2ViewModel", "Lcom/example/testrxandretro/ui/main2/Main2ViewModel;", "bindCatViewModel", "Lcom/example/testrxandretro/ui/main2/dog/DogViewModel;", "app_debug"})
@dagger.Module()
public abstract class Main2ViewModelsModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.example.testrxandretro.di.ViewModelKey(value = com.example.testrxandretro.ui.main2.Main2ViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel binMain2ViewModel(@org.jetbrains.annotations.NotNull()
    com.example.testrxandretro.ui.main2.Main2ViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.example.testrxandretro.di.ViewModelKey(value = com.example.testrxandretro.ui.main2.dog.DogViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindCatViewModel(@org.jetbrains.annotations.NotNull()
    com.example.testrxandretro.ui.main2.dog.DogViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.example.testrxandretro.di.ViewModelKey(value = com.example.testrxandretro.ui.main2.detaildog.DetailDogViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel binDetailDogViewModel(@org.jetbrains.annotations.NotNull()
    com.example.testrxandretro.ui.main2.detaildog.DetailDogViewModel viewModel);
    
    public Main2ViewModelsModule() {
        super();
    }
}