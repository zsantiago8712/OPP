package com.szs.practica1;

public class Account {

    private double theNumber;
    private double theBalance;

    Account(double theNumber, double theBalance) { this.theNumber = theNumber; this.theBalance = theBalance; }

    public double getTheBalance(){ return this.theBalance; }

    public void credit(){ System.out.println("Inside Credit"); }
    public void debit(){ System.out.println("Inside debit"); }
}
