package com.techsaleh.learnkotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {

    lateinit var etUserName: EditText
    lateinit var etEmail: EditText
    lateinit var etPassword: EditText
    lateinit var etConPassword: EditText //EditText Confirm Password
    lateinit var btnRegister: Button
    lateinit var tvLogIn: TextView //Might got the password magically :D

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        etUserName    = findViewById(R.id.etRegUser)
        etEmail       = findViewById(R.id.etRegEmail)
        etPassword    = findViewById(R.id.etRegPassword)
        etConPassword = findViewById(R.id.etRegPasswordConfirm)
        btnRegister   = findViewById(R.id.btnReg)
        tvLogIn       = findViewById(R.id.tvRegLogIn)

        btnRegister.setOnClickListener {
            intent = Intent(this@RegisterActivity, ContentActivity::class.java)
            intent.putExtra("msg", "You are Registered! Enjoy!")
            startActivity(intent)
        }

        tvLogIn.setOnClickListener {
            intent = Intent(this@RegisterActivity, LogInActivity::class.java)
            startActivity(intent)
        }



    }
}
