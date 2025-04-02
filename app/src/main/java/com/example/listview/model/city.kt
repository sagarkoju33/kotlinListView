package com.example.listview.model

import com.example.listview.R

data class City(
    val name: String,
    val description: String = "",
    val image: Int = 0
)

/// object in Kotlin is used to create a singleton.
//This means CityData will have only one instance throughout the application's lifecycle.
//It is commonly used when you need to store static data or utility functions.
object CityData {

    //: here colon return the return type of the function
    fun getCities(): List<City> {
        return listOf(
            City(
                "New York",
                "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
                R.drawable.watch0_0
            ),
            City(
                "Los Angeles",
                "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
                R.drawable.watch0_2
            ),
            City(
                "Chicago",
                "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
                R.drawable.watch_5_2
            ),
            City(
                "Houston",
                "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
                R.drawable.watch_5_4
            ),
            City(
                "San Francisco",
                "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
                R.drawable.watch_5_3
            ),
            City(
                "Miami",
                "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
                R.drawable.watch_5_5
            ),
            City(
                "Seattle",
                "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
                R.drawable.watch0_2
            ),
            City(
                "Boston",
                "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
                R.drawable.watch0_0
            ),
            City(
                "Denver",
                "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
                R.drawable.watch0_2
            ),
            City(
                "Las Vegas",
                "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
                R.drawable.watch_5_4
            )
        )
    }
}