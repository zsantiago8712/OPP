package com.szs.practica8;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Santiago Zamora
 */

public class MainFile {

    public static void main(String args[]){

        DecimalFormat df = new DecimalFormat("###.#####");

        // Creasd el scanner del input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la media");
        double media = scanner.nextDouble();

        System.out.println("Ingrese la desviacion Estandar");
        double desvEstandar = scanner.nextDouble();

        FdensidadNormal calc1 = new FdensidadNormal(media, desvEstandar);
        System.out.println("Ingrese valor de x");
        System.out.println("El valor evaluado es: " + df.format(calc1.calcularaValorFDN(scanner.nextDouble())));
        System.out.println("El valor de probabilidad es: " + calc1.calcularProbabilidadFDN(2, 11, 0.001));
    }
}
