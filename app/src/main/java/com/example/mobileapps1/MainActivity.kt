package com.example.mobileapps1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.mobileapps1.R.id.saveButton


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO: Add some main activity code here

        val myTextView = findViewById<TextView>(R.id.welcomeText)
        myTextView.text = getString(R.string.some_text)

        val myTextView2 = findViewById<TextView>(R.id.myTextView2)
        val newTextString2 = getString(R.string.some_text) + "123"

        myTextView2.text = newTextString2

        val myTextView3 = findViewById<TextView>(R.id.myTextView3)
        val newTextString3 = getString(R.string.some_text) + "123"
        myTextView3.text = newTextString3

        val welcomeNameText = findViewById<TextView>(R.id.welcomeText)
        val saveButton = findViewById<Button>(R.id.saveButton)
        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val nameText = nameEditText.text
        val name = "Gray"


        saveButton.setOnClickListener {
            myTextView2.text = "Welcome " + nameText


        }
    }
}



