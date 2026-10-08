package com.example.fixture.model;

public class Product {
    private final String id;
    private final String name;
    private final double price;
    private final boolean inStock;

    public Product(String id, String name, double price, boolean inStock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isInStock() {
        return inStock;
    }
}
