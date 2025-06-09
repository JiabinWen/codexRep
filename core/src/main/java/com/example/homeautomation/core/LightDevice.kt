package com.example.homeautomation.core

class LightDevice(name: String) : Device(name) {
    var brightness: Int = 0
        set(value) {
            field = value
            println("$name brightness set to $value")
        }
}