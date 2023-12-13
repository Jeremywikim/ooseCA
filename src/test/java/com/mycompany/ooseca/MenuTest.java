package com.mycompany.ooseca;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.mockito.Mockito.*;

class MenuTest {
    @Mock
    List<MenuItem> menuItems;
    @InjectMocks
    Menu menu;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAddItem() {
        menu.addItem("itemName", 0d);
    }

    @Test
    void testGetItemFromMenu() {
        menu.addItem("itemName", 0d);
        MenuItem result = menu.getItemFromMenu(0);
        Assertions.assertEquals("itemName", result.getItemName());
        Assertions.assertEquals(1, result.getMenuItemID());
        Assertions.assertEquals(0d, result.getPrice());
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: https://weirddev.com/forum#!/testme