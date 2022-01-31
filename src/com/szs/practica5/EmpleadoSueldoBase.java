package com.szs.practica5;

import com.szs.practica3.Empleado;

public class EmpleadoSueldoBase extends Empleado {

    public EmpleadoSueldoBase(String id, String nombre, String apellidos){
        super(id, nombre, apellidos);
    }

    private double sueldo;

    public void setSueldo(double sueldo) { this.sueldo = sueldo; }

    public double calcularSalario(){ return this.sueldo; }
}
