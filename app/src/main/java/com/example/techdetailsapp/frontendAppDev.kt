package com.example.techdetailsapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class frontendAppDev : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frontend_app_dev)

        val fwcard1=findViewById<CardView>(R.id.Fw_image1)
        val fwcard2=findViewById<CardView>(R.id.Fw_image2)
        val fwcard3=findViewById<CardView>(R.id.Fw_image3)
        val fwcard4=findViewById<CardView>(R.id.Fw_image4)

        fwcard1.setOnClickListener{
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.w3schools.com/html/html_intro.asp")
            startActivity(intent)
        }
        fwcard2.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.w3schools.com/css/")
            startActivity(intent)
        }
        fwcard3.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.w3schools.com/js/")
            startActivity(intent)
        }
        fwcard4.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://reactjs.org/")
            startActivity(intent)
        }
    }
}