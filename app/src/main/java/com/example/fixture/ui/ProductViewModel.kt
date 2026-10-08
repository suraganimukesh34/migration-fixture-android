package com.example.fixture.ui

import com.example.fixture.data.ProductRepository

class ProductViewModel(private val repository: ProductRepository) {
    var label: String? = null
        private set

    fun loadProduct(id: String) {
        val product = repository.get(id)
        label = if (product == null) "Unknown" else "${product.name} (${product.price})"
    }
}
