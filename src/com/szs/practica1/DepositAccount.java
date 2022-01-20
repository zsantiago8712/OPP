package com.szs.practica1;

// La palabra extends hereda la clase de la Account
public class DepositAccount extends Account{

    private double theInterestRate;

    DepositAccount(double theNumber, double theBalance, double theInterestRate){

        // La palabra super llama al constructor de la clase padre
        super(theNumber, theBalance);
        this.theInterestRate = theInterestRate;
    }
}
