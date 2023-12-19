package com.mycompany.ooseca.order;

import java.util.Objects;
import java.util.Scanner;

public class OrderProcessor {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        // Logic to process the order
        // This method may involve communication with kitchen, payment processing, etc.
        // For simplicity, let's assume it always succeeds for now

        // declaration
        Scanner sn = new Scanner(System.in);
        Order order = new Order();
        Menu menu = new Menu();
        String YoN;
        String NoY;


        // Add items to the menu
        do {
            System.out.println("Y for continue enter, N for go on: ");
            YoN = sn.next();
            System.out.println("please enter the name of item:  ");
            String name = sn.next();
            System.out.println("please enter the price (double):  ");
            double price = sn.nextDouble();
            menu.addItem(name, price);
        }
        while (Objects.equals(YoN, "Y"));


        // add item to orders
        do {
            System.out.println("Y for continue place order, N for go on: ");
            NoY = sn.next();


        }
        while (Objects.equals(NoY, "Y"));




        order.addOrderToOrders(menu, 0, 1);
        order.addOrderToOrders(menu, 1, 2);












    }
}
