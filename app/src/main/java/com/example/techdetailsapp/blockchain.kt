package com.example.techdetailsapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class blockchain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blockchain)

        val blcard1 = findViewById<CardView>(R.id.Bl_image1)
        val blcard2 = findViewById<CardView>(R.id.Bl_image2)
        val blcard3 = findViewById<CardView>(R.id.Bl_image3)
        val blcard4 = findViewById<CardView>(R.id.Bl_image4)

        blcard1.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://soliditylang.org/")
            startActivity(intent)
        }
        blcard2.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://geth.ethereum.org/")
            startActivity(intent)
        }
        blcard3.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://metamask.io/")
            startActivity(intent)
        }
        blcard4.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://trufflesuite.com/ganache/")
            startActivity(intent)
        }
    }
}