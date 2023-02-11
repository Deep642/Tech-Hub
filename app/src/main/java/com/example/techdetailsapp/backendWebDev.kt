package com.example.techdetailsapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class backendWebDev : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_backend_web_dev)
        val bwcard1=findViewById<CardView>(R.id.Bw_image1)
        val bwcard2=findViewById<CardView>(R.id.Bw_image2)
        val bwcard3=findViewById<CardView>(R.id.Bw_image3)
        val bwcard4=findViewById<CardView>(R.id.Bw_image4)
        bwcard1.setOnClickListener{
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://spring.io/")
            startActivity(intent)
        }
        bwcard2.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://nodejs.org/en/")
            startActivity(intent)
        }
        bwcard3.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.mongodb.com/")
            startActivity(intent)
        }
        bwcard4.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.php.net/")
            startActivity(intent)
        }
    }
}