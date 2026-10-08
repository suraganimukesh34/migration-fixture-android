package com.example.fixture.util

class Logger(private val scope: String) {
    fun info(message: String) {
        println("$TAG/$scope: $message")
    }

    companion object {
        private const val TAG = "Fixture"

        fun forScope(scope: String): Logger = Logger(scope)
    }
}
