package com.mycompany.ooseca.order;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OrderItemTest {
    MenuItem item = new MenuItem("fillet", 5.0, 15);
    OrderItem orderItem = new OrderItem(item,5);


    @Test
    void testCalSubTotal() {
        orderItem.calSubTotal();
        Assertions.assertEquals(25.0, orderItem.getSubTotal());
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: https://weirddev.com/forum#!/testme