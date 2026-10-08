package com.example.fixture.ui

import com.example.fixture.data.OrderRepository

class OrderViewModel(private val repository: OrderRepository) {
    var summary: String? = null
        private set

    fun loadOrder(id: String) {
        val order = repository.findById(id)
        summary = order?.let { "Total: ${it.total}" } ?: "No order"
    }
}
