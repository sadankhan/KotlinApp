package com.techsaleh.learnkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ContentActivity : AppCompatActivity() {

    lateinit var tvRep: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content)
        tvRep = findViewById(R.id.tvOpen)

        var message = intent.getStringExtra("msg").toString()
        tvRep.text = message

    }
}
