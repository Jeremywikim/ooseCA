package com.mycompany.ooseca;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.mockito.Mockito.*;

class OrderTest {
    @Mock
    List<OrderItem> orders;
    @InjectMocks
    Order order;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAddOrderToOrders() {
        // Add items to the menu
        Menu menu1 = new Menu();
        menu1.addItem("Fillet", 10.0);
        order.addOrderToOrders(menu1, 0, 0);
    }

    @Test
    void testCalTotalSale() {
        Order order1 = new Order();
        // Add items to the menu
        Menu menu1 = new Menu();
        menu1.addItem("Fillet", 10.0);
        menu1.addItem("hot wing", 5.0);
        order1.addOrderToOrders(menu1, 0, 1);
        order1.addOrderToOrders(menu1, 1, 2);

        // needed calculation
        order1.calTotalSale();

        Assertions.assertEquals(20.0, order1.getTotalSale());
    }



    void testGetTotalSale(){
        // pass
        // it has been demonstrated in previous test
    }


}

//Generated with love by TestMe :) Please report issues and submit feature requests at: https://weirddev.com/forum#!/testme