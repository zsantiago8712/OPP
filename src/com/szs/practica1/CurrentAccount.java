package com.szs.practica1;

public class CurrentAccount extends Account{

    CurrentAccount(double theNumber, double theBalance, double theOverdraftLimit){

        super(theNumber, theBalance);
        this.theOverdraftLimit = theOverdraftLimit;
    }

    private double theOverdraftLimit;

    public double getOverdraftLimit(){ return this.theOverdraftLimit; }
}
