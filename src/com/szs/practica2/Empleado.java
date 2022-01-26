package com.szs.practica2;

/**
 * Registro de empleados y caluló de nómina
 * @author Santiago Zamora
 */
public class Empleado {

    String id;
    String name;
    String apellido;
    double horasTrabajadas;
    double horaSueldo;

    public Empleado(String id, String name, String apellido, double horasTrabajadas, double horaSueldo){
        this.id = id;
        this.name = name;
        this.apellido = apellido;
        this.horasTrabajadas = horasTrabajadas;
        this.horaSueldo = horaSueldo;
    }



    /**
     * Calcula el salario del empleado
     * @return (double) -> horasTrabajadas * horasSueldo
     */
    public double calcularSalario(){ return this.horasTrabajadas * this.horaSueldo; }
}


