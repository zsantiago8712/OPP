package com.szs.practica9;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Santiago Zamora
 */

public class MainFile {

    public static void main(String args[]) throws Exception {

        DecimalFormat df = new DecimalFormat("###.#####");
        double desvEstandar = 1f, media = 0f, x = 0f;
        // Creas el scanner del input
        Scanner scanner = new Scanner(System.in);


        try{
            System.out.println("Ingrese la media");
            media   = scanner.nextDouble();

            System.out.println("Ingrese la desviacion Estandar");
            desvEstandar  = scanner.nextDouble();

            System.out.println("Ingrese x");
            x = scanner.nextDouble();

            FdensidadNormal calc1 = new FdensidadNormal(media, desvEstandar);
            System.out.println("El valor evaluado es: " + df.format(calc1.calcularaValorFDN(x)));
            System.out.println("El valor de probabilidad es: " + calc1.calcularProbabilidadFDN(2, 11, 0.001));
        }catch(Exception e){
            System.out.println("Tienen que ser datos numericos");
            System.out.println(e.toString());
        }
    }
}
