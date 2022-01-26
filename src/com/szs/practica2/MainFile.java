package com.szs.practica2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainFile {

    public static void main(String[] args) throws IOException {

        Empleado emp1 = new Empleado("1234", "Santiago", "Zamora", 3, 300);
        Empleado emp2 = new Empleado("1235", "Daniel", "Muños", 5, 100);

        System.out.println("El salario del empleado " + emp1.name + ": " + emp1.calcularSalario());
        System.out.println("El salario del empleado " + emp2.name + ": " + emp2.calcularSalario());

        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    }
}
