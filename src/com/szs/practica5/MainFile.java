package com.szs.practica5;

import com.szs.practica4.Empresa;

public class MainFile {

    public static void main(String[] args){

        Empresa empresa1 = new Empresa("Empla", "Acrilicos", "pereferico Sur");

        empresa1.agregarEmpleadoHorasTrabajadas("empia1", "Santiago", "Zamora Solis", 500, 3);
        empresa1.agregarEmpleadoHorasTrabajadas("empia2", "Daniela", "Garcia Morales", 300, 2);

        EmpleadoComision emp2 = new EmpleadoComision("1", "Santiago", "Zamora Solis");
        EmpleadoSueldoBase emp3 = new EmpleadoSueldoBase("empia2", "Daniela", "Garcia Morales");

        emp2.setSueldo(200);
        emp2.setVentas(40);

        emp3.setSueldo(200);

        System.out.println("Total de nomina de la empresa: " + empresa1.calcularNominaTotal());
        System.out.println("Suledo: "+ emp2.calcularSalario());
        System.out.println("Suelod: " + emp3.calcularSalario());

    }
}

