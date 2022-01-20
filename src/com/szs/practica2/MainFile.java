package com.szs.practica2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainFile {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nEmpleados = Integer.valueOf(br.readLine()).intValue();
        String[] ids = new String[nEmpleados];
        double[] horasTrabajadas = new double[nEmpleados];
        String[] nombres = new String[nEmpleados];
        double[] nSuealdo = new double[nEmpleados];
        int i;
        double totalPagos = 0;




        for(i = 0; i < nEmpleados; i++){
            System.out.println("Escriba nombre del empleado: ");
            nombres[i] = br.readLine();

            System.out.println("Escibra su Id: ");
            ids[i] = br.readLine();

            System.out.println("Escibra el numero de horas trabajadas: ");
            horasTrabajadas[i] = Double.valueOf(br.readLine()).doubleValue();

            System.out.println("Escriba el su suealdo: ");
            nSuealdo[i] = Double.valueOf(br.readLine()).doubleValue();

            System.out.println("Suelado por hora del empleado: " + horasTrabajadas[i] * nSuealdo[i]);
            totalPagos += horasTrabajadas[i] * nSuealdo[i];
        }

        System.out.println("El total a pagar: " + totalPagos);
    }
}
