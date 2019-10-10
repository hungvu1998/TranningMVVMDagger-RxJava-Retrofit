package com.example.testrxandretro.data.sources.local;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\'\u00a8\u0006\t"}, d2 = {"Lcom/example/testrxandretro/data/sources/local/Dao;", "", "insertCryptocurrency", "", "rootModel", "Lcom/example/testrxandretro/data/model/RootModel;", "queryRootModel", "Lio/reactivex/Single;", "Lcom/example/testrxandretro/data/model/BreedModel;", "app_debug"})
public abstract interface Dao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM root ")
    public abstract io.reactivex.Single<com.example.testrxandretro.data.model.BreedModel> queryRootModel();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertCryptocurrency(@org.jetbrains.annotations.NotNull()
    com.example.testrxandretro.data.model.RootModel rootModel);
}