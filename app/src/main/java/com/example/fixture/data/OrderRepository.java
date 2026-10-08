package com.example.fixture.data;

import com.example.fixture.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {
    private final List<Order> orders = new ArrayList<>();

    public void add(Order order) {
        if (order != null) {
            orders.add(order);
        }
    }

    public Order findById(String id) {
        for (Order order : orders) {
            if (order.getId().equals(id)) {
                return order;
            }
        }
        return null;
    }

    public List<Order> findByUser(String userId) {
        List<Order> result = new ArrayList<>();
        for (Order order : orders) {
            if (order.getUserId().equals(userId)) {
                result.add(order);
            }
        }
        return result;
    }
}
