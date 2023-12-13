package com.mycompany.ooseca;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

class OrderItemTest {
    @Mock
    ArrayList<Integer> quantity;
    @Mock
    ArrayList<Double> pricesList;
    @Mock
    ArrayList<MenuItem> orderList;
    @Mock
    Menu menu;
    @InjectMocks
    OrderItem orderItem;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAddItemsToOrderList() {
        when(menu.getItemFromMenu(anyInt())).thenReturn(new MenuItem(0, "itemName", 0d));

        orderItem.addItemsToOrderList(0);
    }

    @Test
    void testAddPricesOfItemTo() {
        orderItem.addPricesOfItemTo();
    }

    @Test
    void testCalTotalPrice() {
        // Add items to the menu
        Menu menu1 = new Menu();
        menu1.addItem("Fillet", 10.0);

        // new an OrderItem
        OrderItem order1 = new OrderItem(menu1, 1);

        // add item
        order1.addItemsToOrderList(0);
        order1.setQuantity(5);

        order1.addPricesOfItemTo();
        order1.calTotalPrice();
        Assertions.assertEquals(50.0, order1.getTotalPrice());
    }

    @Test
    void testSetQuantity() {
        orderItem.setQuantity(0);
    }

    @Test
    void testPrintOrder() {
        orderItem.printOrder();
    }




}

//Generated with love by TestMe :) Please report issues and submit feature requests at: https://weirddev.com/forum#!/testme