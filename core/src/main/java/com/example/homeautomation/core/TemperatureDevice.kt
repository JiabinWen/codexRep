package com.example.homeautomation.core

class TemperatureDevice(name: String) : Device(name) {
    var temperature: Double = 20.0
        set(value) {
            field = value
            println("$name temperature set to $value")
        }
}
