package com.example.fixture.data

import com.example.fixture.model.Product

/** Holds the products a user intends to buy and reports their total price. */
class CartService {
    private val items = mutableListOf<Product>()

    fun add(product: Product?) {
        if (product != null && product.inStock) {
            items.add(product)
        }
    }

    fun total(): Double = items.sumOf { it.price }
}
