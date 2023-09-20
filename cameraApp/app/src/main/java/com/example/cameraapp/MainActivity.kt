package com.example.cameraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById(R.id.button1) as Button

        btn.setOnClickListener {
            val intent = Intent(this, MeasureHealthActivity::class.java)
            startActivity(intent)
        }
    }
}

