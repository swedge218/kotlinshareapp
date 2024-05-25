package com.tp.msgshareapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btnShowToast: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast = findViewById(R.id.btnShowToast);

        btnShowToast.setOnClickListener {
            Log.i("MainActivity", "ShowToast button clicked")
            Toast.makeText(this, "Button Clicked long", Toast.LENGTH_LONG).show()
        }
    }
}