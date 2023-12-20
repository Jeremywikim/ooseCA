package com.mycompany.ooseca.pay;

public class Payment {
    // declaration
    protected int TranID;
    protected double paymentAmount;
    protected boolean paymentStatus=false;


    // constructor

    public Payment(){}

    public Payment(int tranID, double paymentAmount, boolean paymentStatus) {
        TranID = tranID;
        this.paymentAmount = paymentAmount;
        this.paymentStatus = paymentStatus;
    }

    // select payment type
    public String  selectPaymentType(String type){
        return type;
    }


    // getter setter
    public int getTranID() {
        return TranID;
    }

    public void setTranID(int tranID) {
        TranID = tranID;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus() {
        this.paymentStatus = true;
    }
}
