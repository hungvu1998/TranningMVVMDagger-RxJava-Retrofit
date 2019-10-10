package com.example.testrxandretro.ui.main.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.testrxandretro.data.model.User
import com.example.testrxandretro.ui.auth.AuthResource
import com.example.testrxandretro.viewmodels.SessionManager
import javax.inject.Inject

class ProfileViewModel : ViewModel{

    var sessionManager: SessionManager?=null
    @Inject
    constructor( sessionManager: SessionManager) {
        this.sessionManager = sessionManager
    }

    fun getAuthenticatedUser(): LiveData<AuthResource<User>> {
        return sessionManager!!.getAuthUser()
    }
}