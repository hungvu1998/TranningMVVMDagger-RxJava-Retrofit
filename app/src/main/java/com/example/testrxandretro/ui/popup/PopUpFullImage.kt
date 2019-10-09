package com.example.testrxandretro.ui.popup

import android.os.Bundle
import android.util.Log
import android.view.Window
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.testrxandretro.R
import com.example.testrxandretro.ui.base.BaseActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.dialog_full_img.*


class PopUpFullImage : BaseActivity(){




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.dialog_full_img)

        val img= intent.getStringExtra("img")
        Picasso.get().load(img).into(img_anh)

    }

}