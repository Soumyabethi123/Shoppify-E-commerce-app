package com.example.e_commerce

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity2 : AppCompatActivity() {

    lateinit var recycle1 : RecyclerView
    lateinit var recycle2 : RecyclerView
    lateinit var recycle3 : RecyclerView

    lateinit var account : LinearLayout
    lateinit var cat : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        recycle1 = findViewById(R.id.category_list)
        recycle2 = findViewById(R.id.Products_list)
        recycle3 = findViewById(R.id.third)

        val myDataset = Category().loadAffirmations()

        recycle1.adapter = Adapter1(this,myDataset)
        recycle1.setHasFixedSize(true)
        recycle1.layoutManager = LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)

        val mydata2 = Recently_Viewed().loadData()
        
        recycle2.adapter = Adapter2(this,mydata2)
        recycle2.setHasFixedSize(true)
        recycle2.layoutManager = LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)

        account = findViewById(R.id.account_button)
        cat = findViewById(R.id.category_button)

        cat.setOnClickListener{

            startActivity(Intent(this,Category_Activity::class.java))
        }

        account!!.setOnClickListener {

            val intent = Intent(this,Account_Activity::class.java)
            startActivity(intent)
        }

    }
}