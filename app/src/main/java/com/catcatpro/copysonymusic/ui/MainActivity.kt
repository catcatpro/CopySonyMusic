package com.catcatpro.copysonymusic.ui

import android.app.Activity
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.os.DropBoxManager
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.lifecycle.livedata.core.ktx.R
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.catcatpro.copysonymusic.Adapters.HomePlayQueueAdapter
import com.catcatpro.copysonymusic.data.Music
import com.catcatpro.copysonymusic.databinding.ActivityMainBinding

class MainActivity :AppCompatActivity(){
    lateinit var binding: ActivityMainBinding
    lateinit var drawerLayout: DrawerLayout
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
            //隐藏标题
            it.setDisplayShowTitleEnabled(false)
        }

        //侧边栏布局
        drawerLayout = binding.drawerLayout
        //侧边栏菜单
        val navMenu = binding.navMenu
        navMenu.itemIconTintList = null
        navMenu.setCheckedItem(com.catcatpro.copysonymusic.R.id.nav_menu_home)

        //播放队列
        val playQueue:RecyclerView = binding.homePlayQueue.homePlayList
//        设置item间距
        playQueue.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.HORIZONTAL))
        //测试数据
        val playQueueData = arrayOf<Music>(
            Music("夢灯籠", com.catcatpro.copysonymusic.R.drawable.test_music_1, "RADWIMPS","君の名は"),
            Music("三葉の通学", com.catcatpro.copysonymusic.R.drawable.test_music_1, "RADWIMPS","君の名は"),
            Music("糸守高校", com.catcatpro.copysonymusic.R.drawable.test_music_1, "RADWIMPS","君の名は"),
        )

        val adapter = HomePlayQueueAdapter(playQueueData)
        playQueue.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(com.catcatpro.copysonymusic.R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        Log.d("okkk","okk")
        when(item.itemId){
            android.R.id.home -> drawerLayout.openDrawer(GravityCompat.START)
        }
        return true
    }
}

