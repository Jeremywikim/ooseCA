package com.mycompany.ooseca.order;

public class MenuItem {
    private static int lastMenuItemID = 0;
    private int menuItemID, inventory;
    private String itemName;
    private double price;


    // constructor
    public MenuItem(){}
    public MenuItem(String itemName, double price, int inventory) {

        lastMenuItemID++; // auto increase
        this.menuItemID = lastMenuItemID; // pass the lastMenuItemID++ to menuItemID
        this.itemName = itemName;
        this.price = price;
        this.inventory = inventory;
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

    public int getInventory() {return inventory;}

    public void setInventory(int inventory) {this.inventory = inventory;}

}
