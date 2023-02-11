package com.example.techdetailsapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class androidAppDev : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_app_dev)

        val card1=findViewById<CardView>(R.id.An_image1)
        val card2=findViewById<CardView>(R.id.An_image2)
        val card3=findViewById<CardView>(R.id.An_image3)
        val card4=findViewById<CardView>(R.id.An_image4)
        card1.setOnClickListener{
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.geeksforgeeks.org/kotlin-programming-language/")
            startActivity(intent)
        }
        card2.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.geeksforgeeks.org/java")
            startActivity(intent)
        }
        card3.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.geeksforgeeks.org/xml-basics/")
            startActivity(intent)
        }
        card4.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://firebase.google.com/")
            startActivity(intent)
        }
    }
}