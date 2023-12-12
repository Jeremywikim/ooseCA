package com.mycompany.ooseca;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Order {
    private static int orderIDCounter = 0;
    private final int orderID;
    private final List<OrderItem> orderItems;

    public Order() {
        this.orderID = generateOrderID();
        this.orderItems = new ArrayList<>();
    }

    // Getters and setters...

    public void addItem(OrderItem item) {
        orderItems.add(item);
    }

    public double calculateTotalAmount() {
        return orderItems.stream().mapToDouble(item -> item.getPrice() * item.getQuantity()).sum();
    }

    private int generateOrderID() {
        return ++orderIDCounter;
    }


    public Collection<Object> getOrderItems() {

    }
}
