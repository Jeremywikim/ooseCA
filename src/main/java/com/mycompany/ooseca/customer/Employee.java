package com.mycompany.ooseca.customer;

public class Employee extends Person{
    // declaration
    protected int empID;
    protected String position;

    // constructor
    public Employee(){}

    public Employee(int empID, String position) {
        this.empID = empID;
        this.position = position;
    }

    public Employee(String eirCode, String postalAddress, String number, int empID, String position) {
        super(eirCode, postalAddress, number);
        this.empID = empID;
        this.position = position;
    }


    //
}
