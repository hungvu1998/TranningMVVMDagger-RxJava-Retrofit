package com.example.testrxandretro.di.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lcom/example/testrxandretro/di/main/MainModule;", "", "()V", "provideAdapter", "Lcom/example/testrxandretro/ui/main/post/PostsRecyclerAdapter;", "provideAdapter$app_debug", "provideMainApi", "Lcom/example/testrxandretro/network/main/MainApi;", "retrofit", "Lretrofit2/Retrofit;", "app_debug"})
@dagger.Module()
public final class MainModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.testrxandretro.network.main.MainApi provideMainApi(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.testrxandretro.ui.main.post.PostsRecyclerAdapter provideAdapter$app_debug() {
        return null;
    }
    
    public MainModule() {
        super();
    }
}