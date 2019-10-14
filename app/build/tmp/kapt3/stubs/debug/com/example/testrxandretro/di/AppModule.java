package com.example.testrxandretro.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0001\u00a2\u0006\u0002\b\u0014J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\b\u0010\u0019\u001a\u00020\u0018H\u0007J\r\u0010\u001a\u001a\u00020\u001bH\u0001\u00a2\u0006\u0002\b\u001cJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\u001f\u001a\u00020 H\u0007R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006!"}, d2 = {"Lcom/example/testrxandretro/di/AppModule;", "", "()V", "MIGRATION_1_2", "Landroidx/room/migration/Migration;", "getMIGRATION_1_2", "()Landroidx/room/migration/Migration;", "MIGRATION_2_3", "getMIGRATION_2_3", "provideAppDrawable", "Landroid/graphics/drawable/Drawable;", "application", "Landroid/app/Application;", "provideBreedDao", "Lcom/example/testrxandretro/data/sources/local/BreedDao;", "database", "Lcom/example/testrxandretro/data/sources/local/Database;", "provideBreedsDao", "Lcom/example/testrxandretro/data/sources/local/BreedsDao;", "provideDatabase", "provideDatabase$app_debug", "provideGlideInstanse", "Lcom/bumptech/glide/RequestManager;", "requestOptions", "Lcom/bumptech/glide/request/RequestOptions;", "provideRequestOption", "provideRetrofitInstance", "Lretrofit2/Retrofit;", "provideRetrofitInstance$app_debug", "provideUtils", "Lcom/example/testrxandretro/util/Utils;", "someThing", "", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    private final androidx.room.migration.Migration MIGRATION_1_2 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.room.migration.Migration MIGRATION_2_3 = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final java.lang.String someThing() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.bumptech.glide.request.RequestOptions provideRequestOption() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.bumptech.glide.RequestManager provideGlideInstanse(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.request.RequestOptions requestOptions) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final android.graphics.drawable.Drawable provideAppDrawable(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit provideRetrofitInstance$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.testrxandretro.util.Utils provideUtils(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.testrxandretro.data.sources.local.Database provideDatabase$app_debug(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.testrxandretro.data.sources.local.BreedDao provideBreedDao(@org.jetbrains.annotations.NotNull()
    com.example.testrxandretro.data.sources.local.Database database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.testrxandretro.data.sources.local.BreedsDao provideBreedsDao(@org.jetbrains.annotations.NotNull()
    com.example.testrxandretro.data.sources.local.Database database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.room.migration.Migration getMIGRATION_1_2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.room.migration.Migration getMIGRATION_2_3() {
        return null;
    }
    
    public AppModule() {
        super();
    }
}