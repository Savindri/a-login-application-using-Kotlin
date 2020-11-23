package com.example.kotlin_lab9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_click = findViewById<Button>(R.id.btnLoginClick)
        btn_click.setOnClickListener {
            /*create a Kotlin Class file
            to add the listeners
            for calling the actions from the XML file*/
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }

}