package com.mycompany.ooseca.order;

import com.mycompany.ooseca.customer.Customer;
import com.mycompany.ooseca.customer.Employee;

public class OrderProcessor {

    // declaration
    Order order;
    Menu menu;

    // constructor
    public OrderProcessor() {
        this.menu = new Menu();
    }


    // initialize menu and add items
    public void initializeMenu() {
        // add items to menu
        menu.addItem("fillet", 5.0, 15);
        menu.addItem("hot wing", 3.0, 25);
        menu.addItem("ginger", 5.0, 20);
        menu.addItem("original chicken", 10, 10);
        menu.addItem("vegan combo", 12, 10);
    }


    //start a new order
    public void startOrder(){
        order = new Order(new Employee(), new Customer());
    }

    public String placeOrder(int menuItemID, int quantity){

        // if ID in menu and quantity<=inventory return item
        MenuItem item = menu.getItemFromMenu(menuItemID, quantity);
        if (order != null){
            if (item != null) {
                order.addItemsToOrderList(new OrderItem(item, quantity));
                return item.getItemName();
            }
            else {
                if (menu.getItemFromMenu(menuItemID) == null){
                    return "Item not included";
                }
                else{
                    return "Inventory is not enough";
                }
            }
        }return "no order created";

    }


    // end of order
    public void endOrder(){
        order = null;
    }



}
