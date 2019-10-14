package com.example.testrxandretro.di.main2;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/example/testrxandretro/di/main2/Main2FragmentBuildersModule;", "", "()V", "constributeCatFragment", "Lcom/example/testrxandretro/ui/main2/dog/DogFragment;", "constributeDetailDogFragment", "Lcom/example/testrxandretro/ui/main2/detaildog/DetailDogFragment;", "app_debug"})
@dagger.Module()
public abstract class Main2FragmentBuildersModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.example.testrxandretro.ui.main2.dog.DogFragment constributeCatFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.example.testrxandretro.ui.main2.detaildog.DetailDogFragment constributeDetailDogFragment();
    
    public Main2FragmentBuildersModule() {
        super();
    }
}