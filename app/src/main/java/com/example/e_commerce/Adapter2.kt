package com.example.e_commerce

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class Adapter2(context: Context,private val dataset: List<Recently_viewed_attr>) : RecyclerView.Adapter<Adapter2.ViewHolder>() {

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        var price = itemView.findViewById<TextView>(R.id.price_recent_item)
        var img = itemView.findViewById<ImageView>(R.id.recent_img)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.recent_items,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val current = dataset[position]
        holder.price.text=current.price
        holder.img.setImageResource(current.Image_id)
    }

    override fun getItemCount(): Int {

        return dataset.size
    }
}


