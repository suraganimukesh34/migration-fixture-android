package com.example.fixture.ui;

import com.example.fixture.data.ProductRepository;
import com.example.fixture.model.Product;

public class ProductViewModel {
    private final ProductRepository repository;
    private String label;

    public ProductViewModel(ProductRepository repository) {
        this.repository = repository;
    }

    public String getLabel() {
        return label;
    }

    public void loadProduct(String id) {
        Product product = repository.get(id);
        if (product == null) {
            label = "Unknown";
        } else {
            label = product.getName() + " (" + product.getPrice() + ")";
        }
    }
}
