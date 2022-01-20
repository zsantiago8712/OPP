package com.szs.practica1;

public class DeptAccount extends Account{

    private double debt;

    DeptAccount(double theNumber, double theBalance, double debt){
        super(theNumber, theBalance);
        this.debt = debt;
    }

    public double getDebt(){ return this.debt; }
    public void getPaymentLimitDay(){ System.out.println("La deaduad ebe de ser pagada antes del 20 de enero del 2022"); }
}