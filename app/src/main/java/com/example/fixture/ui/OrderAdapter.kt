package com.example.fixture.ui

import com.example.fixture.model.Order

class OrderAdapter(private val orders: List<Order>) {
    fun titles(): List<String> = orders.map { "${it.id}: ${it.total}" }

    fun totalValue(): Double = orders.sumOf { it.total }
}
