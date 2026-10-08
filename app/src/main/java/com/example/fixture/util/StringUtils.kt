package com.example.fixture.util

object StringUtils {
    fun isBlank(value: String?): Boolean = value == null || value.trim().isEmpty()

    fun capitalize(value: String?): String? {
        if (value.isNullOrEmpty()) {
            return value
        }
        return value.replaceFirstChar { it.uppercase() }
    }
}
