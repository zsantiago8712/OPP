package com.szs.practica9;

/**
 * Clase para calcular Funcion de densidada normal
 */
public class FdensidadNormal {
    private double media;
    private double desviacionEstandar;


    FdensidadNormal(double media, double desviacionEstandar) throws Exception {
        this.media = media;

        if(desviacionEstandar == 0)
            throw new ArithmeticException("La desviacion estandar no puede ser 0");

        this.desviacionEstandar = desviacionEstandar;
    }

    /**
     * @param x
     * @return (double) el calculo de la funcion de densidad normal
     */
    double calcularaValorFDN(double x){

        double el = -0.5 * (Math.pow(x - this.media, 2) / Math.pow(desviacionEstandar, 2));
        return (1 / (this.desviacionEstandar * Math.sqrt(2 * Math.PI))) * Math.exp(el);
    }

    /**
     * @param limitInf
     * @param limitSup
     * @param delta
     * @return (double) el calculo la Probabilidad de FDn
     */
    double calcularProbabilidadFDN(double limitInf, double limitSup, double delta){

        double res = 0;
        for (double i  = limitInf; i <= limitSup; i += delta)
            res += calcularaValorFDN(i) * delta;

        return res;
    }
}
