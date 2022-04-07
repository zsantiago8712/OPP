package com.szs.examen2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MainFile {

    public static void main(String[] args) throws FileNotFoundException {

        Files file = new Files();

        ArrayList<String> lines = new ArrayList<>();
        ArrayList<String> cleanLines = new ArrayList<>();
        ArrayList<Integer> positions = new ArrayList<>();

        lines = file.readFile("/Users/randymarsh/Documents/OPP/src/com/szs/examen2/DatosExamen2.csv");

        System.out.println("Lineas sin limpiar");
        for(String line : lines)
            System.out.println(line);

        cleanLines = file.cleanLines(lines);

        System.out.println("\n\nLineas limpias");
        for(String line : cleanLines)
            System.out.println(line);

        positions = file.manipulateLines(cleanLines, "PfizerBioNTech", "Covid19");
        System.out.println("\n\nPosiciones");
        for(int position : positions)
            System.out.println(position);
    }
}
