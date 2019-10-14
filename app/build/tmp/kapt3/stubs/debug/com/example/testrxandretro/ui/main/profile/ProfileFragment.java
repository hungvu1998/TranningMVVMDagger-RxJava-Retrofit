package com.example.testrxandretro.ui.main.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u000e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\""}, d2 = {"Lcom/example/testrxandretro/ui/main/profile/ProfileFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "profileViewModel", "Lcom/example/testrxandretro/ui/main/profile/ProfileViewModel;", "getProfileViewModel", "()Lcom/example/testrxandretro/ui/main/profile/ProfileViewModel;", "setProfileViewModel", "(Lcom/example/testrxandretro/ui/main/profile/ProfileViewModel;)V", "providerFactory", "Lcom/example/testrxandretro/viewmodels/ViewModelProvidersFactory;", "getProviderFactory", "()Lcom/example/testrxandretro/viewmodels/ViewModelProvidersFactory;", "setProviderFactory", "(Lcom/example/testrxandretro/viewmodels/ViewModelProvidersFactory;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setErroDetail", "message", "", "setUserDetail", "user", "Lcom/example/testrxandretro/data/model/User;", "subscribeObservers", "app_debug"})
public final class ProfileFragment extends dagger.android.support.DaggerFragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.testrxandretro.viewmodels.ViewModelProvidersFactory providerFactory;
    @org.jetbrains.annotations.NotNull()
    public com.example.testrxandretro.ui.main.profile.ProfileViewModel profileViewModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testrxandretro.viewmodels.ViewModelProvidersFactory getProviderFactory() {
        return null;
    }
    
    public final void setProviderFactory(@org.jetbrains.annotations.NotNull()
    com.example.testrxandretro.viewmodels.ViewModelProvidersFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testrxandretro.ui.main.profile.ProfileViewModel getProfileViewModel() {
        return null;
    }
    
    public final void setProfileViewModel(@org.jetbrains.annotations.NotNull()
    com.example.testrxandretro.ui.main.profile.ProfileViewModel p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void subscribeObservers() {
    }
    
    public final void setErroDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void setUserDetail(@org.jetbrains.annotations.NotNull()
    com.example.testrxandretro.data.model.User user) {
    }
    
    public ProfileFragment() {
        super();
    }
}