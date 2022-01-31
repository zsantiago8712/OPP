package com.szs.practica6;

import com.szs.practica4.Empresa;

public class MainFile {

    public static void main(String[] args) {
        Empresa empresa1 = new Empresa("Empla", "Acrilicos", "pereferico Sur");
        empresa1.agregarEmpleadoHorasTrabajadas("empia1", "Santiago", "Zamora Solis", 500, 3);
        empresa1.agregarEmpleadoHorasTrabajadas("empia2", "Daniela", "Garcia Morales", 300, 2);

        empresa1.agregarEmpleadComision("empC1", "Jorge", "Sanchez", 500, 3);
        empresa1.agregarEmpleadComision("empC2", "Diego", "Barbosa", 400, 4);

        empresa1.agregarEmpleadoSueldoBase("empSB1", "Sebastian", "Cast", 300);
        empresa1.agregarEmpleadoSueldoBase("empSB2", "Azul", "Amarillo", 200);

        int i;
        System.out.println("La empresa1 tiene una nomina total de: " + empresa1.calcularNominaTotal() + "\n");

        System.out.println("NO empleados por Horas Trabajadas: " + empresa1.getNumeroEmpleadosHorasTrabajadas());
        for (i = 0; i < empresa1.getNumeroEmpleadosHorasTrabajadas(); i++) {
            System.out.println("El empleado " + (i + 1) + " por Horas Trabajadas se llama " + empresa1.getNombreEmpleadosHorasTrabajadas(i));
            System.out.println("El empleado " + (i + 1) + " por Horas Trabajadas tiene un sueldo de " + empresa1.getSalarioEmpleadosHorasTrabajadas(i) + "\n");
        }

        System.out.println("\nNO empleados por Comision: " + empresa1.getNumeroEmpleadosHorasTrabajadas());
        for (i = 0; i < empresa1.getNumeroEmpleadosComision(); i++) {
            System.out.println("El empleado " + (i + 1) + " por Comision se llama " + empresa1.getNombreEmpleadoComision(i));
            System.out.println("El empleado " + (i + 1) + " por Comision tiene un sueldo de " + empresa1.getSalarioEmpleadosComision(i) + "\n");
        }

        System.out.println("\nNO empleados por Sueldo Base: " + empresa1.getNumeroEmpleadosHorasTrabajadas());
        for (i = 0; i < empresa1.getNumeroEmpleadoSueldoBase(); i++) {
            System.out.println("El empleado " + (i + 1) + " por Sueldo Base se llama " + empresa1.getNombreEmpleadoSueldoBase(i));
            System.out.println("El empleado " + (i + 1) + " por Sueldo Base tiene un sueldo de " + empresa1.getSalarioEmpleadoBase(i) + "\n");
        }

    }
}
