package com.szs.examen1;

public class Maestro extends Usuarios{

    private int numMateriasInpartidas;
    private int numHorasClase;
    private double sueldo;
    private String materias[];


    Maestro(String nombre, String apellidos, int edad, int numMateriasInpartidas, int numHorasClase, double sueldo){
        super(nombre, apellidos, edad);

        this.numMateriasInpartidas = numMateriasInpartidas;
        this.numHorasClase = numHorasClase;
        this.sueldo = sueldo;
        this.materias = new String[numMateriasInpartidas];
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

    public void setMaterias(String ... materias) {

        for(int i = 0; i < this.numMateriasInpartidas; i++)
            this.materias[i] = materias[i];
    }

    public String getNombreCompleto(){ return this.getNombreCompleto(); }

    public int getNumMateriasInpartidas() {
        return numMateriasInpartidas;
    }

    public int getNumHorasClase() {
        return numHorasClase;
    }

    public String[] getMaterias() {
        return materias;
    }
}
