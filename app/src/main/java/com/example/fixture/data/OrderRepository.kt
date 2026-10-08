package com.example.fixture.data

import com.example.fixture.model.Order

class OrderRepository {
    private val orders = mutableListOf<Order>()

    fun add(order: Order?) {
        if (order != null) {
            orders.add(order)
        }
    }

    fun findById(id: String): Order? = orders.firstOrNull { it.id == id }

    fun findByUser(userId: String): List<Order> = orders.filter { it.userId == userId }
}
