package com.example.techdetailsapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class iosAppDev : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ios_app_dev)

        val ioscard1=findViewById<CardView>(R.id.ios_image1)
        val ioscard2=findViewById<CardView>(R.id.ios_image2)
        val ioscard3=findViewById<CardView>(R.id.ios_image3)
        val ioscard4=findViewById<CardView>(R.id.ios_image4)
        ioscard1.setOnClickListener{
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://developer.apple.com/swift/")
            startActivity(intent)
        }
        ioscard2.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://developer.apple.com/xcode/")
            startActivity(intent)
        }
        ioscard3.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://flutter.dev/?gclsrc=ds&gclsrc=ds")
            startActivity(intent)
        }
        ioscard4.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://firebase.google.com/")
            startActivity(intent)
        }
    }
}