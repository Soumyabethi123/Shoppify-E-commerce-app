package com.example.e_commerce

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity2 : AppCompatActivity() {

    lateinit var recycle1 : RecyclerView
    lateinit var recycle2 : RecyclerView
    lateinit var recycle3 : RecyclerView

    lateinit var account : LinearLayout
    lateinit var cat : LinearLayout
    private var flag=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        recycle1 = findViewById(R.id.category_list)
        recycle2 = findViewById(R.id.Products_list)
        recycle3 = findViewById(R.id.third)

        val myDataset = Category().loadAffirmations()

        recycle1.adapter = Adapter1(this,myDataset,flag,this,Category_Activity())
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

    fun onClick(type : String){

        val intent = Intent(this,Product_list_activity::class.java)
        intent.putExtra(Product_list_activity.type,type)
        startActivity(intent)
    }
}