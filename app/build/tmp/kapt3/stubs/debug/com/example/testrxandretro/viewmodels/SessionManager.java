package com.example.testrxandretro.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\nJ\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\nJ\u0006\u0010\f\u001a\u00020\bR\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/testrxandretro/viewmodels/SessionManager;", "", "()V", "cachedUser", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/example/testrxandretro/ui/auth/AuthResource;", "Lcom/example/testrxandretro/model/User;", "authenticateWithId", "", "source", "Landroidx/lifecycle/LiveData;", "getAuthUser", "logOut", "app_debug"})
@javax.inject.Singleton()
public final class SessionManager {
    private final androidx.lifecycle.MediatorLiveData<com.example.testrxandretro.ui.auth.AuthResource<com.example.testrxandretro.model.User>> cachedUser = null;
    
    public final void authenticateWithId(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.example.testrxandretro.ui.auth.AuthResource<com.example.testrxandretro.model.User>> source) {
    }
    
    public final void logOut() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.testrxandretro.ui.auth.AuthResource<com.example.testrxandretro.model.User>> getAuthUser() {
        return null;
    }
    
    @javax.inject.Inject()
    public SessionManager() {
        super();
    }
}