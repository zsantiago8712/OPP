package com.szs.examen1;

public class Libreria {


    private String nombre;
    private Alumno alumno;
    private Maestro maestro;
    private int numLibrosDisponibles;

    Libreria(int numLibrosDisponibles, String nombre){
        this.numLibrosDisponibles = numLibrosDisponibles;
        this.nombre = nombre;
    }

    public void setNewAlumno(String nombre, String apellidos,  int edad, String carrera,
                          int semestre, double promedio, int numMateriasInscritas){
        alumno = new Alumno(nombre, apellidos, edad, carrera, semestre, promedio, numMateriasInscritas);
    }

    public void setNewMaestro(String nombre, String apellidos,  int edad, int numMateriasInpartidas,
                           int numHorasClase, double sueldo, String materia) {
        maestro = new Maestro(nombre, apellidos, edad, numMateriasInpartidas, numHorasClase, sueldo, materia);
    }


    public void mostrarUsaurios(){
        System.out.println("\nUsuario Alumno: \n" +"Nombre: " + this.alumno.getNombreCompleto() + "\n" +
                            "Num Materias Inscritas: " +  this.alumno.getNumMateriasInscritas() + "\n" +
                            "Promedio: " + this.alumno.getPromedio() + "\n" +
                            "Carrera: " + this.alumno.getCarrera() + "\n" +
                            "Libors Prestados: " );
        this.alumno.mostrarLibrosPrestados();

        System.out.println("\nUsuario Maestro: \n" + "Nombre: " + this.maestro.getNombreCompleto() + "\n" +
                            "Num Horas Impartidas:" + this.maestro.getNumMateriasInpartidas() + "\n" +
                            "Sueldo: " + this.maestro.getSueldo() + "\n" +
                            "Num Horas Clase: " + this.maestro.getNumHorasClase() + "\n" +
                            "Materia: "+  this.maestro.getMateria() + "\n" +
                            "Libors Prestados: " );
        this.maestro.mostrarLibrosPrestados();
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumLibrosDisponibles() {
        return numLibrosDisponibles;
    }

    public void prestamoAlumnos(String nombreLibro){

        if(this.alumno.prestamo(nombreLibro))
            System.out.println("Se hizo el prestamo correctamente!!");
        else
            System.out.println("Ocurrio un error");
    }

    public void prestamoMaestros(String nombreLibro){

        if(this.maestro.prestamo(nombreLibro))
            System.out.println("Se hizo el prestamo correctamente!!");
        else
            System.out.println("Ocurrio un error");
    }

}
