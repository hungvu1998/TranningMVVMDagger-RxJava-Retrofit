package com.example.testrxandretro.data.sources.local;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0013\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\'\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\f\u001a\u00020\rH\'\u00a8\u0006\u000e"}, d2 = {"Lcom/example/testrxandretro/data/sources/local/BreedDao;", "", "deleteData", "", "insertModel", "breedModel", "Lcom/example/testrxandretro/data/model/BreedModel;", "loadAllUsers", "", "()[Lcom/example/testrxandretro/data/model/BreedModel;", "selectOne", "Lio/reactivex/Observable;", "i_d", "", "app_debug"})
public abstract interface BreedDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM BreedModel where id =:i_d ")
    public abstract io.reactivex.Observable<com.example.testrxandretro.data.model.BreedModel> selectOne(int i_d);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM BreedModel")
    public abstract com.example.testrxandretro.data.model.BreedModel[] loadAllUsers();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertModel(@org.jetbrains.annotations.NotNull()
    com.example.testrxandretro.data.model.BreedModel breedModel);
    
    @androidx.room.Query(value = "DELETE FROM BreedModel")
    public abstract void deleteData();
}