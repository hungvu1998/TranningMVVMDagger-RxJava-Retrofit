package com.example.testrxandretro.ui.main.post;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r0\u0015R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0016"}, d2 = {"Lcom/example/testrxandretro/ui/main/post/PostViewModel;", "Landroidx/lifecycle/ViewModel;", "mainApi", "Lcom/example/testrxandretro/network/main/MainApi;", "sessionManager", "Lcom/example/testrxandretro/viewmodels/SessionManager;", "(Lcom/example/testrxandretro/network/main/MainApi;Lcom/example/testrxandretro/viewmodels/SessionManager;)V", "getMainApi", "()Lcom/example/testrxandretro/network/main/MainApi;", "setMainApi", "(Lcom/example/testrxandretro/network/main/MainApi;)V", "posts", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/example/testrxandretro/ui/main/Resource;", "", "Lcom/example/testrxandretro/data/model/Post;", "getSessionManager", "()Lcom/example/testrxandretro/viewmodels/SessionManager;", "setSessionManager", "(Lcom/example/testrxandretro/viewmodels/SessionManager;)V", "observePosts", "Landroidx/lifecycle/LiveData;", "app_debug"})
public final class PostViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable()
    private com.example.testrxandretro.viewmodels.SessionManager sessionManager;
    @org.jetbrains.annotations.Nullable()
    private com.example.testrxandretro.network.main.MainApi mainApi;
    private androidx.lifecycle.MediatorLiveData<com.example.testrxandretro.ui.main.Resource<java.util.List<com.example.testrxandretro.data.model.Post>>> posts;
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.testrxandretro.viewmodels.SessionManager getSessionManager() {
        return null;
    }
    
    public final void setSessionManager(@org.jetbrains.annotations.Nullable()
    com.example.testrxandretro.viewmodels.SessionManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.testrxandretro.network.main.MainApi getMainApi() {
        return null;
    }
    
    public final void setMainApi(@org.jetbrains.annotations.Nullable()
    com.example.testrxandretro.network.main.MainApi p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.testrxandretro.ui.main.Resource<java.util.List<com.example.testrxandretro.data.model.Post>>> observePosts() {
        return null;
    }
    
    @javax.inject.Inject()
    public PostViewModel(@org.jetbrains.annotations.NotNull()
    com.example.testrxandretro.network.main.MainApi mainApi, @org.jetbrains.annotations.NotNull()
    com.example.testrxandretro.viewmodels.SessionManager sessionManager) {
        super();
    }
}