/*
title: OOSE CA
author: Mingyan Jia & Wenche Liu
date: 2023/12/01
 */
package com.mycompany.ooseca.order;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
Here I encountered some very tricky environment problems,so I put two test function into two
class file
 */

// this class is used to test GetItemFromMenu function in Menu class
class MenuTest {
    private Menu menu;

    @BeforeEach
    void setUp() {
        // Create a new Menu before each test
        menu = new Menu();
    }

    @AfterEach
    void tearDown() {
        // Clean up or reset any shared resources after each test
    }

    @Test
    void testGetItemFromMenu1(){
//        Menu menu=new Menu();
        menu.addItem("fillet", 5.0, 15);
        menu.addItem("hot wing", 3.0, 25);
        menu.addItem("ginger", 5.0, 20);
        menu.addItem("original chicken", 10, 10);
        menu.addItem("vegan combo", 12, 10);

        // when ID in menu and quantity < inventory
        MenuItem result = menu.getItemFromMenu(1, 5);
        Assertions.assertEquals("fillet", result.getItemName());

        // when ID is not in menu
        MenuItem result2 = menu.getItemFromMenu(0, 5);
        Assertions.assertNull(result2);


        // when quantity > inventory
        MenuItem result3 = menu.getItemFromMenu(1, 100);
        Assertions.assertNull(result3);

    }
}





//Generated with love by TestMe :) Please report issues and submit feature requests at: https://weirddev.com/forum#!/testme