package com.catcatpro.copysonymusic.Adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.catcatpro.copysonymusic.R
import com.catcatpro.copysonymusic.data.Music

class HomePlayQueueAdapter (private val data: Array<Music>): RecyclerView.Adapter<HomePlayQueueAdapter.ViewHolder>(){
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            var title:TextView
            var music_img: ImageView
            val artist: TextView

            init {
                title = view.findViewById(R.id.music_title)
                music_img = view.findViewById(R.id.musicImg)
                artist = view.findViewById(R.id.artist)
                Log.d("testtest","ok")

            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.home_music_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = data[position].title
        holder.music_img.setImageResource(data[position].albumImage)
        holder.artist.text = data[position].artist

    }

}