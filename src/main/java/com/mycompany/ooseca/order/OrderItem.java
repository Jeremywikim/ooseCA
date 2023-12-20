package com.mycompany.ooseca.order;


public class OrderItem {
    private int quantity;
    private double subTotal;
    private MenuItem menuItem;

    // constructor
    public OrderItem(){}

    public OrderItem(MenuItem menuItem,int qt) {
        this.menuItem = menuItem;
        this.quantity = qt;
        calSubTotal();
    }


    // cal sub total price
    public void calSubTotal(){
        this.subTotal = this.quantity * this.menuItem.getPrice();
    }

    // get sub total
    public double getSubTotal() {
        return this.subTotal;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    // get quantity
    public int getQuantity() {
        return quantity;
    }
}
