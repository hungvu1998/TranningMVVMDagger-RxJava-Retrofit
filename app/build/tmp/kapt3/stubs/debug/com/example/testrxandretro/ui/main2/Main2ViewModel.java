package com.example.testrxandretro.ui.main2;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0018R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0004R\u001c\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/testrxandretro/ui/main2/Main2ViewModel;", "Landroidx/lifecycle/ViewModel;", "main2Api", "Lcom/example/testrxandretro/network/main2/Main2Api;", "(Lcom/example/testrxandretro/network/main2/Main2Api;)V", "dogs", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/testrxandretro/model/DogModel;", "getDogs", "()Landroidx/lifecycle/MutableLiveData;", "setDogs", "(Landroidx/lifecycle/MutableLiveData;)V", "getMain2Api", "()Lcom/example/testrxandretro/network/main2/Main2Api;", "setMain2Api", "posts", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/example/testrxandretro/ui/main/Resource;", "Lcom/example/testrxandretro/model/BreedModel;", "fetchAffenpinscher", "", "name", "", "observePosts", "Landroidx/lifecycle/LiveData;", "app_debug"})
public final class Main2ViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable()
    private com.example.testrxandretro.network.main2.Main2Api main2Api;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.testrxandretro.model.DogModel> dogs;
    private androidx.lifecycle.MediatorLiveData<com.example.testrxandretro.ui.main.Resource<com.example.testrxandretro.model.BreedModel>> posts;
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.testrxandretro.network.main2.Main2Api getMain2Api() {
        return null;
    }
    
    public final void setMain2Api(@org.jetbrains.annotations.Nullable()
    com.example.testrxandretro.network.main2.Main2Api p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.testrxandretro.model.DogModel> getDogs() {
        return null;
    }
    
    public final void setDogs(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.testrxandretro.model.DogModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.testrxandretro.ui.main.Resource<com.example.testrxandretro.model.BreedModel>> observePosts() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void fetchAffenpinscher(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    @javax.inject.Inject()
    public Main2ViewModel(@org.jetbrains.annotations.NotNull()
    com.example.testrxandretro.network.main2.Main2Api main2Api) {
        super();
    }
}