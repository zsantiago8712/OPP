package com.szs.practica1;

public class MainFile {

    public static void main(String[] args){

        DepositAccount account = new DepositAccount(23.4, 45.6, 56.7);

        DeptAccount debt1 = new DeptAccount(32.5, 55.9, 88.8);

        System.out.println("El valor del balance es: " + account.getTheBalance());

        System.out.println("La deuda es de: " + debt1.getDebt());

        debt1.getPaymentLimitDay();
    }

}
