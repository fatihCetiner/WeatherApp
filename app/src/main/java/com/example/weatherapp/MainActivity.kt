package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.weatherapp.databinding.ActivityMainBinding
import com.example.weatherapp.ui.WeatherViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: WeatherViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        viewModel.weatherResp.observe(this,{weather ->

            binding.apply {
                tvCity.text = "Ankara"
                tvTemperature.text = weather.temperature
                tvDescription.text = weather.description
                tvWind.text = weather.wind

                val forecast1 = weather.forecast[0]
                val forecast2 = weather.forecast[0]
                val forecast3 = weather.forecast[0]

                tvforecast1.text = "${forecast1.temperature}/ ${forecast1.wind}"
                tvforecast1.text = "${forecast2.temperature}/ ${forecast2.wind}"
                tvforecast1.text = "${forecast3.temperature}/ ${forecast3.wind}"
            }
        })
    }
}