package com.example.testrxandretro.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/example/testrxandretro/data/model/DogState;", "", "()V", "BreedListAllRecieved", "DownLoadImage", "Error", "RandomDogRecieved", "SearchDogRecieved", "SubDogRansomRecieved", "Lcom/example/testrxandretro/data/model/DogState$Error;", "Lcom/example/testrxandretro/data/model/DogState$RandomDogRecieved;", "Lcom/example/testrxandretro/data/model/DogState$SearchDogRecieved;", "Lcom/example/testrxandretro/data/model/DogState$BreedListAllRecieved;", "Lcom/example/testrxandretro/data/model/DogState$SubDogRansomRecieved;", "Lcom/example/testrxandretro/data/model/DogState$DownLoadImage;", "app_debug"})
public abstract class DogState {
    
    private DogState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/testrxandretro/data/model/DogState$Error;", "Lcom/example/testrxandretro/data/model/DogState;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "app_debug"})
    public static final class Error extends com.example.testrxandretro.data.model.DogState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Throwable error = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Throwable getError() {
            return null;
        }
        
        public Error(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable error) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/testrxandretro/data/model/DogState$RandomDogRecieved;", "Lcom/example/testrxandretro/data/model/DogState;", "image", "", "(Ljava/lang/String;)V", "getImage", "()Ljava/lang/String;", "app_debug"})
    public static final class RandomDogRecieved extends com.example.testrxandretro.data.model.DogState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String image = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getImage() {
            return null;
        }
        
        public RandomDogRecieved(@org.jetbrains.annotations.NotNull()
        java.lang.String image) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/testrxandretro/data/model/DogState$SearchDogRecieved;", "Lcom/example/testrxandretro/data/model/DogState;", "images", "", "", "(Ljava/util/List;)V", "getImages", "()Ljava/util/List;", "app_debug"})
    public static final class SearchDogRecieved extends com.example.testrxandretro.data.model.DogState {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> images = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getImages() {
            return null;
        }
        
        public SearchDogRecieved(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> images) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/testrxandretro/data/model/DogState$BreedListAllRecieved;", "Lcom/example/testrxandretro/data/model/DogState;", "breedObj", "", "(Ljava/lang/Object;)V", "getBreedObj", "()Ljava/lang/Object;", "app_debug"})
    public static final class BreedListAllRecieved extends com.example.testrxandretro.data.model.DogState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Object breedObj = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object getBreedObj() {
            return null;
        }
        
        public BreedListAllRecieved(@org.jetbrains.annotations.NotNull()
        java.lang.Object breedObj) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/testrxandretro/data/model/DogState$SubDogRansomRecieved;", "Lcom/example/testrxandretro/data/model/DogState;", "image", "", "(Ljava/lang/String;)V", "getImage", "()Ljava/lang/String;", "app_debug"})
    public static final class SubDogRansomRecieved extends com.example.testrxandretro.data.model.DogState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String image = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getImage() {
            return null;
        }
        
        public SubDogRansomRecieved(@org.jetbrains.annotations.NotNull()
        java.lang.String image) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/testrxandretro/data/model/DogState$DownLoadImage;", "Lcom/example/testrxandretro/data/model/DogState;", "image", "", "([B)V", "getImage", "()[B", "app_debug"})
    public static final class DownLoadImage extends com.example.testrxandretro.data.model.DogState {
        @org.jetbrains.annotations.NotNull()
        private final byte[] image = null;
        
        @org.jetbrains.annotations.NotNull()
        public final byte[] getImage() {
            return null;
        }
        
        public DownLoadImage(@org.jetbrains.annotations.NotNull()
        byte[] image) {
            super();
        }
    }
}