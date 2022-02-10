package com.szs.examen1;

public class Alumno extends Usuarios{

    private String carrera;
    private int semestre;



    private double promedio;
    private int numMateriasInscritas;


    Alumno(String nombre, String apellidos, int edad, String carrera,
           int semestre, double promedio, int numMateriasInscritas){

        super(nombre, apellidos, edad);
        this.numMateriasInscritas = numMateriasInscritas;
        this.promedio = promedio;
        this.semestre = semestre;
        this.carrera = carrera;
    }

    public String getCarrera() { return carrera; }

    public double getPromedio() { return promedio; }

    public boolean prestamo(String nombreLibro){

        if(this.getNumLibrosPrestados() > 3){
            return false;
        }
        this.setLibrosPrestados(nombreLibro);
        return true;
    }

     public String getNombreCompleto(){ return this.getNombreCompleto(); }

    public int getSemestre() {
        return semestre;
    }

    public int getNumMateriasInscritas() {
        return numMateriasInscritas;
    }
}
