package com.example.testrxandretro.di.main

import androidx.lifecycle.ViewModel
import com.example.testrxandretro.di.ViewModelKey
import com.example.testrxandretro.ui.main.post.PostViewModel
import com.example.testrxandretro.ui.main.profile.ProfileViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class MainViewModelsModule {
    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel::class)
    abstract fun bindProfileViewModel(viewModel: ProfileViewModel):ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(PostViewModel::class)
    abstract fun bindPostViewModel(viewModel: PostViewModel):ViewModel
}