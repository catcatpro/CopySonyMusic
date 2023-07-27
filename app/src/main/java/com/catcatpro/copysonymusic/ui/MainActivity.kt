package com.catcatpro.copysonymusic.ui

import android.app.Activity
import android.os.Bundle
import android.view.Menu
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.livedata.core.ktx.R
import com.catcatpro.copysonymusic.databinding.ActivityMainBinding

class MainActivity :AppCompatActivity(){
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
       setContentView(binding.root)
        if (supportActionBar == null)
            setSupportActionBar(binding.toolbar)
        else
            binding.toolbar.visibility = View.GONE
        supportActionBar?.let {
            it.setDisplayHomeAsUpEnabled(true)
            //侧边菜单icon
            it.setHomeAsUpIndicator(com.catcatpro.copysonymusic.R.drawable.ic_menu)
            it.setDisplayShowTitleEnabled(false)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(com.catcatpro.copysonymusic.R.menu.main, menu)
        return true
    }
}

