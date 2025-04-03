package com.example.listview


import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class CityDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city_detail)

        // Get references to views
        val backArrow = findViewById<ImageView>(R.id.backArrow)
        val cityImage = findViewById<ImageView>(R.id.cityDetailImage)
        val cityName = findViewById<TextView>(R.id.cityDetailName)
        val cityDescription = findViewById<TextView>(R.id.cityDetailDescription)
        val cityPrice = findViewById<TextView>(R.id.cityPrice)


        // Get data from Intent
        val imageResId = intent.getStringExtra("city_image")
        val name = intent.getStringExtra("city_name")
        val description = intent.getStringExtra("city_description")
        val price = intent.getStringExtra("city_price")

        // Set data to views
//        cityImage.setImageResource(imageResId ?? "")
        cityName.text = name
        cityDescription.text = description
        cityPrice.text = getString(R.string.price_format, price)


        // Load image using Glide (add Glide dependency in build.gradle)

        Glide.with(this)
            .load(imageResId)  // URL of the image
            .into(cityImage)

        // Set click listener for back arrow to return to the list
        backArrow.setOnClickListener {
            finish()
        }
    }
}