package com.example.testrxandretro.ui.main

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.example.testrxandretro.R
import com.example.testrxandretro.ui.base.BaseActivity
import com.example.testrxandretro.ui.main.post.PostFragment
import com.example.testrxandretro.ui.main.profile.ProfileFragment

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.container,PostFragment())
            .commit()


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflate:MenuInflater=menuInflater
        inflate.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        when (item.itemId) {
            R.id.logout -> {
                sessionManager.logOut()
                return true
            }

            else -> return super.onOptionsItemSelected(item)
        }
    }
}