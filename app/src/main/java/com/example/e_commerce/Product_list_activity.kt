package com.example.e_commerce

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.HorizontalScrollView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Product_list_activity : AppCompatActivity() {

    companion object{
        const val type = "prdt"
    }

    private lateinit var recycle : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_list)

        val prdt_type = intent.getStringExtra(type).toString()

        recycle = findViewById(R.id.product_list_view)

        start(prdt_type,recycle)
    }

    fun start(type : String,recycle : RecyclerView){

         if(type=="Men"){

             val mydata = Category().loadMen()
             recycle.adapter=Product_adapter(mydata)
             recycle.setHasFixedSize(true)
             recycle.layoutManager = GridLayoutManager(this,2)

         }
        else if(type=="Kurti & Suit"){

             val mydata = Category().loadKurti()

             recycle.adapter=Product_adapter(mydata)
             recycle.setHasFixedSize(true)
             recycle.layoutManager = LinearLayoutManager(this)
         }
    }
}