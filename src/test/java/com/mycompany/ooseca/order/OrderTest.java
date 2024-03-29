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

// this class is used to test addItemsToOrderList function
class OrderTest {


    Menu menu=new Menu();
    Order order = new Order(new Employee(), new Customer(), new Payment());



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


}

