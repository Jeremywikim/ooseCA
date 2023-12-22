/*
title: OOSE CA
author: Mingyan Jia & Wenche Liu
date: 2023/12/01
 */
package com.mycompany.ooseca.customer;

public class Customer extends Person{
    // declaration
    int cusID;

    // constructor
    public Customer(){}
    public Customer(String eirCode, String postalAddress, String number, String firstName, String familyName,int cusID) {
        super(eirCode, postalAddress, number, firstName, familyName);
        this.cusID = cusID;
    }

    // get cusID
    public int getCusID() {
        return cusID;
    }
}
