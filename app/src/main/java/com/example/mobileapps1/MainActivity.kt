package com.example.mobileapps1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO: Add some main activity code here

      val myTextView = findViewById<TextView>(R.id.myTextView)

        myTextView.text="Something"



