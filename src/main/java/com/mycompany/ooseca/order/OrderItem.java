package com.mycompany.ooseca.order;



import java.util.ArrayList;

public class OrderItem {


    private int orderID = 0;
    private ArrayList<Integer> quantity;
    private ArrayList<Double> pricesList;
    public ArrayList<MenuItem> orderList;
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

    public String receipt(){

        StringBuilder string= new StringBuilder();
        string.append("orderID: ").append(this.orderID).append("\n").append("itemID  ").append("name  ").append("   price  ").append("quantity  ").append("total price of item\n");
        for (int i=0; i< orderList.size();i++){
            string.append(String.format(String.valueOf(orderList.get(i).getMenuItemID()), "%-7s")).append(String.format(orderList.get(i).getItemName(), "%-10s")).append(String.format(String.valueOf(orderList.get(i).getPrice()), "%-10s")).append(String.format(String.valueOf(quantity.get(i)), "%-10s")).append(String.format(String.valueOf(pricesList.get(i)), "%-10s")).append("\n");
        }
        string.append(this.totalPrice);

        return string.toString();

    }


}
