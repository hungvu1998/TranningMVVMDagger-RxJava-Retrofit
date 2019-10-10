package com.example.testrxandretro.ui.main.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.testrxandretro.R
import com.example.testrxandretro.data.model.User
import com.example.testrxandretro.ui.auth.AuthResource
import com.example.testrxandretro.viewmodels.ViewModelProvidersFactory
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_profile.*
import javax.inject.Inject

class ProfileFragment : DaggerFragment(){
    @Inject
    lateinit var providerFactory: ViewModelProvidersFactory

    lateinit var profileViewModel: ProfileViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        profileViewModel= ViewModelProviders.of(this,providerFactory).get(ProfileViewModel::class.java)
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        subscribeObservers()
    }
    fun subscribeObservers(){
        profileViewModel.getAuthenticatedUser().removeObservers(viewLifecycleOwner)
        //fragment have their own lifecycle they can be destroy and recreated. Make sure remove the previous observers before assigining new ones
        profileViewModel.getAuthenticatedUser().observe(this, Observer{it ->
            when(it.status){
                AuthResource.AuthStatus.AUTHENTICATED ->{
                   setUserDetail(it.data!!)
                }
                AuthResource.AuthStatus.ERROR ->{
                    setErroDetail(it.message!!)
                }


            }



        })
    }
    fun setErroDetail(message:String){
        email.text = message
        username.text="Error"
        website.text="Error"
    }
    fun setUserDetail(user:User){
        email.text=user.email
        username.text=user.username
        website.text=user.website
    }

}