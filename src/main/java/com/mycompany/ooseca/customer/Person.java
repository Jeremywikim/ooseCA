/*
title: OOSE CA
author: Mingyan Jia & Wenche Liu
date: 2023/12/01
 */
package com.mycompany.ooseca.customer;

public class Person {
    // declaration
    // address
    protected String EirCode;
    protected String PostalAddress;

    // contact
    protected String number;
    protected String firstName, familyName;

    // constructor
    public Person(){}

    public Person(String eirCode, String postalAddress, String number, String firstName, String familyName) {
        EirCode = eirCode;
        PostalAddress = postalAddress;
        this.number = number;
        this.firstName = firstName;
        this.familyName = familyName;
    }

}
