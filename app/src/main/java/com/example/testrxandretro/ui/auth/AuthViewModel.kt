package com.example.testrxandretro.ui.auth

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveDataReactiveStreams
import com.example.testrxandretro.model.User
import com.example.testrxandretro.network.auth.AuthApi
import com.example.testrxandretro.viewmodels.SessionManager
import io.reactivex.disposables.Disposable
import io.reactivex.functions.Function
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class AuthViewModel : ViewModel {
    var authApi:AuthApi?=null
    var sessionManager:SessionManager?=null
   // val authUser:MediatorLiveData<AuthResource<User>> = MediatorLiveData()
    @Inject
    constructor(authApi: AuthApi,sessionManager: SessionManager){
        this.authApi=authApi
        this.sessionManager=sessionManager
    }

    fun authenticateWithId(userID:Int){

        sessionManager!!.authenticateWithId(queryUserID(userID))
    }
    fun queryUserID(userID: Int):LiveData<AuthResource<User>>{
        return LiveDataReactiveStreams.fromPublisher(
            authApi!!.getUser(userID)
                .onErrorReturn {
                    val erroUser = User()
                    erroUser.id = -1
                    erroUser
                }
                .map {
                    if (it.id == -1)
                        return@map AuthResource.error("Could not authenticate",  it)
                    else return@map AuthResource.authenticated(it)
                }
                .subscribeOn(Schedulers.io())
        )//(convert Observable to LiveData)
    }
    fun observeAuthState():LiveData<AuthResource<User>>{
        return sessionManager!!.getAuthUser()

    }

}