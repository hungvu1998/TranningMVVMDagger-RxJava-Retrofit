package com.example.testrxandretro.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import com.example.testrxandretro.data.model.User
import com.example.testrxandretro.ui.auth.AuthResource
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SessionManager @Inject constructor() {

    private val cachedUser = MediatorLiveData<AuthResource<User>>()


     fun authenticateWithId(source:LiveData<AuthResource<User>>) {
        if (cachedUser != null)
        {
            cachedUser.value = AuthResource.loading(null as User?)
        cachedUser.addSource(source
        )
        { userAuthResource ->
            cachedUser.value = userAuthResource
            cachedUser.removeSource(source)

            if (userAuthResource.status.equals(AuthResource.AuthStatus.ERROR)) {
                cachedUser.value = AuthResource.logout()
            }
        }
        }
}

     fun logOut() {
         cachedUser.value = AuthResource.logout()
     }


     fun getAuthUser():LiveData<AuthResource<User>> {
            return cachedUser
     }

}