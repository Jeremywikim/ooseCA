package com.mycompany.ooseca.customer;

public class Person {
    // declaration
    // address
    protected String EirCode;
    protected String PostalAddress;

    // contact
    protected String number;

    // constructor
    public Person(){}

    public Person(String eirCode, String postalAddress, String number) {
        EirCode = eirCode;
        PostalAddress = postalAddress;
        this.number = number;
    }

    // logins
    public Boolean logins(String user, String password){
        return user == "User" && password == "Password";
    }






}
