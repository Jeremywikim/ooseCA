/*
title: OOSE CA
author: Mingyan Jia & Wenche Liu
date: 2023/12/01
 */
package com.mycompany.ooseca.order;

import com.mycompany.ooseca.customer.Customer;
import com.mycompany.ooseca.customer.Employee;
import com.mycompany.ooseca.pay.Payment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
Here I encountered some very tricky environment problems,so I put two test function into two
class file
 */

// this class is used to test getTotalSale function
class OrderTest2{
    Menu menu=new Menu();
    Order order = new Order(new Employee(), new Customer(), new Payment());

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
