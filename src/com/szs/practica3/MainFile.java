package com.szs.practica3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainFile {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Empleado emp1 = new Empleado("a123", "Santiago", "Zamora Solis");
        Empleado emp2 = new Empleado("a1234", "Daniela", "Garcia Morales");

        System.out.println("Introduce el número de horas trabajadas");
        emp1.setHorasTrabajadas(Double.parseDouble(br.readLine()));

        System.out.println("Introduce el sueldo por hora");
        emp1.setHoraSueldo(Double.parseDouble(br.readLine()));

        System.out.println("Introduce el número de horas trabajadas");
        emp2.setHorasTrabajadas(Double.parseDouble(br.readLine()));

        System.out.println("Introduce el sueldo por hora");
        emp2.setHoraSueldo(Double.parseDouble(br.readLine()));


        System.out.println("El salario del empleado " + emp1.getNombre() + " " + emp1.getApellidos() + ": "
                + emp1.calcularSalario());

        System.out.println("El salario del empleado " + emp2.getNombre() + " " + emp2.getApellidos() + ": "
                + emp2.calcularSalario());
    }

}
