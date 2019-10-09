package com.example.testrxandretro.ui.login

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.util.Patterns
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.testrxandretro.R
import com.example.testrxandretro.ui.main2.Main2Activity
import com.example.testrxandretro.viewmodels.ViewModelProvidersFactory
import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.api.GoogleApiClient
import com.google.firebase.auth.FirebaseAuth
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.fragment_profile.*
import kotlinx.android.synthetic.main.layout_login.*
import javax.inject.Inject
import com.google.android.gms.auth.api.Auth
import com.google.android.gms.auth.api.signin.GoogleSignInOptions

import com.google.firebase.auth.GoogleAuthProvider











class LoginActivity : DaggerAppCompatActivity(),LoginNavigator,FirebaseAuth.AuthStateListener, GoogleApiClient.OnConnectionFailedListener {

    val firebaseAuth: FirebaseAuth=FirebaseAuth.getInstance()

    @Inject
    lateinit var providerFactory: ViewModelProvidersFactory

    lateinit var viewModel: LoginViewModel
    lateinit var apiClient : GoogleApiClient
    var PROVIDER_DANGNHAP=0
    val REQUESTCODE_LOGIN_GOOOGLE=100
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_login)

        viewModel= ViewModelProviders.of(this,providerFactory).get(LoginViewModel::class.java)
        viewModel.setNavigator(this)
        CreateClientLoginGG()
        btn_login.setOnClickListener {
            viewModel.isEmailAndPasswordValid()

        }
        btnDangNhapGG.setOnClickListener {
            LoginGG(apiClient)
        }
        subcribeObservers()
    }
    private fun LoginGG(apiClient: GoogleApiClient) {
        PROVIDER_DANGNHAP = 1
        val intentGG = Auth.GoogleSignInApi.getSignInIntent(apiClient)
        startActivityForResult(intentGG, REQUESTCODE_LOGIN_GOOOGLE)
    }
    fun CreateClientLoginGG(){
        val signInOptions = GoogleSignInOptions.Builder()
            .requestIdToken(getString(R.string.default_web_client_id))
            .requestEmail()
            .build()
        apiClient = GoogleApiClient.Builder(this)
            .enableAutoManage(this, this)
            .addApi(Auth.GOOGLE_SIGN_IN_API, signInOptions)
            .build()
    }
    //GG
    override fun onConnectionFailed(p0: ConnectionResult) {
            Log.d("kiemtra",""+p0)
    }
    private fun subcribeObservers(){
        viewModel.mIsValidUser.observe(this, Observer {it->
            if(it==false){
                edt_uname.error = "invalid email"
            }
            else
                showProgressBar(true)
        })
        viewModel.mIsValidPass.observe(this, Observer {it->
            if(it==false){
                edt_pass.error = "Password empty"
            }
            else
                showProgressBar(true)
        })
    }


    override fun onAuthStateChanged(p0: FirebaseAuth) {
        val user = firebaseAuth!!.currentUser
        if (user != null) {
            onLoginSucce()
        }
    }
    override fun succes(boolean: Boolean) {
        showProgressBar(false)
        if(!boolean){

            Toast.makeText(this,"Email or Password not valid",Toast.LENGTH_SHORT).show()

        }
        else{
            Toast.makeText(this,"Login successful",Toast.LENGTH_SHORT).show()
            //onLoginSucce()
        }
    }

    override fun onStart() {
        super.onStart()
        firebaseAuth.addAuthStateListener(this)
    }
    override fun login() {
        if (viewModel.isValidUser(edt_uname.text.toString())){
            if(viewModel.isValidPassWord(edt_pass.text.toString())){
                viewModel.mIsValidUser.value = true
                viewModel.mIsValidPass.value = true
                viewModel.loginNormal(edt_uname.text.toString(),edt_pass.text.toString())
            }
            else{
                viewModel.mIsValidPass.value = false
            }
        }
        else{
            viewModel.mIsValidUser.value = false
        }
    }

    override fun onStop() {
        super.onStop()
        firebaseAuth.removeAuthStateListener(this)
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
        val intent= Intent(this,Main2Activity::class.java)
        startActivity(intent)
        finish()
    }
    private fun ProvideFirebase(tokenid: String) {

        if (PROVIDER_DANGNHAP == 1) {
            val authCredential = GoogleAuthProvider.getCredential(tokenid, null)
            firebaseAuth.signInWithCredential(authCredential)
        }

    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode === REQUESTCODE_LOGIN_GOOOGLE) {
            if (resultCode === Activity.RESULT_OK) {
                val signInResult = Auth.GoogleSignInApi.getSignInResultFromIntent(data)
                val googleSignInAccount = signInResult.signInAccount
                val tokenID = googleSignInAccount!!.idToken
                ProvideFirebase(tokenID!!)
            }
        }
    }
}