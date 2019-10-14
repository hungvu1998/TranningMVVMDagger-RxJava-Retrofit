package com.example.testrxandretro.data.model;

import java.lang.System;

@androidx.room.Entity(tableName = "tblDetailDog")
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u001c\b\u0001\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0007J\u001d\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0004H\u00c6\u0003J1\u0010\u000e\u001a\u00020\u00002\u001c\b\u0003\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0004H\u00d6\u0001R*\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/example/testrxandretro/data/model/DogModel;", "Ljava/io/Serializable;", "message", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "status", "(Ljava/util/ArrayList;Ljava/lang/String;)V", "getMessage", "()Ljava/util/ArrayList;", "getStatus", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
public final class DogModel implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "message")
    private final java.util.ArrayList<java.lang.String> message = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "status")
    private final java.lang.String status = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.String> getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public DogModel(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "message")
    java.util.ArrayList<java.lang.String> message, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "status")
    java.lang.String status) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.String> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testrxandretro.data.model.DogModel copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "message")
    java.util.ArrayList<java.lang.String> message, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "status")
    java.lang.String status) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}