package com.example.testrxandretro.ui.main2.dog

import android.Manifest
import android.app.Activity.RESULT_OK
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.example.testrxandretro.R
import com.example.testrxandretro.model.DogModel

import com.example.testrxandretro.viewmodels.ViewModelProvidersFactory
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_dog.*
import javax.inject.Inject
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.lifecycle.LiveData
import androidx.lifecycle.LiveDataReactiveStreams
import com.example.testrxandretro.ui.main.Resource
import com.example.testrxandretro.ui.popup.PopUpFullImage


class DogFragment : DaggerFragment(),RecyclerClickItem{
    override fun doThis(img: String) {
        val intent=Intent(context!!,PopUpFullImage::class.java)
        intent.putExtra("img",img)
        startActivity(intent)

    }


    @Inject
    lateinit var providerFactory: ViewModelProvidersFactory

    lateinit var dogModel: DogModel

    fun setModel(dogModel: DogModel){
        this.dogModel=dogModel
    }

    lateinit var adapter: DogRecyclerAdapter

    lateinit var dogViewModel: DogViewModel
    val PICK_IMAGE = 1
    val REQUEST_PERMISSION_STORAGE=5
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dogViewModel= ViewModelProviders.of(this,providerFactory).get(DogViewModel::class.java)

    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_dog, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView()
        subscribeObervers()

        btnAddLink!!.setOnClickListener {
            permission()

        }

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
    private fun subscribeObervers() {


    }
    private fun initRecyclerView() {
        adapter= DogRecyclerAdapter(this)
        val layoutManager=GridLayoutManager(activity,2)
        recyclerDogs.layoutManager = layoutManager
        // val itemDecoration = VerticalSpacingItemDecoration(15)
        //recyclerDogs.addItemDecoration(itemDecoration)
        if(dogModel!=null)
        adapter.setPosts(dogModel!!)
        Log.d("kiemtra",""+dogModel.breedName)
        Log.d("kiemtra",""+dogModel.message!!.size)
        recyclerDogs.adapter = adapter
    }

//    fun replaceFragment(){
//        activity!!.supportFragmentManager.beginTransaction()
//            .replace(R.id.container_dog, DetailDogFragment()).addToBackStack(null)
//            .commit()
//    }



    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == PICK_IMAGE && resultCode == RESULT_OK && null != data) {
            if (data.clipData != null) {
                val count = data.clipData!!.itemCount
                for (i in 0 until count) {
                    val imageUri = data.clipData!!.getItemAt(i).uri
                    dogModel!!.message!!.add(imageUri.toString())
                }
            }
            else if (data.data != null) {
                dogModel!!.message!!.add(data.data.toString())
            }

            adapter.setPosts(dogModel!!)
        }
    }


}