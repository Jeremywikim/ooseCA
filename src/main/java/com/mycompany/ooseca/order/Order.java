package com.mycompany.ooseca.order;

import com.mycompany.ooseca.customer.Customer;
import com.mycompany.ooseca.customer.Employee;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Employee ep;
    private Customer cus;

    private static int lastOrderID = 0;
    private int orderID;
    private  List<OrderItem> orderList;
    private double totalSale = 0;


    // constructor
    public Order(Employee ep, Customer cus){
        lastOrderID++; // auto increase OrderID
        this.orderID = lastOrderID; // pass new orderID to new instance of OrderItem
        this.orderList = new ArrayList<>();
        this.ep = ep;
        this.cus = cus;
    }


    // add items to orderList
    public void addItemsToOrderList(OrderItem orderItem){
        // add orderItem instance to orderList
        this.orderList.add(orderItem);
        this.totalSale += orderItem.getSubTotal(); // update total sale
    }

    // get total sale
    public double getTotalSale() {
        return this.totalSale;
    }


    public List<OrderItem> getOrderList() {
        return orderList;
    }

    // receipt
    public String receipt(){

        StringBuilder string= new StringBuilder();
        string.append("orderID: ").append(this.orderID).append("\n").append("itemID  ").append("name  ").append("   price  ").append("quantity  ").append("subTotal\n");
        for (OrderItem orderItem : orderList) {
            string.append(String.format(String.valueOf(orderItem.getMenuItem().getMenuItemID()), "%-7s")).append(String.format(orderItem.getMenuItem().getItemName(), "%-10s")).append(String.format(String.valueOf(orderItem.getMenuItem().getPrice()), "%-10s")).append(String.format(String.valueOf(orderItem.getQuantity()), "%-10s")).append(String.format(String.valueOf(orderItem.getSubTotal()), "%-10s")).append("\n");
        }
        string.append(this.totalSale);

        return string.toString();

    }


}
