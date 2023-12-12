package com.mycompany.ooseca;

public class Menu {
    private static int menuItemIDCounter = 0;
    private List<MenuItem> menuItems;

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
