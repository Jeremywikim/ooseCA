package com.mycompany.ooseca;

public class OrderItem {
    // declaration
    private int menuItemID;
    private String itemName;
    private int quantity;
    private double price;
    private double total;


    // constructor
    public OrderItem(int menuItemID, String itemName, int quantity, double price) {
        this.menuItemID = menuItemID;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }


    // process
    public double ComputeTotal(){
        //
        this.total = price * quantity;
        return total;
    }








    // setter and getter

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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
