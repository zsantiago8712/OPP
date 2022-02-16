package com.szs.practica10;

public class mainFile {
    public static void main(String[] args){

        double valoresX[] = {30, 28, 32, 25, 25, 25, 22, 24, 35, 40};
        double valoresY[] = {25, 30, 27, 40, 42, 40, 50, 45, 30, 25};
        Promedio calc = new Promedio();

        double betaUno = calc.calcularRegresionLineal(valoresX, valoresY);
        double betaCero = calc.calcularPromedio(valoresY) - (betaUno * calc.calcularPromedio(valoresX));
        System.out.println("Beta0: " + betaCero);
        System.out.println("El modelo de regresion lineal y = " + betaUno + " + " + betaCero);
    }
}
