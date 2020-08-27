package com.prodev.photoalbum

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.photal_item.view.*


class Adapter(private val albums: ArrayList<Album> = ArrayList()) :
    RecyclerView.Adapter<Adapter.AlbumViewHolder>() {


    class AlbumViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.photal_item, parent, false)
        return (AlbumViewHolder(view))
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        holder.itemView.title_tv.text = albums[position].title
        holder.itemView.album_id_tv.text = albums[position].albumId.toString()
        holder.itemView.photo_id_tv.text = albums[position].photoId.toString()
        holder.itemView.url_tv.text = albums[position].url

    }

    override fun getItemCount(): Int {
        return albums.size
    }


}
