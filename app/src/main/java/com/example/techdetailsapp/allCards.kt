package com.example.techdetailsapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.cardview.widget.CardView

class allCards : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_cards)

        //call system generated:-
        val callButton=findViewById<Button>(R.id.callBtn)
        callButton.setOnClickListener {
            val intent=Intent(Intent.ACTION_DIAL)
            intent.data= Uri.parse("tel:+919064092334")
            startActivity(intent)
        }

        //mail system generated:-
        val emailButton=findViewById<Button>(R.id.emailBtn)
        emailButton.setOnClickListener {
            val intent=Intent(Intent.ACTION_SENDTO)
            intent.data= Uri.parse("mailto:deep16082001@gmail.com")
            startActivity(intent)
        }

        val androidButton=findViewById<CardView>(R.id.androidbtn)
        val iosButton=findViewById<CardView>(R.id.iosbtn)
        val frontendButton=findViewById<CardView>(R.id.frontendbtn)
        val backendButton=findViewById<CardView>(R.id.backendbtn)
        val machinelearningButton=findViewById<CardView>(R.id.machinelearningbtn)
        val blockchainButton=findViewById<CardView>(R.id.blockchainbtn)

        androidButton.setOnClickListener {
            intent=Intent(applicationContext,androidAppDev::class.java)
            startActivity(intent)
        }
        iosButton.setOnClickListener {
            intent=Intent(applicationContext,iosAppDev::class.java)
            startActivity(intent)
        }
        frontendButton.setOnClickListener {
            intent=Intent(applicationContext,frontendAppDev::class.java)
            startActivity(intent)
        }
        backendButton.setOnClickListener {
            intent=Intent(applicationContext,backendWebDev::class.java)
            startActivity(intent)
        }
        machinelearningButton.setOnClickListener {
            intent=Intent(applicationContext,machineLearning::class.java)
            startActivity(intent)
        }
        blockchainButton.setOnClickListener {
            intent=Intent(applicationContext,blockchain::class.java)
            startActivity(intent)
        }
    }
}
