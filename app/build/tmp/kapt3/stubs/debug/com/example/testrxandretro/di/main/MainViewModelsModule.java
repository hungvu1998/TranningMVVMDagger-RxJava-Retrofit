package com.example.testrxandretro.di.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/example/testrxandretro/di/main/MainViewModelsModule;", "", "()V", "bindPostViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/example/testrxandretro/ui/main/post/PostViewModel;", "bindProfileViewModel", "Lcom/example/testrxandretro/ui/main/profile/ProfileViewModel;", "app_debug"})
@dagger.Module()
public abstract class MainViewModelsModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.example.testrxandretro.di.ViewModelKey(value = com.example.testrxandretro.ui.main.profile.ProfileViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindProfileViewModel(@org.jetbrains.annotations.NotNull()
    com.example.testrxandretro.ui.main.profile.ProfileViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.example.testrxandretro.di.ViewModelKey(value = com.example.testrxandretro.ui.main.post.PostViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindPostViewModel(@org.jetbrains.annotations.NotNull()
    com.example.testrxandretro.ui.main.post.PostViewModel viewModel);
    
    public MainViewModelsModule() {
        super();
    }
}