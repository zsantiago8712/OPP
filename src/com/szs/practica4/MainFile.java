package com.szs.practica4;

public class MainFile {

    public static void main(String[] args) {

        Empresa empresa1 = new Empresa("Empla", "Acrilicos", "pereferico Sur");
        empresa1.agregarEmpleadoHorasTrabajadas("empia1", "Santiago", "Zamora Solis", 500, 3);
        empresa1.agregarEmpleadoHorasTrabajadas("empia2", "Daniela", "Garcia Morales", 300, 2);

        System.out.println("Total de nomina de la empresa: " + empresa1.calcularNominaTotal());

    }
}
