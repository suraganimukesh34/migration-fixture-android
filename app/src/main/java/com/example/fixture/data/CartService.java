package com.example.fixture.data;

import com.example.fixture.model.Product;

import java.util.ArrayList;
import java.util.List;

public class CartService {
    private final List<Product> items = new ArrayList<>();

    public void add(Product product) {
        if (product != null && product.isInStock()) {
            items.add(product);
        }
    }

    public double total() {
        double sum = 0;
        for (Product item : items) {
            sum += item.getPrice();
        }
        return sum;
    }
}
