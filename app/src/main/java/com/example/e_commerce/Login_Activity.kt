package com.example.e_commerce

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class Login_Activity : AppCompatActivity() {

    lateinit var memail : EditText
    lateinit var mpass : EditText
    lateinit var auth : FirebaseAuth
    lateinit var login : Button
    lateinit var text : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        memail = findViewById(R.id.email_text)
        mpass = findViewById(R.id.password_id)
        auth = FirebaseAuth.getInstance()

        login = findViewById(R.id.login_button_id)

        text = findViewById(R.id.sign_up_text)

        login.setOnClickListener {

            LoginUser()
        }
        text.setOnClickListener {

            startActivity(Intent(this,Sign_in_Activity::class.java))
        }
    }

    private fun LoginUser() {

        val email = memail.getText().toString()
        val pass = mpass.getText().toString()

        if(email.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()){

            if(pass.isNotEmpty()){

                auth.signInWithEmailAndPassword(email,pass).addOnCompleteListener {

                    if(it.isSuccessful){

                        Toast.makeText(this,"Login Successfully", Toast.LENGTH_SHORT).show()

                        val intent2 = Intent(this,Account_Activity::class.java)
                        intent2.putExtra(Account_Activity.account_status,"1")
                        intent2.putExtra(Account_Activity.name,email)
                        startActivity(intent2)
                    }
                    else{

                        Toast.makeText(this,"Login Failed", Toast.LENGTH_SHORT).show()
                    }
                }

            }
            else{
                mpass.setError("Please Enter Your Password!")
            }
        }
        else if(email.isEmpty()){

            memail.setError("Please Enter Your Email")
        }
        else{
            memail.setError("Please Enter Your Correct Email")
        }
    }
}

