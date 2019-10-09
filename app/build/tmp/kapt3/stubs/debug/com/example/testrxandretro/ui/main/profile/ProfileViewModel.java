package com.example.testrxandretro.ui.main.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\f"}, d2 = {"Lcom/example/testrxandretro/ui/main/profile/ProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "sessionManager", "Lcom/example/testrxandretro/viewmodels/SessionManager;", "(Lcom/example/testrxandretro/viewmodels/SessionManager;)V", "getSessionManager", "()Lcom/example/testrxandretro/viewmodels/SessionManager;", "setSessionManager", "getAuthenticatedUser", "Landroidx/lifecycle/LiveData;", "Lcom/example/testrxandretro/ui/auth/AuthResource;", "Lcom/example/testrxandretro/model/User;", "app_debug"})
public final class ProfileViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable()
    private com.example.testrxandretro.viewmodels.SessionManager sessionManager;
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.testrxandretro.viewmodels.SessionManager getSessionManager() {
        return null;
    }
    
    public final void setSessionManager(@org.jetbrains.annotations.Nullable()
    com.example.testrxandretro.viewmodels.SessionManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.testrxandretro.ui.auth.AuthResource<com.example.testrxandretro.model.User>> getAuthenticatedUser() {
        return null;
    }
    
    @javax.inject.Inject()
    public ProfileViewModel(@org.jetbrains.annotations.NotNull()
    com.example.testrxandretro.viewmodels.SessionManager sessionManager) {
        super();
    }
}