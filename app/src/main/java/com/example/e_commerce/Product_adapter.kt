package com.example.e_commerce

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class Product_adapter(private val dataset: List<Product_list> , private val clickListener2 : Product_list_activity) : RecyclerView.Adapter<Product_adapter.ViewHolder>() {

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        var prdt_img = itemView.findViewById<ImageView>(R.id.prdt_img)
        var prdt_desc = itemView.findViewById<TextView>(R.id.prdt_desc)
        var price = itemView.findViewById<TextView>(R.id.price)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view : View

        view = LayoutInflater.from(parent.context).inflate(R.layout.product_view,parent,false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val current = dataset[position]

        holder.prdt_img.setImageResource(current.Image_id)
        holder.prdt_desc.text = current.desc
        holder.price.text= current.price.toString()

        holder.itemView.setOnClickListener{

            clickListener2.onClick(position)
        }

    }

    override fun getItemCount(): Int {

        return dataset.size
    }

}

