package com.example.techdetailsapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class machineLearning : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_machine_learning)
        val mlcard1=findViewById<CardView>(R.id.Ml_image1)
        val mlcard2=findViewById<CardView>(R.id.Ml_image2)
        val mlcard3=findViewById<CardView>(R.id.Ml_image3)
        val mlcard4=findViewById<CardView>(R.id.Ml_image4)
        mlcard1.setOnClickListener{
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.python.org/")
            startActivity(intent)
        }
        mlcard2.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.tensorflow.org/")
            startActivity(intent)
        }
        mlcard3.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://keras.io/")
            startActivity(intent)
        }
        mlcard4.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://colab.research.google.com/")
            startActivity(intent)
        }
    }
}