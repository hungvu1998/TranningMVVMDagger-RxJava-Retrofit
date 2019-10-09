package com.example.testrxandretro.di

import com.example.testrxandretro.di.auth.AuthModule
import com.example.testrxandretro.di.auth.AuthViewModelsModule
import com.example.testrxandretro.di.login.LoginModule
import com.example.testrxandretro.di.login.LoginViewModelsModule
import com.example.testrxandretro.di.main.MainFragmentBuildersModule
import com.example.testrxandretro.di.main.MainModule
import com.example.testrxandretro.di.main.MainViewModelsModule
import com.example.testrxandretro.di.main2.Main2FragmentBuildersModule
import com.example.testrxandretro.di.main2.Main2Module
import com.example.testrxandretro.di.main2.Main2ViewModelsModule
import com.example.testrxandretro.ui.auth.AuthActivity
import com.example.testrxandretro.ui.login.LoginActivity
import com.example.testrxandretro.ui.main.MainActivity
import com.example.testrxandretro.ui.main2.Main2Activity
import com.example.testrxandretro.ui.popup.PopUpFullImage
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityBuildersModule {
    @ContributesAndroidInjector(modules = [AuthViewModelsModule::class,AuthModule::class])
    abstract fun contributeAuthActivity(): AuthActivity

    @ContributesAndroidInjector(modules = [MainFragmentBuildersModule::class,MainViewModelsModule::class,MainModule::class])
    abstract fun contributeMainActivity():MainActivity

    @ContributesAndroidInjector(modules = [Main2FragmentBuildersModule::class, Main2ViewModelsModule::class, Main2Module::class])
    abstract fun contributeMain2Activity(): Main2Activity

    @ContributesAndroidInjector(modules = [LoginViewModelsModule::class,LoginModule::class])
    abstract fun contributeLoginActivity(): LoginActivity

    @ContributesAndroidInjector
    abstract fun contributePopUpFullImage(): PopUpFullImage
}