package com.example.weatherapp.repository

import com.example.weatherapp.api.WeatherApiService
import javax.inject.Inject

class WeatherRepository
@Inject
constructor(private val apiService: WeatherApiService){

    suspend fun getWeather() = apiService.getWeather()
}