package com.szs.practica18;

import com.szs.utils.DataSourceUtils;
import com.szs.utils.FileUtils;
import com.szs.models.*;
import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.trees.J48;
import weka.classifiers.trees.RandomTree;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import java.io.File;
import java.util.Random;

public class MainFile {

    public static final String TREE_UNPRUNED_OPT = "-U";
    public static void main(String [] args) throws Exception {

        // lectura de archivo
        FileUtils fileUtils = new FileUtils();
        File file = fileUtils.getFile("weather2.arff");

        // convierte del archivo a instancias.
        DataSourceUtils dataSourceUtils = new DataSourceUtils();
        Instances instances = dataSourceUtils.newWekaInstances(file);

        System.out.println(instances.toString());

        // Clase Método para generar el árbol  J48

        J48 tree = new J48();
        //RandomTree tree = new RandomTree();
        String[] options = new String[1];

        options[0] = TREE_UNPRUNED_OPT;

        tree.setOptions(options);

        // genera el arbol de clasificación.
        tree.buildClassifier(instances);

        System.out.println(tree);

        // un caso de prueba, se pone un nuevo objeto y basado en el árbol anterior
        // determina el valor de la funcion objetivo.

        Instance instance = new DenseInstance(4);
        instance.setDataset(instances);

        /*
        instance.setValue(WeatherAttributesIndex.AGE.getIndex(),40 );
        instance.setValue(WeatherAttributesIndex.EXPERIENCE.getIndex(), 10);
        instance.setValue(WeatherAttributesIndex.RANK.getIndex(), 7);
        instance.setValue(WeatherAttributesIndex.NATIONALITY.getIndex(),"USA");
        */

        instance.setValue(WeatherAttributesIndex.CLIMA.getIndex(), "CALOR");
        instance.setValue(WeatherAttributesIndex.PADRES.getIndex(), "NO");
        instance.setValue(WeatherAttributesIndex.ECONOMICA.getIndex(), "BUENA");
        instance.setValue(WeatherAttributesIndex.PANORAMA.getIndex(), "CASA");



        // resultado de la prueba
        int result = (int) tree.classifyInstance(instance);

        System.out.println("Nueva Clasificación " + PlayAttributeValues.newInstance(result));

        Classifier treeClassifier = new J48();
        Evaluation treeEvaluation = new Evaluation(instances);
        int numFolds = 5;
        Random random = new Random(1);
        treeEvaluation.crossValidateModel(treeClassifier, instances, numFolds, random, new Object[] {});
        System.out.println("mfg--" + treeEvaluation.toSummaryString());
    }
}
