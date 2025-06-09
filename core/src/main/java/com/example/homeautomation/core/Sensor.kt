package com.example.homeautomation.core

class Sensor(val name: String) {
    fun read(): String {
        return "Sample data from $name"
    }
}
