package com.szs.practica7;

public class Buldog extends Dog{

    private boolean tienePedigri;
    private String tipoPedigri;

    Buldog(int edad, double peso, boolean tienePedigri, String tipoPedigri){
        super(edad, peso, false);

        this.tienePedigri = tienePedigri;

        if(!tienePedigri)
            this.tipoPedigri = "No tiene Pedigri";
        else
            this.tipoPedigri = tipoPedigri;

    }

    public boolean getTienePedigri() { return this.tienePedigri; }
    public String getTipoPedigri(){ return this.tipoPedigri; }
    public void printActividad(){ System.out.println("Comer y salir a pasear"); }



}

