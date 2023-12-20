package com.mycompany.ooseca.order;

import com.mycompany.ooseca.customer.Customer;
import com.mycompany.ooseca.customer.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {


    Menu menu=new Menu();
    Order order = new Order(new Employee(), new Customer());



    @Test
    void addItemsToOrderList() {
        //
        menu.addItem("fillet", 5.0, 15);
        menu.addItem("hot wing", 3.0, 25);
        //
        MenuItem menuItem = menu.getItemFromMenu(1, 5);
        //
        OrderItem or = new OrderItem(menuItem, 5);
        order.addItemsToOrderList(or);
        // assert
        Assertions.assertEquals("fillet", order.getOrderList().get(0).getMenuItem().getItemName());
    }

    @Test
    void getTotalSale() {
        // add items to menu
        menu.addItem("fillet", 5.0, 15);
        menu.addItem("hot wing", 3.0, 25);
        // new MenuItem (instances)
        MenuItem menuItem1 = menu.getItemFromMenu(1, 5);
        MenuItem menuItem2 = menu.getItemFromMenu(2, 5);
        // new OrderItem (instance)
        OrderItem or1 = new OrderItem(menuItem1, 5);
        OrderItem or2 = new OrderItem(menuItem2, 5);
        // add items to OrderList
        order.addItemsToOrderList(or1);
        order.addItemsToOrderList(or2);
        // assert equal
        Assertions.assertEquals(40.0,order.getTotalSale());
    }

}