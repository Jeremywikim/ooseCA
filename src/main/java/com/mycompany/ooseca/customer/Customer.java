package com.mycompany.ooseca.customer;

public class Customer extends Person{
    //declaration
    // orderItem
    protected int orderItem;
    // cusID
    protected int cusID;

    // constructor
    public Customer(){}
    public Customer(int orderItem, int cusID) {
        this.orderItem = orderItem;
        this.cusID = cusID;
    }

    public Customer(String eirCode, String postalAddress, String number, int orderItem, int cusID) {
        super(eirCode, postalAddress, number);
        this.orderItem = orderItem;
        this.cusID = cusID;
    }

}
