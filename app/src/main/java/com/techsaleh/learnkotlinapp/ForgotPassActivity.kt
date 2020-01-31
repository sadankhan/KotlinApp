package com.techsaleh.learnkotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ForgotPassActivity : AppCompatActivity() {


    lateinit var etForgotUserName: EditText
    lateinit var etForgotEmail: EditText
    lateinit var etForgotPassword: EditText
    lateinit var etForgotConPassword:EditText //EditText Confirm Password
    lateinit var btnResetPassword: Button
    lateinit var tvForgotLogIn: TextView ////Might got the password magically :D
    lateinit var tvForgotRegister: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_pass)

        etForgotUserName       = findViewById(R.id.etResetUserName)
        etForgotEmail          = findViewById(R.id.etResetEmail)
        etForgotPassword       = findViewById(R.id.etResetPassword)
        etForgotConPassword    = findViewById(R.id.etResetPasswordConfirm)
        btnResetPassword       = findViewById(R.id.btnReset)
        tvForgotLogIn          = findViewById(R.id.tvResetLogIn)
        tvForgotRegister       = findViewById(R.id.tvResetRegister)

        btnResetPassword.setOnClickListener {
            intent = Intent(this@ForgotPassActivity, ContentActivity::class.java)
            intent.putExtra("msg", "Your password is Reset!!")
            startActivity(intent)
        }


        tvForgotLogIn.setOnClickListener {
            intent = Intent(this@ForgotPassActivity, LogInActivity::class.java)
            startActivity(intent)
        }

        tvForgotRegister.setOnClickListener {
            intent = Intent(this@ForgotPassActivity, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
