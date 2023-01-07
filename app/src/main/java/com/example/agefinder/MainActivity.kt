package com.example.agefinder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var btn:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //link the button
        btn=findViewById(R.id.btn_age)

        //button action
        btn.setOnClickListener{
            Toast.makeText(this,"You clicked The Button", Toast.LENGTH_LONG).show()
        }

    }
}