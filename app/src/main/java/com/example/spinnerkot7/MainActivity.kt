package com.example.spinnerkot7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val span=findViewById<Spinner>(R.id.spinner)
        val fruits= arrayOf("apple","mango","banana","orange","papaya","coconut","pineapple")
        val arrayadap=ArrayAdapter(this@MainActivity,android.R.layout.simple_spinner_dropdown_item,fruits)
        span.adapter=arrayadap
    }
}