package fr.algorithmie;

import java.util.Arrays;

public class AffichageInverse {
    public static void main(String[] args) {

        int[] myArray = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        System.out.println("print myArray");
        for (int j : myArray) {
            System.out.print(j + "; ");
        }


        System.out.println("\nprint myArray in reverse order");
        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.print(myArray[i] + "; ");
        }

        // print myArray where myArray >= 3
        System.out.println("\nprint myArray where myArray >=3");
        for (int u = 0; u < myArray.length; u++) {
            if (myArray[u] >= 3) {
                System.out.print(myArray[u] + "; ");
            }
        }

        System.out.println("\n\ncreate and copy myArray into myArrayCopy");
        int[] myArrayCopy = Arrays.copyOf(myArray, myArray.length);
        System.out.println("print myArrayCopy");
        for (int j : myArrayCopy) {
            System.out.print(j + "; ");
        }

    }
}