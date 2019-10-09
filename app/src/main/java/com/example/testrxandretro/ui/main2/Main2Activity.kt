package com.example.testrxandretro.ui.main2

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.ListView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.testrxandretro.R
import com.example.testrxandretro.model.Breed
import com.example.testrxandretro.ui.base.BaseActivity
import com.example.testrxandretro.ui.main.Resource
import com.example.testrxandretro.ui.main2.dog.DogRecyclerAdapter

import com.example.testrxandretro.viewmodels.ViewModelProvidersFactory

import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main2.*
import javax.inject.Inject
import androidx.appcompat.view.menu.MenuBuilder
import androidx.core.content.ContextCompat
import androidx.core.view.size
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

    private fun subscribeObervers() {
        val menu=nav_view?.menu
        var id:Int=0
        main2ViewModel.observePosts().removeObservers(this)
        main2ViewModel.observePosts().observe(this,Observer{it->
            if (it!=null){
                when(it.status){
                    Resource.Status.LOADING ->{
                        progress_bar.visibility= View.VISIBLE
                        Log.d("kiemtra","loading")
                    }
                    Resource.Status.SUCCESS ->{

                        Log.d("kiemtra","SUCCESS")
                        main2ViewModel.dogs.observe(this, Observer { dogModel->
                            it.data!!.listDogModel.add(dogModel)
                            val menuItem=menu?.add(1,id++,1,dogModel.breedName)

                            if(it.data.listDogModel.size == it.data.message!!.size){
                                adapter.setPosts(it.data.listDogModel)
                                pagesize=it.data.listDogModel.size
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
//        when (pager_info.getCurrentItem()) {
//            0 -> {
//                finish()
//                return
//            }
//            1 -> {
//                pager_info.setCurrentItem(0)
//                return
//            }
//        }

    }




}