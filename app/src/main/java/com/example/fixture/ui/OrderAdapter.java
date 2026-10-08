package com.example.fixture.ui;

import com.example.fixture.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderAdapter {
    private final List<Order> orders;

    public OrderAdapter(List<Order> orders) {
        this.orders = orders;
    }

    public List<String> titles() {
        List<String> titles = new ArrayList<>();
        for (Order order : orders) {
            titles.add(order.getId() + ": " + order.getTotal());
        }
        return titles;
    }

    public double totalValue() {
        double sum = 0;
        for (Order order : orders) {
            sum += order.getTotal();
        }
        return sum;
    }
}
