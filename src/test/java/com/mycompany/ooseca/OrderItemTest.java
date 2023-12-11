package com.mycompany.ooseca;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OrderItemTest {
    OrderItem orderItem = new OrderItem(0, "itemName", 0, 0d);

    @Test
    void testComputeTotal() {
        double result = orderItem.ComputeTotal();
        Assertions.assertEquals(0d, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: https://weirddev.com/forum#!/testme