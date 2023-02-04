package com.example.e_commerce

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import kotlin.math.sign

class Account_Activity : AppCompatActivity() {

    companion object{

        var account_status = "0"
        var name = "Username"
    }

    lateinit var home : LinearLayout
    lateinit var signin : Button
    lateinit var username : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        home = findViewById(R.id.home_button)
        signin = findViewById(R.id.sign_in_button)
        username = findViewById(R.id.User_name)

        val view_type = intent.getStringExtra(account_status)
        val name2 = intent.getStringExtra(name)

        if(view_type.toString()=="1"){

            signin.text = "Sign out"
            username.text = name2

        }

        home.setOnClickListener{

            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

        signin.setOnClickListener {

            if(signin.text != "Sign out"){

                startActivity(Intent(this,Login_Activity::class.java))
            }
            else{

                Toast.makeText(this,"Logged Out",Toast.LENGTH_SHORT).show()
                signin.text = "Sign in"
                account_status = "0"
                username.text = "Username"
            }

        }

    }
}