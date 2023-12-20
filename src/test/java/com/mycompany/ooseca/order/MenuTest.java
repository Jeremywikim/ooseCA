package com.mycompany.ooseca.order;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MenuTest {


    @Test
    void testAddItem() {
        Menu menu=new Menu();
        menu.addItem("fillet", 5.0, 15);
        menu.addItem("hot wing", 3.0, 25);
        menu.addItem("ginger", 5.0, 20);
        menu.addItem("original chicken", 10, 10);
        menu.addItem("vegan combo", 12, 10);
        Assertions.assertEquals("fillet", menu.getItemFromMenu(1).getItemName());
        Assertions.assertEquals("vegan combo", menu.getItemFromMenu(5).getItemName());

    }


    @Test
    void testGetItemFromMenu1(){
        Menu menu1=new Menu();
        menu1.addItem("fillet", 5.0, 15);
        menu1.addItem("hot wing", 3.0, 25);
        menu1.addItem("ginger", 5.0, 20);
        menu1.addItem("original chicken", 10, 10);
        menu1.addItem("vegan combo", 12, 10);

        // when ID in menu and quantity < inventory
        MenuItem result1 = menu1.getItemFromMenu(1, 5);
        Assertions.assertEquals("fillet", result1.getItemName());

        // when ID is not in menu
        MenuItem result2 = menu1.getItemFromMenu(0, 5);
        Assertions.assertNull(result2);


        // when quantity > inventory
        MenuItem result3 = menu1.getItemFromMenu(1, 100);
        Assertions.assertNull(result3);

    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: https://weirddev.com/forum#!/testme