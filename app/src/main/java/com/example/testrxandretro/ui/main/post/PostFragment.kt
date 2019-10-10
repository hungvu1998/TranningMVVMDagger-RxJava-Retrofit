package com.example.testrxandretro.ui.main.post

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testrxandretro.R
import com.example.testrxandretro.ui.main.Resource
import com.example.testrxandretro.util.VerticalSpacingItemDecoration
import com.example.testrxandretro.viewmodels.ViewModelProvidersFactory
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_posts.*
import javax.inject.Inject

class PostFragment : DaggerFragment(){
    @Inject
    lateinit var providerFactory: ViewModelProvidersFactory

    @Inject
    lateinit var adapter: PostsRecyclerAdapter

    lateinit var postViewModel: PostViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        postViewModel= ViewModelProviders.of(this,providerFactory).get(PostViewModel::class.java)
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_posts, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
        subscribeObervers()

    }
    private fun subscribeObervers() {
        postViewModel.observePosts().removeObservers(viewLifecycleOwner)
        postViewModel.observePosts().observe(viewLifecycleOwner,Observer{it->
            if (it!=null){
                when(it.status){
                    Resource.Status.LOADING ->{
                        Log.d("kiemtra","Loading")
                    }
                    Resource.Status.SUCCESS ->{
                        Log.d("kiemtra","got posts")
                        adapter.setPosts(it.data!!)
                    }
                    Resource.Status.ERROR ->{
                        Log.d("kiemtra","ERROr"+it.message)
                    }
                }
            }

        })
    }

    private fun initRecyclerView() {
        recycler_view.layoutManager = LinearLayoutManager(activity)
        val itemDecoration = VerticalSpacingItemDecoration(15)
        recycler_view.addItemDecoration(itemDecoration)
        recycler_view.adapter = adapter
    }


}