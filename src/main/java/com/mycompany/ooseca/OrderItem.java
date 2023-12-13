package com.mycompany.ooseca;



import java.util.ArrayList;
import java.lang.reflect.Field;

public class OrderItem {


    private int orderID = 0;
    private ArrayList<Integer> quantity;
    private ArrayList<Double> pricesList;
    private ArrayList<MenuItem> orderList;
    private double totalPrice = 0.0;
    private Menu menu;


    // constructor
    public OrderItem(){
        this.orderList = new ArrayList<>();
    }

    public OrderItem(Menu menu, int orderID) {
        this.orderID = orderID;
        this.menu = menu;
        this.orderList = new ArrayList<>();
        this.quantity = new ArrayList<>();
        this.pricesList = new ArrayList<>();
    }


    // add items to orderList
    public void addItemsToOrderList(int num){
        orderList.add(this.menu.getItemFromMenu(num));
    }


    // add prices into pricesList
    public void addPricesOfItemTo(){
        for (int i=0; i< orderList.size(); i++) {
            pricesList.add(orderList.get(i).getPrice()* quantity.get(i));
        }
    }

    // calculate total price
    public void calTotalPrice(){
        for (Double d: pricesList){
            this.totalPrice += d;
        }
    }



    // add quantities to quantity (ArrayList)
    public void setQuantity(int num){
        quantity.add(num);
    }

    // get total price
    public double getTotalPrice() {
        return totalPrice;
    }

    public void printOrder(){

        System.out.println("orderID: " + this.orderID);
        System.out.println("itemID  " + "name  " + "   price  " + "quantity  " + "total price of item") ;
        for (int i=0; i< orderList.size();i++){
            System.out.printf("%-7s",orderList.get(i).getMenuItemID());
            System.out.printf("%-10s",orderList.get(i).getItemName());
            System.out.printf("%-10s",orderList.get(i).getPrice());
            System.out.printf("%-10s",quantity.get(i));
            System.out.printf("%-10s",pricesList.get(i));
            System.out.println();
        }

        System.out.println("total price: "+this.totalPrice);

    }


}
