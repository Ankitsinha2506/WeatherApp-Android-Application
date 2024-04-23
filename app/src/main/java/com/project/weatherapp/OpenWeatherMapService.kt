package com.project.weatherapp

/*
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface OpenWeatherMapService {
    @GET("find")
    fun findCities(
        @Query("q") query: String,
        @Query("type") type: String = "like",
        @Query("mode") mode: String = "json",
        @Query("appid") apiKey: String
    ): Call<CitySearchResponse>

    data class CitySearchResponse(
        val list: List<City>
    )

    data class City(
        val id: Long,
        val name: String,
        val coord: Coord,
        val main: Main,
        val sys: Sys,
        val weather: List<Weather>,
        val dt: Long,
        val wind: Wind
    )

    data class Coord(
        val lat: Double,
        val lon: Double
    )

    data class Main(
        val temp: Double,
        val pressure: Int,
        val humidity: Int,
        val temp_min: Double,
        val temp_max: Double
    )

    data class Sys(
        val country: String,
        val sunrise: Long,
        val sunset: Long
    )

    data class Weather(
        val id: Int,
        val main: String,
        val description: String,
        val icon: String
    )

    data class Wind(
        val speed: Double,
        val deg: Int
    )

}
*/
