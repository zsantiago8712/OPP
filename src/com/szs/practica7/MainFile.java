package com.szs.practica7;

public class MainFile {

    public static void main(String[] args){

        Dog dog1 = new Dog(12, 20, true);
        Pitbull dog2 = new Pitbull(12, 20, false, "cafe");
        Buldog dog3 = new Buldog(5, 30, true, "Azul");

        System.out.println("La edad del perro es " + dog1.getEdad() + "y el peso es: " + dog1.getPeso());
        System.out.println("La actividad favorita del perro1 es " );
        dog1.printActividad();



        System.out.println("La actividad favorita del pitbull es " );
        dog2.printActividad();
        System.out.println("El color del buldog es " + dog2.getColor() + ", el bulldog esta entrenado?: " + dog2.getEstaEntrenado());


        System.out.println("La actividad favorita del bulldog es " );
        dog3.printActividad();
        System.out.println("El Bulldog tiene pedigri? " + dog3.getTienePedigri() + " el tipo es: " + dog3.getTipoPedigri());

    }
}
