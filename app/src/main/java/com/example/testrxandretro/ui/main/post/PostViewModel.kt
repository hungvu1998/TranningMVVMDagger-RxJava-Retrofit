package com.example.testrxandretro.ui.main.post

import android.util.Log
import androidx.lifecycle.*
import com.example.testrxandretro.data.model.Post
import com.example.testrxandretro.network.main.MainApi
import com.example.testrxandretro.ui.main.Resource
import com.example.testrxandretro.viewmodels.SessionManager
import io.reactivex.functions.Function
import io.reactivex.schedulers.Schedulers
import java.util.ArrayList
import javax.inject.Inject

class PostViewModel : ViewModel {

    var sessionManager: SessionManager?=null
    var mainApi:MainApi?=null

    private var posts: MediatorLiveData<Resource<List<Post>>>? = null
    @Inject
    constructor(mainApi: MainApi, sessionManager: SessionManager) {
        this.mainApi=mainApi
        this.sessionManager = sessionManager
    }

    fun observePosts(): LiveData<Resource<List<Post>>> {
        if (posts == null) {
            posts = MediatorLiveData<Resource<List<Post>>>()
            posts!!.setValue(Resource.loading(null as List<Post>?))

            val source = LiveDataReactiveStreams.fromPublisher(

                mainApi!!.getPostsFromUser(sessionManager!!.getAuthUser().value!!.data!!.id)

                    .onErrorReturn { throwable ->
                        Log.d("kiemtra", "apply: ", throwable)
                        val post = Post()
                        post.id=-1
                        val posts = ArrayList<Post>()
                        posts.add(post)
                        posts
                    }

                    .map(Function<List<Post>, Resource<List<Post>>> { posts ->
                        if (posts.isNotEmpty()) {
                            if (posts[0].id == -1) {
                                return@Function Resource.error("Something went wrong", null)
                            }
                        }

                        Resource.success(posts)
                    })

                    .subscribeOn(Schedulers.io())
            )

            posts!!.addSource(source,
                Observer<Resource<List<Post>>> { listResource ->
                    posts!!.setValue(listResource)
                    posts!!.removeSource(source)
                })
        }
        return posts as MediatorLiveData<Resource<List<Post>>>
    }


}