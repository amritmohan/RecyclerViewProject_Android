package com.example.marvel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.marvel.R

class MarvelAdapter(val context: MainActivity, val data:ArrayList<MarvelData>): RecyclerView.Adapter<MarvelAdapter.Inner>() {


    class Inner(view:View):RecyclerView.ViewHolder(view) {

        val title:TextView=view.findViewById(R.id.title)
        val image:ImageView=view.findViewById(R.id.image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Inner {

        val inflater=LayoutInflater.from(context)
        val view=inflater.inflate(R.layout.marvel_layout, parent, false)
        return Inner(view)
    }

    override fun getItemCount(): Int {

        return data.size
    }

    override fun onBindViewHolder(holder: Inner, position: Int) {
        holder.title.text= data.get(position).title
        holder.image.setImageResource(data.get(position).image)

    }
}
