package com.example.testrxandretro.di.main

import com.example.testrxandretro.ui.main.post.PostFragment
import com.example.testrxandretro.ui.main.profile.ProfileFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainFragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun constributeProfileFragment():ProfileFragment
    @ContributesAndroidInjector
    abstract fun constributePostFragment():PostFragment
}