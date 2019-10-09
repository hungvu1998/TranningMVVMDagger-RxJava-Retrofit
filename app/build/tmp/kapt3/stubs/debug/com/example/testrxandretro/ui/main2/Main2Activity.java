package com.example.testrxandretro.ui.main2;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020.H\u0016J\u0012\u00100\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u000102H\u0014J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u00020.H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u0013\u0010)\u001a\u0004\u0018\u00010*\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,\u00a8\u00068"}, d2 = {"Lcom/example/testrxandretro/ui/main2/Main2Activity;", "Lcom/example/testrxandretro/ui/base/BaseActivity;", "Lcom/google/android/material/navigation/NavigationView$OnNavigationItemSelectedListener;", "()V", "adapter", "Lcom/example/testrxandretro/ui/main2/ViewPageMain2Adapter;", "getAdapter", "()Lcom/example/testrxandretro/ui/main2/ViewPageMain2Adapter;", "setAdapter", "(Lcom/example/testrxandretro/ui/main2/ViewPageMain2Adapter;)V", "list", "", "Lcom/example/testrxandretro/model/Breed;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "mToggle", "Landroidx/appcompat/app/ActionBarDrawerToggle;", "getMToggle", "()Landroidx/appcompat/app/ActionBarDrawerToggle;", "setMToggle", "(Landroidx/appcompat/app/ActionBarDrawerToggle;)V", "main2ViewModel", "Lcom/example/testrxandretro/ui/main2/Main2ViewModel;", "getMain2ViewModel", "()Lcom/example/testrxandretro/ui/main2/Main2ViewModel;", "setMain2ViewModel", "(Lcom/example/testrxandretro/ui/main2/Main2ViewModel;)V", "pagesize", "", "getPagesize", "()I", "setPagesize", "(I)V", "providerFactory", "Lcom/example/testrxandretro/viewmodels/ViewModelProvidersFactory;", "getProviderFactory", "()Lcom/example/testrxandretro/viewmodels/ViewModelProvidersFactory;", "setProviderFactory", "(Lcom/example/testrxandretro/viewmodels/ViewModelProvidersFactory;)V", "userCurrent", "Lcom/google/firebase/auth/FirebaseUser;", "getUserCurrent", "()Lcom/google/firebase/auth/FirebaseUser;", "initViewPage", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNavigationItemSelected", "", "p0", "Landroid/view/MenuItem;", "subscribeObervers", "app_debug"})
public final class Main2Activity extends com.example.testrxandretro.ui.base.BaseActivity implements com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.testrxandretro.viewmodels.ViewModelProvidersFactory providerFactory;
    @org.jetbrains.annotations.NotNull()
    public com.example.testrxandretro.ui.main2.Main2ViewModel main2ViewModel;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.ActionBarDrawerToggle mToggle;
    @org.jetbrains.annotations.NotNull()
    public com.example.testrxandretro.ui.main2.ViewPageMain2Adapter adapter;
    @org.jetbrains.annotations.Nullable()
    private final com.google.firebase.auth.FirebaseUser userCurrent = null;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<? extends com.example.testrxandretro.model.Breed> list;
    private int pagesize;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testrxandretro.viewmodels.ViewModelProvidersFactory getProviderFactory() {
        return null;
    }
    
    public final void setProviderFactory(@org.jetbrains.annotations.NotNull()
    com.example.testrxandretro.viewmodels.ViewModelProvidersFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testrxandretro.ui.main2.Main2ViewModel getMain2ViewModel() {
        return null;
    }
    
    public final void setMain2ViewModel(@org.jetbrains.annotations.NotNull()
    com.example.testrxandretro.ui.main2.Main2ViewModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.app.ActionBarDrawerToggle getMToggle() {
        return null;
    }
    
    public final void setMToggle(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.app.ActionBarDrawerToggle p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testrxandretro.ui.main2.ViewPageMain2Adapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.example.testrxandretro.ui.main2.ViewPageMain2Adapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.auth.FirebaseUser getUserCurrent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.testrxandretro.model.Breed> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends com.example.testrxandretro.model.Breed> p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final int getPagesize() {
        return 0;
    }
    
    public final void setPagesize(int p0) {
    }
    
    private final void subscribeObervers() {
    }
    
    private final void initViewPage() {
    }
    
    @java.lang.Override()
    public boolean onNavigationItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem p0) {
        return false;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public Main2Activity() {
        super();
    }
}