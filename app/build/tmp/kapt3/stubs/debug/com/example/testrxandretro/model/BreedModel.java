package com.example.testrxandretro.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B5\b\u0016\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n\u00a2\u0006\u0002\u0010\u000bR*\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0018"}, d2 = {"Lcom/example/testrxandretro/model/BreedModel;", "", "()V", "message", "", "", "status", "listDogModel", "Ljava/util/ArrayList;", "Lcom/example/testrxandretro/model/DogModel;", "Lkotlin/collections/ArrayList;", "(Ljava/util/List;Ljava/lang/String;Ljava/util/ArrayList;)V", "getListDogModel", "()Ljava/util/ArrayList;", "setListDogModel", "(Ljava/util/ArrayList;)V", "getMessage", "()Ljava/util/List;", "setMessage", "(Ljava/util/List;)V", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "app_debug"})
public final class BreedModel {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "message")
    private java.util.List<java.lang.String> message;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "status")
    private java.lang.String status;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.testrxandretro.model.DogModel> listDogModel;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.testrxandretro.model.DogModel> getListDogModel() {
        return null;
    }
    
    public final void setListDogModel(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.testrxandretro.model.DogModel> p0) {
    }
    
    public BreedModel() {
        super();
    }
    
    public BreedModel(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> message, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.testrxandretro.model.DogModel> listDogModel) {
        super();
    }
}