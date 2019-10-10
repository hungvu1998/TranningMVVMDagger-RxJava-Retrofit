package com.example.testrxandretro.ui.main2

import android.os.Parcelable
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

import androidx.fragment.app.FragmentStatePagerAdapter

import com.example.testrxandretro.data.model.DogModel
import com.example.testrxandretro.ui.main2.dog.DogFragment


class ViewPageMain2Adapter (fm: FragmentManager) : FragmentStatePagerAdapter(fm)  {



     var dogList: ArrayList<DogModel> = ArrayList()



    override fun getItem(position: Int): Fragment {
        var dogFragment=DogFragment()
        if (dogList.isNotEmpty()){
            dogFragment.setModel(dogList[position])
        }
      return dogFragment
    }

    override fun getCount(): Int {

        return dogList.size


    }
    fun setPosts(dogList: ArrayList<DogModel>) {
        this.dogList = dogList
        notifyDataSetChanged()
    }

    override fun saveState(): Parcelable? {
        return null
    }

    override fun restoreState(state: Parcelable?, loader: ClassLoader?) {

    }

    override fun getPageTitle(position: Int): CharSequence? {
        return if (dogList.isNotEmpty()) dogList[position].breedName else return null
    }
}


