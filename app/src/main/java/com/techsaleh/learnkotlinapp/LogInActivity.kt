package com.techsaleh.learnkotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LogInActivity : AppCompatActivity() {

    //All Views variables in Activity LogIn
    lateinit var etLogInUserName: EditText
    lateinit var etLogInPassword: EditText
    lateinit var btnLogIn: Button
    lateinit var tvLogInForgotPassword: TextView
    lateinit var tvLogInRegister: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)


        etLogInUserName       = findViewById(R.id.etLogInUserName)
        etLogInPassword       = findViewById(R.id.etLogInPassword)
        btnLogIn              = findViewById(R.id.btnLogIn)
        tvLogInForgotPassword = findViewById(R.id.tvLogInForgotPass)
        tvLogInRegister       = findViewById(R.id.tvLogInRegister)

        btnLogIn.setOnClickListener {
            intent = Intent(this@LogInActivity, ContentActivity::class.java)
            intent.putExtra("msg", "You are Logged In")
            startActivity(intent)
        }

        tvLogInForgotPassword.setOnClickListener {
            intent = Intent(this@LogInActivity, ForgotPassActivity::class.java)
            startActivity(intent)
        }

        tvLogInRegister.setOnClickListener {
            intent = Intent(this@LogInActivity, RegisterActivity::class.java)
            startActivity(intent)
        }

    }


}
