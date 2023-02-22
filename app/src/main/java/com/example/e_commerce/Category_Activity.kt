package com.example.e_commerce

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Category_Activity : AppCompatActivity() {

    lateinit var recycle : RecyclerView
    private var flag=1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        recycle = findViewById(R.id.category_list_tab)

        val myDataset = Category().loadAffirmations()


        recycle.adapter = Adapter1(this,myDataset,flag, MainActivity2(),this)
        recycle.setHasFixedSize(true)
        recycle.layoutManager = LinearLayoutManager(this)

    }

    fun onClick2(type : String){

        val intent = Intent(this,Product_list_activity::class.java)

        intent.putExtra(Product_list_activity.type,type)

        startActivity(intent)

    }

}