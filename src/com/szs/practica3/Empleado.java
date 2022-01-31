package com.szs.practica3;

/**
 * Registro de empleados y caluló de nómina
 * @author Santiago Zamora
 */
public class Empleado {



    private String nombre;
    private String apellidos;
    private String id;
    private double horasTrabajadas;
    private double horaSueldo;

    public Empleado(String id, String nombre, String apellidos){
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getId() {
        return id;
    }

    public double getHorasTrabajadas() { return horasTrabajadas; }

    public double getHoraSueldo() { return horaSueldo; }

    /**
     * Setea la hora sueldo, si la horaSueldo del parametro es mayor que 500 se seat al objeto -1
     * @param horasTrabajadas(double) -> tiene que ser menor igual que 500
     */
    public void setHorasTrabajadas(double horasTrabajadas) {

        if(horasTrabajadas <= 500)
            this.horasTrabajadas = horasTrabajadas;
        else
            this.horasTrabajadas = - 1;
    }

    /**
     * Setea la hora sueldo, si la horaSueldo del parametro es mayor que 1500 se seat al objeto -1
     * @param horaSueldo(double) --> tiene que ser menor igual que 1500
     */
    public void setHoraSueldo(double horaSueldo) {

        if(horaSueldo <= 1500)
            this.horaSueldo = horaSueldo;
        else
            this.horasTrabajadas = -1;
    }


    /**
     * Calcula el salario del empleado
     * @return (double) -> horasTrabajadas * horasSueldo
     */
    public double calcularSalario(){ return this.horasTrabajadas * this.horaSueldo; }
}
