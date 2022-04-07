package com.szs.examen2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * @author Santiago Zamora Solis
 * Metodo para la manipulacion de Archivos y de datos del archivo
 */
public class Files{

    /**
     * Lee archivo csv y regresa las lineas ledias en el el
     * @param pathFile
     * @return ArrayList de las lineas del csv
     * @throws FileNotFoundException
     */
    public ArrayList<String> readFile(String pathFile) throws FileNotFoundException {
        try {
            ArrayList<String> list = new ArrayList<>();
            Scanner csvData = new Scanner(new File(pathFile));
            while (csvData.hasNext())
                list.add(csvData.nextLine());
            return list;
        } catch (Exception e) {
            System.out.println("ERROR: e");
        }
        throw new FileNotFoundException("FILE pathFile + NOT FOUND");
    }

    /**
     * Limpia todo la linea de caracteres especiales y los cambia por un espacio
     * @param lines
     * @return ArrayList<String>
     */
    public ArrayList<String> cleanLines(ArrayList <String> lines){

        ArrayList<String> cleanLines = new ArrayList<>();
        for (String line : lines)
            cleanLines.add(line.replaceAll("\\W", " "));

        return cleanLines;
    }

    /**
     * Busca palabra y checa si otra palabra esta atras de esta, si enceuntra pondra 1 y en caso de que no pondra 0
     * @param cleanLines
     * @param word1
     * @param word2
     * @return ArrayList<Integer>
     */
    public ArrayList<Integer> manipulateLines(ArrayList<String> cleanLines, String word1, String word2){
        ArrayList<Integer> positions = new ArrayList<>();

        boolean found = false;

        for(String line : cleanLines){

            if(line.contains(word1) && line.contains(word2)){
                if(line.indexOf(word1) > line.lastIndexOf(word2)){
                    positions.add(1);
                    found = true;
                }
            }

            if(!found)
                positions.add(0);
            found = false;
        }

        return positions;
    }
}


