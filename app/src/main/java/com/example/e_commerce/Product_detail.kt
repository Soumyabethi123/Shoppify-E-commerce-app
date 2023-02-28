package com.example.e_commerce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.annotation.DrawableRes
import androidx.recyclerview.widget.GridLayoutManager

class Product_detail : AppCompatActivity() {

    lateinit var mydata : List<Product_list>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val type = intent.getStringExtra("key").toString()

        val mIntent = getIntent();
        val position = mIntent.getIntExtra("intVariableName", 0);

        val img = findViewById<ImageView>(R.id.prdt_view_img)

        if(type=="Men"){

            mydata = Category().loadMen()

        }
        else if(type=="Kurti & Suit"){

            mydata = Category().loadKurti()
        }
        else if(type=="Saree"){

            mydata = Category().loadSaree()
        }

        img.setImageResource(mydata[position].Image_id)
    }
}