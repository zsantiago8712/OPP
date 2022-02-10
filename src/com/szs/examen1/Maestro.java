package com.szs.examen1;

public class Maestro extends Usuarios{

    private int numMateriasInpartidas;
    private int numHorasClase;
    private double sueldo;
    private String materia;



    Maestro(String nombre, String apellidos, int edad, int numMateriasInpartidas, int numHorasClase,
            double sueldo, String materia){
        super(nombre, apellidos, edad);

        this.numMateriasInpartidas = numMateriasInpartidas;
        this.numHorasClase = numHorasClase;
        this.sueldo = sueldo;
        this.materia = materia;
    }

    public boolean prestamo(String nombreLibro){
        if(this.getNumLibrosPrestados() > 5)
            return false;

        this.setLibrosPrestados(nombreLibro);
        return true;
    }

    public double getSueldo() {
        return sueldo;
    }



    public String getNombre(){ return this.getNombreCompleto(); }

    public int getNumMateriasInpartidas() {
        return numMateriasInpartidas;
    }

    public int getNumHorasClase() {
        return numHorasClase;
    }

    public String getMateria() {
        return materia;
    }
}
