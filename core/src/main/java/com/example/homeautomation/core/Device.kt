package com.example.homeautomation.core

/**
 * Base device representation supporting custom protocol configuration.
 */
open class Device(var name: String) {
    open fun connect(protocol: String) {
        println("Connecting $name using protocol: $protocol")
    }
}
