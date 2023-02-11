package com.example.techdetailsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstButton=findViewById<Button>(R.id.btn)

        firstButton.setOnClickListener {
            intent=Intent(applicationContext,allCards::class.java)
            startActivity(intent)
        }
    }
}