package com.szs.practica10;

public class Promedio {

    public double calcularPromedio(double valores[]) {
        double promedio = 0;
        for(double i : valores)
            promedio += i;

        return promedio /= valores.length;
    }

    public double calcularRegresionLineal(double valoresX[], double valoresY[]) {

        double promedioX = calcularPromedio(valoresX);
        double promedioY = calcularPromedio(valoresY);
        double denom = 0;
        double num = 0;

        for(int i = 0; i < valoresX.length; i++){

            num += (valoresX[i] - promedioX) * (valoresY[i] - promedioY);
            denom += Math.pow(valoresX[i] - promedioX, 2);
        }

        return num / denom;
    }

}
