package com.szs.practica7;

public class Dog {

    private double peso;
    private int edad;
    private boolean tieneCola = true;

    Dog(int edad, double peso, boolean tieneCola){
        this.peso = peso;
        this.edad = edad;
        this.tieneCola = tieneCola;
    }

    public double getPeso(){ return this.peso; }
    public int getEdad(){ return this.edad; }
    public boolean getTieneCola(){ return this.tieneCola; }

    void printActividad(){ System.out.println("Pasear!!"); }

}

