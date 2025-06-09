package com.example.homeautomation.core

class LightDevice(name: String) : Device(name) {
    var brightness: Int = 0

    fun setBrightness(level: Int) {
        brightness = level
        println("$name brightness set to $brightness")
    }
}
