package com.example.e_commerce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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


        recycle.adapter = Adapter1(this,myDataset,flag)
        recycle.setHasFixedSize(true)
        recycle.layoutManager = LinearLayoutManager(this)

    }
}