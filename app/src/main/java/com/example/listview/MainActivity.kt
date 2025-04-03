package com.example.listview

import PopularAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listview.model.parseJson

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

//        val cityList = CityData.getCities()
//
//        recyclerView.adapter = CityAdapter(cityList)

        val data = parseJson(this) // Load JSON from assets
        if (data != null) {
            recyclerView.adapter = PopularAdapter(data.Popular)
        }
    }
}