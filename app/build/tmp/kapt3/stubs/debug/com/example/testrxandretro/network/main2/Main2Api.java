package com.example.testrxandretro.network.main2;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH\'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\n\u001a\u00020\u000bH\'\u00a8\u0006\r"}, d2 = {"Lcom/example/testrxandretro/network/main2/Main2Api;", "", "getAllDog", "Lio/reactivex/Observable;", "Lcom/example/testrxandretro/data/model/RootModel;", "getAllDog2", "Lio/reactivex/Flowable;", "Lcom/example/testrxandretro/data/model/BreedModel;", "getImage", "Lcom/example/testrxandretro/data/model/DogModel;", "name", "", "getImage2", "app_debug"})
public abstract interface Main2Api {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "breeds/list/all")
    public abstract io.reactivex.Observable<com.example.testrxandretro.data.model.RootModel> getAllDog();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "breed/{name}/images")
    public abstract io.reactivex.Observable<com.example.testrxandretro.data.model.DogModel> getImage(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "name")
    java.lang.String name);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "breeds/list/")
    public abstract io.reactivex.Flowable<com.example.testrxandretro.data.model.BreedModel> getAllDog2();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "breed/{name}/images")
    public abstract io.reactivex.Flowable<com.example.testrxandretro.data.model.BreedModel> getImage2(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "name")
    java.lang.String name);
}