package com.example.fixture.model;

public class Order {
    private final String id;
    private final String userId;
    private final double total;

    public Order(String id, String userId, double total) {
        this.id = id;
        this.userId = userId;
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public double getTotal() {
        return total;
    }
}
