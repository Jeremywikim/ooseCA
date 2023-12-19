package com.mycompany.ooseca.order;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int orderIDCounter = 0;
    private int orderID;
    private  List<OrderItem> orders;
    private double totalSale = 0;

    // constructor
    public Order() {
        //
        this.orders = new ArrayList<OrderItem>();

    }

    // add order to orders(ArrayList)
    public void addOrderToOrders(Menu menu,int itemID, int quantity){
        OrderItem or = new OrderItem(menu, generateOrderID() );
        // add item
        or.addItemsToOrderList(itemID);
        or.setQuantity(quantity);

        // needed calculation
        or.addPricesOfItemTo();
        or.calTotalPrice();

        // pass or to OrderItem constructor
        orders.add(or);
    }




    // calculate all sales
    public void calTotalSale(){
        for (OrderItem order : orders){
            totalSale += order.getTotalPrice();
        }
    }


    // generate order ID
    private int generateOrderID() {
        //
        return ++orderIDCounter;
    }

    // getter
    public double getTotalSale() {
        return totalSale;
    }


}
