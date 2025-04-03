package com.example.listview.model

import android.content.Context
import com.google.gson.Gson
import java.io.IOException

data class Banner(
    val url: String
)

data class Category(
    val id: Int,
    val title: String
)

data class PopularItem(
    val title: String,
    val description: String,
    val thumbnail: String,
    val price: Double,
    val rating: Double,
    val picUrl: List<String>
)

data class ApiResponse(
    val Banner: List<Banner>,
    val Category: List<Category>,
    val Popular: List<PopularItem>
)


fun loadJsonFromAssets(context: Context, fileName: String): String? {
    return try {
        context.assets.open(fileName).bufferedReader().use { it.readText() }
    } catch (ex: IOException) {
        ex.printStackTrace()
        null
    }
}

fun parseJson(context: Context): ApiResponse? {
    val json = loadJsonFromAssets(context, "data.json") // Ensure data.json is in assets
    return Gson().fromJson(json, ApiResponse::class.java)
}


