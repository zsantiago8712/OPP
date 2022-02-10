package com.szs.examen1;

/**
 * @author Santiago Zamora Solis
 */

public class Usuarios {
    private String nombre;
    private String apellidos;
    private int edad;
    private int numLibrosPrestados = 0;
    private String[] librosPrestados;

    Usuarios(String nombre, String apellidos, int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }


    boolean prestamo(String nombreLibro){ return false; }
}
