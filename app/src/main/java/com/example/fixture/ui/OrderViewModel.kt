package com.example.fixture.ui;

import com.example.fixture.data.OrderRepository;
import com.example.fixture.model.Order;

public class OrderViewModel {
    private final OrderRepository repository;
    private String summary;

    public OrderViewModel(OrderRepository repository) {
        this.repository = repository;
    }

    public String getSummary() {
        return summary;
    }

    public void loadOrder(String id) {
        Order order = repository.findById(id);
        summary = order != null ? "Total: " + order.getTotal() : "No order";
    }
}
