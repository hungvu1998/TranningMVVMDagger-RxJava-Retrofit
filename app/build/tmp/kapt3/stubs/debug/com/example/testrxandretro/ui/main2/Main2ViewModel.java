package com.example.testrxandretro.ui.main2;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u001bJ\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u001bJ\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u001bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001e"}, d2 = {"Lcom/example/testrxandretro/ui/main2/Main2ViewModel;", "Landroidx/lifecycle/ViewModel;", "main2Api", "Lcom/example/testrxandretro/network/main2/Main2Api;", "utils", "Lcom/example/testrxandretro/util/Utils;", "(Lcom/example/testrxandretro/network/main2/Main2Api;Lcom/example/testrxandretro/util/Utils;)V", "dogs", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/testrxandretro/data/model/DogModel;", "getDogs", "()Landroidx/lifecycle/MutableLiveData;", "setDogs", "(Landroidx/lifecycle/MutableLiveData;)V", "getMain2Api", "()Lcom/example/testrxandretro/network/main2/Main2Api;", "posts", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/example/testrxandretro/ui/main/Resource;", "Lcom/example/testrxandretro/data/model/BreedModel;", "getUtils", "()Lcom/example/testrxandretro/util/Utils;", "fetchAffenpinscher", "", "name", "", "getDogbyApi", "Landroidx/lifecycle/LiveData;", "getDogbyDB", "observePosts", "app_debug"})
public final class Main2ViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.testrxandretro.data.model.DogModel> dogs;
    private androidx.lifecycle.MediatorLiveData<com.example.testrxandretro.ui.main.Resource<com.example.testrxandretro.data.model.BreedModel>> posts;
    @org.jetbrains.annotations.NotNull()
    private final com.example.testrxandretro.network.main2.Main2Api main2Api = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.testrxandretro.util.Utils utils = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.testrxandretro.data.model.DogModel> getDogs() {
        return null;
    }
    
    public final void setDogs(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.testrxandretro.data.model.DogModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.testrxandretro.ui.main.Resource<com.example.testrxandretro.data.model.BreedModel>> observePosts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.testrxandretro.ui.main.Resource<com.example.testrxandretro.data.model.BreedModel>> getDogbyApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.testrxandretro.ui.main.Resource<com.example.testrxandretro.data.model.BreedModel>> getDogbyDB() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void fetchAffenpinscher(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testrxandretro.network.main2.Main2Api getMain2Api() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testrxandretro.util.Utils getUtils() {
        return null;
    }
    
    @javax.inject.Inject()
    public Main2ViewModel(@org.jetbrains.annotations.NotNull()
    com.example.testrxandretro.network.main2.Main2Api main2Api, @org.jetbrains.annotations.NotNull()
    com.example.testrxandretro.util.Utils utils) {
        super();
    }
}