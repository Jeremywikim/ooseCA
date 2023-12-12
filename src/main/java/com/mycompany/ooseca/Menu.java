package com.mycompany.ooseca;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private static int menuItemIDCounter;

    static {
        menuItemIDCounter = 0;
    }

    private final List<MenuItem> menuItems;

    public Menu() {
        this.menuItems = new ArrayList<>();
    }

    // Getters and setters...

    public void addItem(String itemName, double price) {
        int menuItemID = generateMenuItemID();
        menuItems.add(new MenuItem(menuItemID, itemName, price));
    }

    private int generateMenuItemID() {
        return ++menuItemIDCounter;
    }
}
