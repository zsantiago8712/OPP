package com.szs.practica5;


import com.szs.practica3.Empleado;

/**
 * Clase hija de Empleado donde el sueldo se calcula con el porcentaje d elas ventas
 * @author Santiago Zamora
 */
public class EmpleadoComision extends Empleado{

    private double sueldo;
    private int ventas;

    public EmpleadoComision(String id, String nombre, String apellidos){
        super(id, nombre, apellidos);
    }

    public void setSueldo(double sueldo){ this.sueldo = sueldo; }

    public void setVentas(int ventas){ this.ventas = ventas;}

    public double calcularSalario(){ return this.sueldo + this.ventas * .05;}

}
