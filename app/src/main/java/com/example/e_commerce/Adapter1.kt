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

class Adapter1(context: Context,private val dataset: List<Category_attributes>) : RecyclerView.Adapter<Adapter1.ViewHolder>() {

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        var category_name1 = itemView.findViewById<TextView>(R.id.category_name)
        var category_img1 = itemView.findViewById<ImageView>(R.id.category_img)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.category_list,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

         val current = dataset[position]

         holder.category_name1.text=current.name

        holder.category_img1.setImageResource(current.Image_id)

    }

    override fun getItemCount(): Int {

        return dataset.size
    }
}


