package com.example.testrxandretro.ui.main2.detaildog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer

import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testrxandretro.R
import com.example.testrxandretro.ui.main2.Main2Activity

import com.example.testrxandretro.util.VerticalSpacingItemDecoration
import com.example.testrxandretro.viewmodels.ViewModelProvidersFactory
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.dialog_full_img.*


import javax.inject.Inject

class DetailDogFragment : dagger.android.support.DaggerFragment(){

    @Inject
    lateinit var providerFactory: ViewModelProvidersFactory


    lateinit var detailDogViewModel: DetailDogViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailDogViewModel= ViewModelProviders.of(this,providerFactory).get(DetailDogViewModel::class.java)
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.dialog_full_img, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        subscribeObservers()
    }
    fun subscribeObservers(){
        detailDogViewModel.getValueBreed().removeObservers(viewLifecycleOwner)
        detailDogViewModel.getValueBreed().observe(this, Observer{

            Picasso.get().load(it).into(img_anh)
        })
    }

}