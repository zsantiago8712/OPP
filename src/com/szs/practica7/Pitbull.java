package com.szs.practica7;

public class Pitbull extends Dog{

    private boolean estaEntrenado = false;
    private String color;

    Pitbull(int edad, double peso, boolean estaEntrenado, String color){
        super(edad, peso, true);
        this.estaEntrenado = estaEntrenado;
        this.color = color;
    }

    public void printActividad() { System.out.println("Caza de animales"); }

    public boolean getEstaEntrenado(){ return this.estaEntrenado; }
    public String getColor(){ return this.color; }
}
