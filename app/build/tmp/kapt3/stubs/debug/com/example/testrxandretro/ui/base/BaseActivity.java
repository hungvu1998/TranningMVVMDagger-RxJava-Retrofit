package com.example.testrxandretro.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u0006\u0010\u000e\u001a\u00020\nR\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lcom/example/testrxandretro/ui/base/BaseActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "sessionManager", "Lcom/example/testrxandretro/viewmodels/SessionManager;", "getSessionManager", "()Lcom/example/testrxandretro/viewmodels/SessionManager;", "setSessionManager", "(Lcom/example/testrxandretro/viewmodels/SessionManager;)V", "navLoginScreen", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "subcribeObservers", "app_debug"})
public class BaseActivity extends dagger.android.support.DaggerAppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.testrxandretro.viewmodels.SessionManager sessionManager;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testrxandretro.viewmodels.SessionManager getSessionManager() {
        return null;
    }
    
    public final void setSessionManager(@org.jetbrains.annotations.NotNull()
    com.example.testrxandretro.viewmodels.SessionManager p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void subcribeObservers() {
    }
    
    private final void navLoginScreen() {
    }
    
    public BaseActivity() {
        super();
    }
}