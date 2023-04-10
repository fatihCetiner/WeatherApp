package com.example.weatherapp.api

import com.example.weatherapp.model.Weather
import retrofit2.Response
import retrofit2.http.GET

interface WeatherApiService {

    @GET("/weather/Ankara")
    suspend fun getWeather(): Response<Weather>
}