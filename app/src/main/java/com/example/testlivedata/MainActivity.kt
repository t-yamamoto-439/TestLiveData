package com.example.testlivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.layout.toolbar)
    }
}