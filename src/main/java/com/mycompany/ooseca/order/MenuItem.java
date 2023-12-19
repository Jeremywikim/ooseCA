package com.mycompany.ooseca.order;

public class MenuItem {
    private int menuItemID;
    private String itemName;
    private double price;

    public MenuItem(){}

    public MenuItem(int menuItemID, String itemName, double price) {
        this.menuItemID = menuItemID;
        this.itemName = itemName;
        this.price = price;
    }

    // Getters and setters...

    public int getMenuItemID() {
        return menuItemID;
    }

    public void setMenuItemID(int menuItemID) {
        this.menuItemID = menuItemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }




}
