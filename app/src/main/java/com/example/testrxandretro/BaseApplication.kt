package com.example.testrxandretro

import com.example.testrxandretro.di.AppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import com.example.testrxandretro.di.DaggerAppComponent

class BaseApplication : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().application(this).build()
    }
}