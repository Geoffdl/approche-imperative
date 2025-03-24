package fr.algorithmie;

import java.util.Arrays;


public class RechercheSecond {

    public static void main(String[] args) {


        int[] myArray = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // find max so that myArray[n] = highest value in myArray;

        Arrays.sort(myArray);
        System.out.print("\nSorted array: ");
        for (int val : myArray) {
            System.out.printf(val + "; ");
        }

        System.out.println("\nThe second highest value in my array is " + myArray[myArray.length - 2]);

    }


}