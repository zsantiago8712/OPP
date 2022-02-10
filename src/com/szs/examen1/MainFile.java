package com.szs.examen1;

public class MainFile {

    public static void main(String[] args){

        Libreria lib = new Libreria(100, "POO");

        lib.setNewMaestro("Mauricio", "Gonzales", 30, 1, 10, 1200, "OPP");
        lib.setNewAlumno("Daniela", "Garcia", 21, "Derecho", 7, 9.5, 6);

    lib

        System.out.println("Nombre de la libreria: " + lib.getNombre());
        lib.mostrarUsaurios();
    }
}
