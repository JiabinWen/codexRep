package com.example.homeautomation.core

class AutomationManager {
    private val actions = mutableListOf<() -> Unit>()

    fun addAction(action: () -> Unit) {
        actions.add(action)
    }

    fun run() {
        actions.forEach { it() }
    }
}
