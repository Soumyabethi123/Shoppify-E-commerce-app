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

class Sign_in_Activity : AppCompatActivity() {

    lateinit var memail : EditText
    lateinit var mpass : EditText
    lateinit var text : TextView
    lateinit var signUp : Button

    lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        memail = findViewById(R.id.email_text)
        mpass = findViewById(R.id.pass_text)
        text = findViewById(R.id.login_text)
        signUp = findViewById(R.id.sign_up)
        auth = FirebaseAuth.getInstance()

        text.setOnClickListener {

            startActivity(Intent(this,Login_Activity::class.java))
        }

        signUp.setOnClickListener {

            createuser()
        }
    }

    private fun createuser() {

        val email = memail.getText().toString()
        val pass = mpass.getText().toString()

        if(email.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()){

            if(pass.isNotEmpty()){

                auth.createUserWithEmailAndPassword(email,pass)

                    .addOnCompleteListener {

                        if(it.isSuccessful){

                            Toast.makeText(this,"Registered Successfully", Toast.LENGTH_SHORT).show()

                            val intent = Intent(this,Login_Activity::class.java)
                            startActivity(intent)
                        }
                        else{

                            Toast.makeText(this,it.exception.toString(), Toast.LENGTH_SHORT).show()
                        }
                    }

                    .addOnFailureListener {

                        Toast.makeText(this, "Registration Error!! Try Again", Toast.LENGTH_SHORT)
                            .show()
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