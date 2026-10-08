package com.example.fixture.data;

import com.example.fixture.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository {
    private final Map<String, Product> products = new HashMap<>();

    public void put(Product product) {
        products.put(product.getId(), product);
    }

    public Product get(String id) {
        return products.get(id);
    }

    public List<Product> inStock() {
        List<Product> result = new ArrayList<>();
        for (Product product : products.values()) {
            if (product.isInStock()) {
                result.add(product);
            }
        }
        return result;
    }

    public int countExpensive(double min) {
        int count = 0;
        for (Product product : products.values()) {
            if (product.getPrice() > min) {
                count++;
            }
        }
        return count;
    }
}
