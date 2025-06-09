package com.example.homeautomation.core

class PermissionManager {
    private val permissions = mutableMapOf<String, MutableSet<String>>()

    fun grant(user: String, device: String) {
        permissions.computeIfAbsent(user) { mutableSetOf() }.add(device)
    }

    fun canAccess(user: String, device: String): Boolean {
        return permissions[user]?.contains(device) == true
    }
}
