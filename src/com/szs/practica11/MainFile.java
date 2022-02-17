package com.szs.practica11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainFile {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        int numCoincidencias = 0;
        String search = "ham,\"I am sorry it hurt you.,\",";

        try{
            Scanner csvData = new Scanner(new File("/Users/randymarsh/Documents/OPP/src/com/szs/practica11/spam2.csv"));

            while (csvData.hasNext()) {
                list.add(csvData.nextLine());
            }

        }catch(FileNotFoundException e){
            System.out.println("ERROR: " + e);
        }

        System.out.println("Impresion de la lista\n");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));

            if(list.get(i).equals(search)){
                numCoincidencias++;
                System.out.println("Coincidencia en " + i);
            }
        }

        System.out.println("\nNumero de Coindicenias: " + numCoincidencias);

    }
}
