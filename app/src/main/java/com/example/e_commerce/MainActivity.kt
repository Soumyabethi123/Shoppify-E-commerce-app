package com.example.e_commerce

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private var click : ImageView?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        click = findViewById(R.id.front_img)

        click!!.setOnClickListener{

             val intent =Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}