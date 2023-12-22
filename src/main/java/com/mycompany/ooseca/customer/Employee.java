/*
title: OOSE CA
author: Mingyan Jia & Wenche Liu
date: 2023/12/01
 */
package com.mycompany.ooseca.customer;

public class Employee extends Person{
    // declaration
    protected int empID;
    protected String position;

    // constructor
    public Employee(){}

    public Employee(String eirCode, String postalAddress, String number, String firstName, String familyName, int empID, String position) {
        super(eirCode, postalAddress, number, firstName, familyName);
        this.empID = empID;
        this.position = position;
    }

    // getter
    public int getEmpID() {
        return empID;
    }

    public String getPosition() {
        return position;
    }
}
