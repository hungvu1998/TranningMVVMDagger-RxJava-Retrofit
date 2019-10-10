package com.example.testrxandretro.ui.auth

import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.bumptech.glide.RequestManager
import com.example.testrxandretro.R
import com.example.testrxandretro.ui.main.MainActivity
import com.example.testrxandretro.viewmodels.ViewModelProvidersFactory
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_auth.*
import javax.inject.Inject

class AuthActivity:DaggerAppCompatActivity(), View.OnClickListener {


    @Inject
    lateinit var xxvx:String

    @Inject
    lateinit var logo:Drawable

    @Inject
    lateinit var requestManager: RequestManager

    @Inject
    lateinit var providerFactory:ViewModelProvidersFactory

    lateinit var authViewModel: AuthViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        Log.d("kiemtra",""+xxvx) // this is run someThing() in AppModule beacuse @provide
        setLogo()

        authViewModel= ViewModelProviders.of(this,providerFactory).get(AuthViewModel::class.java)
        login_button.setOnClickListener (this)
        subcribeObservers()
    }
    private fun setLogo(){
        requestManager
            .load(logo)
            .into(login_logo)
    }
    private fun subcribeObservers(){
        authViewModel.observeAuthState().observe(this, Observer {it ->
            when(it.status){
                AuthResource.AuthStatus.LOADING ->{
                    showProgressBar(true)
                }
                AuthResource.AuthStatus.AUTHENTICATED ->{
                    showProgressBar(false)
                   onLoginSucce()
                }
                AuthResource.AuthStatus.ERROR ->{
                    showProgressBar(false)
                    Log.d("kiemtra",""+it.message)
                }
                AuthResource.AuthStatus.NOT_AUTHENTICATED ->{
                    showProgressBar(false)
                }
            }

        })
    }
    fun showProgressBar(isShowing:Boolean){
        if(isShowing){
            progress_bar.visibility=View.VISIBLE
        }
        else{
            progress_bar.visibility=View.GONE
        }
    }
    fun onLoginSucce(){
        val intent=Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
    override fun onClick(v: View?) {
       if(TextUtils.isEmpty(user_id_input.text.toString())){
           return
       }
        authViewModel.authenticateWithId(user_id_input.text.toString().toInt())
    }
}