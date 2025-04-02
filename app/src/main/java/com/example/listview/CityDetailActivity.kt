package com.example.listview

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CityDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city_detail)

        // Get references to views
        val backArrow = findViewById<ImageView>(R.id.backArrow)
        val cityImage = findViewById<ImageView>(R.id.cityDetailImage)
        val cityName = findViewById<TextView>(R.id.cityDetailName)
        val cityDescription = findViewById<TextView>(R.id.cityDetailDescription)

        // Get data from Intent
        val imageResId = intent.getIntExtra("city_image", 0)
        val name = intent.getStringExtra("city_name")
        val description = intent.getStringExtra("city_description")

        // Set data to views
        cityImage.setImageResource(imageResId)
        cityName.text = name
        cityDescription.text = description

        // Set click listener for back arrow to return to the list
        backArrow.setOnClickListener {
            finish()  // Closes the current activity
        }
    }
}