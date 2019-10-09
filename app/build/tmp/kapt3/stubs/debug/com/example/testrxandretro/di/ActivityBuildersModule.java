package com.example.testrxandretro.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'\u00a8\u0006\r"}, d2 = {"Lcom/example/testrxandretro/di/ActivityBuildersModule;", "", "()V", "contributeAuthActivity", "Lcom/example/testrxandretro/ui/auth/AuthActivity;", "contributeLoginActivity", "Lcom/example/testrxandretro/ui/login/LoginActivity;", "contributeMain2Activity", "Lcom/example/testrxandretro/ui/main2/Main2Activity;", "contributeMainActivity", "Lcom/example/testrxandretro/ui/main/MainActivity;", "contributePopUpFullImage", "Lcom/example/testrxandretro/ui/popup/PopUpFullImage;", "app_debug"})
@dagger.Module()
public abstract class ActivityBuildersModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.example.testrxandretro.di.auth.AuthViewModelsModule.class, com.example.testrxandretro.di.auth.AuthModule.class})
    public abstract com.example.testrxandretro.ui.auth.AuthActivity contributeAuthActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.example.testrxandretro.di.main.MainFragmentBuildersModule.class, com.example.testrxandretro.di.main.MainViewModelsModule.class, com.example.testrxandretro.di.main.MainModule.class})
    public abstract com.example.testrxandretro.ui.main.MainActivity contributeMainActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.example.testrxandretro.di.main2.Main2FragmentBuildersModule.class, com.example.testrxandretro.di.main2.Main2ViewModelsModule.class, com.example.testrxandretro.di.main2.Main2Module.class})
    public abstract com.example.testrxandretro.ui.main2.Main2Activity contributeMain2Activity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.example.testrxandretro.di.login.LoginViewModelsModule.class, com.example.testrxandretro.di.login.LoginModule.class})
    public abstract com.example.testrxandretro.ui.login.LoginActivity contributeLoginActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.example.testrxandretro.ui.popup.PopUpFullImage contributePopUpFullImage();
    
    public ActivityBuildersModule() {
        super();
    }
}