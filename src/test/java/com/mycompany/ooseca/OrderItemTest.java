package com.mycompany.ooseca;

import com.mycompany.ooseca.order.Menu;
import com.mycompany.ooseca.order.MenuItem;
import com.mycompany.ooseca.order.OrderItem;
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
        // Add items to the menu
        Menu menu2 = new Menu();
        menu2.addItem("Fillet", 10.0);

        // new an OrderItem
        OrderItem order2 = new OrderItem(menu2, 1);

        // add item
        order2.addItemsToOrderList(0);
        order2.setQuantity(5);
        order2.addItemsToOrderList(0);
        order2.setQuantity(5);

        order2.addPricesOfItemTo();
        order2.calTotalPrice();
        // print
        System.out.println("size of orderItem"+ order2.orderList.size());
        System.out.println(orderItem.receipt());
    }




}

//Generated with love by TestMe :) Please report issues and submit feature requests at: https://weirddev.com/forum#!/testme