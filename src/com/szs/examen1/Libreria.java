package com.szs.examen1;

import java.util.Arrays;

public class Libreria {
    private String nombre;
    private Alumno alumno;



    private Maestro maestro;
    private int numLibrosDisponibles;

    Libreria(int numLibrosDisponibles, String nombre){
        this.numLibrosDisponibles = numLibrosDisponibles;
        this.nombre = nombre;
    }

    public void setAlumno(String nombre, String apellidos,  int edad, String carrera,
                          int semestre, double promedio, int numMateriasInscritas){
        alumno = new Alumno(nombre, apellidos, edad, carrera, semestre, promedio, numMateriasInscritas);
    }

    public void setMaestro(String nombre, String apellidos,  int edad, int numMateriasInpartidas,
                           int numHorasClase, double sueldo) {
        maestro = new Maestro(nombre, apellidos, edad, numMateriasInpartidas, numHorasClase, sueldo);
    }


    public void mostrarUsaurios(){
        System.out.println("Usuario Alumno: \n" +"Nombre: " + this.alumno.getNombreCompleto() + "\n" +
                            "Num Materias Inscritas: " +  this.alumno.getNumMateriasInscritas() + "\n" +
                            "Promedio: " + this.alumno.getPromedio() + "\n" +
                            "Carrera: " + this.alumno.getCarrera() + "\n");

        System.out.println("Usuario Maestro: \n" + "Nombre: " + this.maestro.getNombreCompleto() + "\n" +
                            "Num Horas Impartidas:" + this.maestro.getNumMateriasInpartidas() + "\n" +
                            "Sueldo: " + this.maestro.getSueldo() + "\n" +
                            "Num Horas Clase: " + this.maestro.getNumHorasClase() + "\n" +
                            "Materias: " + Arrays.toString(this.maestro.getMaterias()) + "\n");
    }

    public Maestro getMaestro() {
        return maestro;
    }

    public int getNumLibrosDisponibles() {
        return numLibrosDisponibles;
    }

}
