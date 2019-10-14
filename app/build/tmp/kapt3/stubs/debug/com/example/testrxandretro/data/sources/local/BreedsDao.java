package com.example.testrxandretro.data.sources.local;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0013\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\'\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/example/testrxandretro/data/sources/local/BreedsDao;", "", "deleteData", "", "insertBreed", "breeds", "Lcom/example/testrxandretro/data/model/Breeds;", "loadAllBreeds", "", "()[Lcom/example/testrxandretro/data/model/Breeds;", "app_debug"})
public abstract interface BreedsDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertBreed(@org.jetbrains.annotations.NotNull()
    com.example.testrxandretro.data.model.Breeds breeds);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Breeds")
    public abstract com.example.testrxandretro.data.model.Breeds[] loadAllBreeds();
    
    @androidx.room.Query(value = "DELETE FROM Breeds")
    public abstract void deleteData();
}