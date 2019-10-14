package com.example.testrxandretro.ui.main2.dog

import android.Manifest
import android.app.Activity.RESULT_OK
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.example.testrxandretro.R
import com.example.testrxandretro.data.model.DogModel

import com.example.testrxandretro.viewmodels.ViewModelProvidersFactory
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_dog.*
import javax.inject.Inject
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.example.testrxandretro.data.model.BreedModel
import com.example.testrxandretro.ui.main2.detaildog.DetailDogFragment
import com.example.testrxandretro.ui.popup.PopUpFullImage


class DogFragment : DaggerFragment(),RecyclerClickItem{
    override fun doThis(img: String) {
//        dogViewModel.setValueSession(img)
//        replaceFragment()
        val intent=Intent(context!!,PopUpFullImage::class.java)
        intent.putExtra("img",img)
        startActivity(intent)
    }

    @Inject
    lateinit var providerFactory: ViewModelProvidersFactory
    val PICK_IMAGE = 1
    val REQUEST_PERMISSION_STORAGE=5
     var listBreed: ArrayList<BreedModel> = ArrayList()
     lateinit var adapter: DogRecyclerAdapter
    fun setModel(listBreed:  ArrayList<BreedModel>){
        this.listBreed = listBreed
    }
    fun replaceFragment(){
        activity!!.supportFragmentManager.beginTransaction()
            .add(R.id.container_dog, DetailDogFragment()).addToBackStack(null)
            .commit()
    }

    lateinit var dogViewModel: DogViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        dogViewModel= ViewModelProviders.of(this,providerFactory).get(DogViewModel::class.java)

    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("kiemtra","onCreateView")
        return inflater.inflate(R.layout.fragment_dog, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initRecyclerView()
        btnAddLink!!.setOnClickListener {
            permission()

        }
        subscribeObervers()
    }
    fun permission(){
        val checkPermissionExternalStorage:Int= ContextCompat.checkSelfPermission(context!!,Manifest.permission.WRITE_EXTERNAL_STORAGE)
        if(checkPermissionExternalStorage!= PackageManager.PERMISSION_GRANTED ){
            ActivityCompat.requestPermissions(activity!!, arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE), REQUEST_PERMISSION_STORAGE)
        }
        else{
            succesPermission()
        }
    }
    fun succesPermission(){
        val intent = Intent()
        intent.type = "image/*"
        intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true)
        intent.action = Intent.ACTION_GET_CONTENT
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE)
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when(requestCode)
        {
            REQUEST_PERMISSION_STORAGE -> {
                if(grantResults.isNotEmpty() && grantResults[0]==PackageManager.PERMISSION_GRANTED)
                {
                    succesPermission()
                }
            }
        }
    }
    private fun initRecyclerView() {
        adapter= DogRecyclerAdapter(this)
        adapter.setBreedList(listBreed)
        val layoutManager=GridLayoutManager(activity,2)
        recyclerDogs.layoutManager = layoutManager
        recyclerDogs.adapter = adapter
    }
    private fun subscribeObervers() {

//        dogViewModel.observeValueBreed().observe(this, Observer{ it->
//            if(it!=null){
//                replaceFragment()
//            }
//
//        })
    }
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == PICK_IMAGE && resultCode == RESULT_OK && null != data) {
            if (data.clipData != null) {
                val count = data.clipData!!.itemCount
                for (i in 0 until count) {
                    val imageUri = data.clipData!!.getItemAt(i).uri
                    listBreed.add(BreedModel(0,listBreed[0].breedName,imageUri.toString()))

                }
            }
            else if (data.data != null) {
                listBreed.add(BreedModel(0,listBreed[0].breedName,data.data.toString()))

            }

            adapter.setBreedList(listBreed)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("kiemtra","onDestroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("kiemtra","onDestroyView")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("kiemtra","onDetach")

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("kiemtra","onAttach")
    }

    override fun onAttachFragment(childFragment: Fragment) {
        super.onAttachFragment(childFragment)
        Log.d("kiemtra","onAttachFragment")
    }

    override fun onPause() {
        super.onPause()
        Log.d("kiemtra","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("kiemtra","onStop")
    }

    override fun onStart() {
        super.onStart()
        Log.d("kiemtra","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("kiemtra","onResume")
    }






}