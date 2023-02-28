package com.example.e_commerce


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class Adapter1(
    val context: Context, private val dataset: List<Category_attributes>, val flag:Int
    , private val clickListener: MainActivity2 , private val clickListener2 : Category_Activity
) : RecyclerView.Adapter<Adapter1.ViewHolder>() {

    class ViewHolder(itemView : View,flag1: Int) : RecyclerView.ViewHolder(itemView){

        var category_name1 = itemView.findViewById<TextView>(R.id.category_name)
        var category_img1 = itemView.findViewById<ImageView>(R.id.category_img)
        var cat_name2 = itemView.findViewById<TextView>(R.id.cat_name)
        var cat_img2 = itemView.findViewById<ImageView>(R.id.category_image)
        var cat_desc = itemView.findViewById<TextView>(R.id.cat_desc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view : View

        if(flag==0){

            view = LayoutInflater.from(parent.context).inflate(R.layout.category_list,parent,false)
        }
        else{

            view = LayoutInflater.from(parent.context).inflate(R.layout.category_list_view,parent,false)
        }
        return ViewHolder(view,flag)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

         val current = dataset[position]

        if(flag==0){

            holder.category_name1.text=current.name

            holder.category_img1.setImageResource(current.Image_id)

            holder.itemView.setOnClickListener{

                clickListener.onClick(current.name.toString())
            }
        }
        else{

            holder.cat_name2.text=current.name
            holder.cat_img2.setImageResource(current.Image_id)
            holder.cat_desc.text = current.desc

            holder.itemView.setOnClickListener{

                clickListener2.onClick2(holder.cat_name2.text.toString())
            }
        }


    }

    override fun getItemCount(): Int {

        return dataset.size
    }

}

