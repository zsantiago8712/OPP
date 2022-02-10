package com.szs.examen1;

/**
 * Registra Usuarios
 * @author Santiago Zamora Solis
 */

public class Usuarios {
    private String nombre;
    private String apellidos;
    private int edad;


    private int numLibrosPrestados = 0;



    private String[] librosPrestados = new String[5];

    Usuarios(String nombre, String apellidos, int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }


    public boolean prestamo(String nombreLibro){ return false; }

    public String getNombreCompleto(){ return this.nombre + " " + this.apellidos; }

    public int getNumLibrosPrestados() { return this.numLibrosPrestados; }

    public void setLibrosPrestados(String libroPrestado) {
        this.librosPrestados[this.numLibrosPrestados] = libroPrestado;
        this.numLibrosPrestados += 1;
    }

    public  void mostrarLibrosPrestados(){
        for (int i = 0; i < this.numLibrosPrestados; i++)
            System.out.println(this.librosPrestados[i] + " ,");
    }
}
