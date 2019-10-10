package com.example.testrxandretro.ui.main2

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.net.ConnectivityManager
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.testrxandretro.R
import com.example.testrxandretro.data.model.Breed
import com.example.testrxandretro.data.model.Dog
import com.example.testrxandretro.data.model.DogModel
import com.example.testrxandretro.ui.base.BaseActivity
import com.example.testrxandretro.ui.main.Resource

import com.example.testrxandretro.viewmodels.ViewModelProvidersFactory

import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main2.*
import javax.inject.Inject
import com.example.testrxandretro.ui.login.LoginActivity
import com.google.firebase.auth.FirebaseAuth


class Main2Activity : BaseActivity() , NavigationView.OnNavigationItemSelectedListener {



    @Inject
    lateinit var providerFactory: ViewModelProvidersFactory

    lateinit var main2ViewModel: Main2ViewModel
    var mToggle: ActionBarDrawerToggle?=null

    lateinit var adapter: ViewPageMain2Adapter
    val userCurrent = FirebaseAuth.getInstance().currentUser
    var list:List<Breed>?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        mToggle= ActionBarDrawerToggle(this,drawerlayoutMain,toolbar, R.string.Open, R.string.Close)
        drawerlayoutMain.addDrawerListener(mToggle!!)
        mToggle!!.syncState()
        toolbar.setNavigationIcon(R.drawable.ic_menu_black_24dp)
        toolbar.setTitleTextColor(Color.WHITE)
        toolbar.setSubtitleTextColor(Color.WHITE)
        toolbar.title="Home"

        main2ViewModel= ViewModelProviders.of(this,providerFactory).get(Main2ViewModel::class.java)

        initViewPage()
        subscribeObervers()

        nav_view?.setNavigationItemSelectedListener(this)



    }

    var pagesize:Int=0
    val arrayList = ArrayList<DogModel>()
    private fun subscribeObervers() {
        val menu=nav_view?.menu
        var id:Int=0
        main2ViewModel.observePosts().removeObservers(this)
        main2ViewModel.observePosts().observe(this,Observer{it->
            arrayList.clear()
            if (it!=null){
                when(it.status){
                    Resource.Status.LOADING ->{
                        progress_bar.visibility= View.VISIBLE
                        Log.d("kiemtra","loading")
                    }
                    Resource.Status.SUCCESS ->{

                        Log.d("kiemtra","SUCCESS")

                        main2ViewModel.dogs.observe(this, Observer { dogModel->
                            arrayList.add(dogModel)
                            val menuItem=menu?.add(1,id++,1,dogModel.breedName)

                            if(arrayList.size == it.data!!.message!!.size){
                                adapter.setPosts(arrayList)
                                pagesize=arrayList.size

                                progress_bar.visibility= View.GONE
                            }
                        })
                    }

                    Resource.Status.ERROR ->{
                        Log.d("kiemtra","ERROr"+it.message)
                    }
                }
            }

        })
    }
    private fun initViewPage() {
        adapter=ViewPageMain2Adapter(supportFragmentManager)
        pager_info?.adapter=adapter
        tablayout?.setupWithViewPager(pager_info)
    }


    override fun onNavigationItemSelected(p0: MenuItem): Boolean {
        if(p0.itemId < pagesize)
        pager_info?.currentItem=p0.itemId

        if (p0.itemId == R.id.mnExit && userCurrent!=null){
          FirebaseAuth.getInstance().signOut()
            val intent= Intent(this,LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
        drawerlayoutMain.closeDrawer(GravityCompat.START)
        return true
    }
    override fun onBackPressed() {

        if(drawerlayoutMain.isDrawerOpen(GravityCompat.START)){
            drawerlayoutMain.closeDrawer(GravityCompat.START)

        }
        else{
            super.onBackPressed()
        }

    }

    fun isNetworkConnected(context:Context):Boolean{
        val cm=context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetWork =cm.activeNetworkInfo
        return activeNetWork !=null && activeNetWork.isConnectedOrConnecting
    }

}