package com.example.homeautomation.core

class TemperatureDevice(name: String) : Device(name) {
    var temperature: Double = 20.0

    fun setTemperature(temp: Double) {
        temperature = temp
        println("$name temperature set to $temperature")
    }
}
