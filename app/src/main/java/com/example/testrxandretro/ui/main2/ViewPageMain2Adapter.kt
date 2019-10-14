package com.example.testrxandretro.ui.main2

import android.os.Parcelable
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.testrxandretro.data.model.Breeds
import com.example.testrxandretro.data.model.Dog

import com.example.testrxandretro.data.model.DogModel
import com.example.testrxandretro.ui.main2.dog.DogFragment


class ViewPageMain2Adapter (fm: FragmentManager) : FragmentStatePagerAdapter(fm)  {

     var arrayListDog: ArrayList<Dog> = ArrayList()



    override fun getItem(position: Int): Fragment {
        var dogFragment=DogFragment()
        Log.d("kiemtrasize",""+arrayListDog[position].listBreeds!!.size)
        dogFragment.setModel(arrayListDog[position].listBreeds!!)
      return dogFragment
    }

    override fun getCount(): Int {

        return arrayListDog.size


    }
    fun setPosts(arrayListDog: ArrayList<Dog>) {
        this.arrayListDog = arrayListDog

        notifyDataSetChanged()
    }

    override fun saveState(): Parcelable? {
        return null
    }

    override fun restoreState(state: Parcelable?, loader: ClassLoader?) {

    }

    override fun getPageTitle(position: Int): CharSequence? {
        return if (arrayListDog.isNotEmpty()) arrayListDog[position].breedName else return null

    }
}


