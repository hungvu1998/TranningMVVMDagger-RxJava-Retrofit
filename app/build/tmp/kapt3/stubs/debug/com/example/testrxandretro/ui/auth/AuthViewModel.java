package com.example.testrxandretro.ui.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014J\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00142\u0006\u0010\u0011\u001a\u00020\u0012R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/example/testrxandretro/ui/auth/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "authApi", "Lcom/example/testrxandretro/network/auth/AuthApi;", "sessionManager", "Lcom/example/testrxandretro/viewmodels/SessionManager;", "(Lcom/example/testrxandretro/network/auth/AuthApi;Lcom/example/testrxandretro/viewmodels/SessionManager;)V", "getAuthApi", "()Lcom/example/testrxandretro/network/auth/AuthApi;", "setAuthApi", "(Lcom/example/testrxandretro/network/auth/AuthApi;)V", "getSessionManager", "()Lcom/example/testrxandretro/viewmodels/SessionManager;", "setSessionManager", "(Lcom/example/testrxandretro/viewmodels/SessionManager;)V", "authenticateWithId", "", "userID", "", "observeAuthState", "Landroidx/lifecycle/LiveData;", "Lcom/example/testrxandretro/ui/auth/AuthResource;", "Lcom/example/testrxandretro/data/model/User;", "queryUserID", "app_debug"})
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable()
    private com.example.testrxandretro.network.auth.AuthApi authApi;
    @org.jetbrains.annotations.Nullable()
    private com.example.testrxandretro.viewmodels.SessionManager sessionManager;
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.testrxandretro.network.auth.AuthApi getAuthApi() {
        return null;
    }
    
    public final void setAuthApi(@org.jetbrains.annotations.Nullable()
    com.example.testrxandretro.network.auth.AuthApi p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.testrxandretro.viewmodels.SessionManager getSessionManager() {
        return null;
    }
    
    public final void setSessionManager(@org.jetbrains.annotations.Nullable()
    com.example.testrxandretro.viewmodels.SessionManager p0) {
    }
    
    public final void authenticateWithId(int userID) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.testrxandretro.ui.auth.AuthResource<com.example.testrxandretro.data.model.User>> queryUserID(int userID) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.testrxandretro.ui.auth.AuthResource<com.example.testrxandretro.data.model.User>> observeAuthState() {
        return null;
    }
    
    @javax.inject.Inject()
    public AuthViewModel(@org.jetbrains.annotations.NotNull()
    com.example.testrxandretro.network.auth.AuthApi authApi, @org.jetbrains.annotations.NotNull()
    com.example.testrxandretro.viewmodels.SessionManager sessionManager) {
        super();
    }
}