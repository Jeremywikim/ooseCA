package com.mycompany.ooseca.order;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class OrderProcessorTest {

    OrderProcessor op = new OrderProcessor();


    @Test
    void testInitializeMenu() {
        op.initializeMenu();
    }

    @Test
    void testStartOrder() {

    }

    @Test
    void testPlaceOrder() {
        op.initializeMenu();
        // not start an order
        Assertions.assertEquals("no order created", op.placeOrder(1,10));

        // Item not included
        op.startOrder();
        Assertions.assertEquals("Item not included", op.placeOrder(0,10));

        // Inventory is not enough
        op.startOrder();
        Assertions.assertEquals("Inventory is not enough", op.placeOrder(1,100));

    }

    @Test
    void testEndOrder() {

    }


}

//Generated with love by TestMe :) Please report issues and submit feature requests at: https://weirddev.com/forum#!/testme