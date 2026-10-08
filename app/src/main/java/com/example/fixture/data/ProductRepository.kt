package com.example.fixture.data

import com.example.fixture.model.Product

class ProductRepository {
    private val products = mutableMapOf<String, Product>()

    fun put(product: Product) {
        products[product.id] = product
    }

    fun get(id: String): Product? = products[id]

    fun inStock(): List<Product> = products.values.filter { it.inStock }

    fun countExpensive(min: Double): Int = products.values.count { it.price > min }
}
