package fr.tableaux;

import java.io.PrintStream;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {

        double[] numbers = {8,-7,12,1,-2,14,17,9};

        System.out.println(numbers[0]+"\n"+ numbers.length+"\n"+ numbers[numbers.length-1]);

        //l'index recherché n'existe pas
        System.out.println(numbers[10]);

    }
}
