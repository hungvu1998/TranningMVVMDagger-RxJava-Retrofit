package com.example.testrxandretro.ui.base

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import com.example.testrxandretro.ui.auth.AuthActivity
import com.example.testrxandretro.ui.auth.AuthResource
import com.example.testrxandretro.viewmodels.SessionManager
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

open class BaseActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var sessionManager: SessionManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        subcribeObservers()
    }
    fun subcribeObservers(){
        sessionManager.getAuthUser().observe(this, Observer{it ->
            when(it.status){
                AuthResource.AuthStatus.LOADING ->{

                }
                AuthResource.AuthStatus.AUTHENTICATED ->{
                    Log.d("kiemtra","ff1")
                }
                AuthResource.AuthStatus.ERROR ->{

                }
                AuthResource.AuthStatus.NOT_AUTHENTICATED ->{
                    Log.d("kiemtra","ff2")
                    navLoginScreen()
                }

            }


        })
    }
    private fun navLoginScreen() {
        val intent = Intent(this, AuthActivity::class.java)
        startActivity(intent)
        finish()
    }
}