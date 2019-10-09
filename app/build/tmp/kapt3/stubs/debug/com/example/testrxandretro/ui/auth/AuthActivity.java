package com.example.testrxandretro.ui.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0012\u0010&\u001a\u00020#2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\u0006\u0010)\u001a\u00020#J\b\u0010\u000e\u001a\u00020#H\u0002J\u000e\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020,J\b\u0010-\u001a\u00020#H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u0006."}, d2 = {"Lcom/example/testrxandretro/ui/auth/AuthActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "Landroid/view/View$OnClickListener;", "()V", "authViewModel", "Lcom/example/testrxandretro/ui/auth/AuthViewModel;", "getAuthViewModel", "()Lcom/example/testrxandretro/ui/auth/AuthViewModel;", "setAuthViewModel", "(Lcom/example/testrxandretro/ui/auth/AuthViewModel;)V", "logo", "Landroid/graphics/drawable/Drawable;", "getLogo", "()Landroid/graphics/drawable/Drawable;", "setLogo", "(Landroid/graphics/drawable/Drawable;)V", "providerFactory", "Lcom/example/testrxandretro/viewmodels/ViewModelProvidersFactory;", "getProviderFactory", "()Lcom/example/testrxandretro/viewmodels/ViewModelProvidersFactory;", "setProviderFactory", "(Lcom/example/testrxandretro/viewmodels/ViewModelProvidersFactory;)V", "requestManager", "Lcom/bumptech/glide/RequestManager;", "getRequestManager", "()Lcom/bumptech/glide/RequestManager;", "setRequestManager", "(Lcom/bumptech/glide/RequestManager;)V", "xxvx", "", "getXxvx", "()Ljava/lang/String;", "setXxvx", "(Ljava/lang/String;)V", "onClick", "", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onLoginSucce", "showProgressBar", "isShowing", "", "subcribeObservers", "app_debug"})
public final class AuthActivity extends dagger.android.support.DaggerAppCompatActivity implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public java.lang.String xxvx;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public android.graphics.drawable.Drawable logo;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.bumptech.glide.RequestManager requestManager;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.testrxandretro.viewmodels.ViewModelProvidersFactory providerFactory;
    @org.jetbrains.annotations.NotNull()
    public com.example.testrxandretro.ui.auth.AuthViewModel authViewModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getXxvx() {
        return null;
    }
    
    public final void setXxvx(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.Drawable getLogo() {
        return null;
    }
    
    public final void setLogo(@org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bumptech.glide.RequestManager getRequestManager() {
        return null;
    }
    
    public final void setRequestManager(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.RequestManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testrxandretro.viewmodels.ViewModelProvidersFactory getProviderFactory() {
        return null;
    }
    
    public final void setProviderFactory(@org.jetbrains.annotations.NotNull()
    com.example.testrxandretro.viewmodels.ViewModelProvidersFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testrxandretro.ui.auth.AuthViewModel getAuthViewModel() {
        return null;
    }
    
    public final void setAuthViewModel(@org.jetbrains.annotations.NotNull()
    com.example.testrxandretro.ui.auth.AuthViewModel p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setLogo() {
    }
    
    private final void subcribeObservers() {
    }
    
    public final void showProgressBar(boolean isShowing) {
    }
    
    public final void onLoginSucce() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    public AuthActivity() {
        super();
    }
}