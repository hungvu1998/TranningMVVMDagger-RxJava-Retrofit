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
import com.example.testrxandretro.data.model.*
import com.example.testrxandretro.ui.base.BaseActivity
import com.example.testrxandretro.ui.main.Resource

import com.example.testrxandretro.viewmodels.ViewModelProvidersFactory

import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main2.*
import javax.inject.Inject
import com.example.testrxandretro.ui.login.LoginActivity
import com.example.testrxandretro.ui.main2.dog.RecyclerClickItem
import com.google.firebase.auth.FirebaseAuth
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


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
        main2ViewModel.observePosts()

        initViewPage()
        subscribeObervers()

        nav_view?.setNavigationItemSelectedListener(this)



    }

    var pagesize:Int=0
    val arrayList = ArrayList<BreedModel>()
    private fun subscribeObervers() {
        val menu=nav_view?.menu
        var id:Int=0
        var arrayListDog: ArrayList<Dog> = ArrayList()
        main2ViewModel.breeds.observe(this, Observer {it->
            arrayListDog.clear()
            arrayList.clear()
            pagesize=it.size
            for(item in it){
                val menuItem=menu?.add(1,id++,1,item.breedName)
                var dog = Dog()
                dog.breedName = item.breedName
                arrayListDog.add(dog)

            }

            main2ViewModel.dogs.observe(this, Observer {breedModel->
                for(i in 0 until arrayListDog.size){
                    if(arrayListDog[i].breedName.equals(breedModel.breedName)){

                        arrayListDog[i].listBreeds!!.add(breedModel)
                    }
                }

            })
            main2ViewModel.nameBreed.observe(this, Observer {name->

                if (name == arrayListDog[it.size -1].breedName){
                    adapter.setPosts(arrayListDog)
                    progress_bar.visibility=View.GONE


                }
            })
        })
        main2ViewModel.breed2.observe(this, Observer {it->
            arrayListDog.clear()
            pagesize=it.size
            var idLast=0
            for(item in it){
                val menuItem=menu?.add(1,id++,1,item.breedName)
                var dog = Dog()
                dog.breedName = item.breedName
                arrayListDog.add(dog)
            }
            main2ViewModel.dogArrayList.observe(this, Observer {it->
                Log.d("kiemtraaaaaaa",""+it.size)
                for(i in 0 until arrayListDog.size){
                    for(item in it){
                        if(arrayListDog[i].breedName.equals(item.breedName)){
                            arrayListDog[i].listBreeds!!.add(item)
                        }
                    }

                }

                adapter.setPosts(arrayListDog)
                progress_bar.visibility=View.GONE
            })

        })
    }
    private fun initViewPage() {
        adapter=ViewPageMain2Adapter(supportFragmentManager)
        pager_info?.adapter=adapter
        tablayout?.setupWithViewPager(pager_info)
    }


    override fun onNavigationItemSelected(p0: MenuItem): Boolean {
        Log.d("kiemtra",""+p0.itemId)
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



}