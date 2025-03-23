package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {

        int[] myFirstArray = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] mySecondArray = {-1, 12, 17, 14, 5, -9, 0, 18};

        System.out.println("First table: ");
        for (int val : myFirstArray) {
            System.out.print(val + "; ");
        }
        System.out.println("\nSecond table: ");
        for (int val : mySecondArray) {
            System.out.print(val + "; ");
        }

        System.out.println("\nTable containing sum of #1 and #2: ");
        // Create an array that contains the sum of each array;
        int[] myThirdArrayLonger = new int[0];
        if (myFirstArray.length > mySecondArray.length) {
            myThirdArrayLonger = Arrays.copyOf(mySecondArray, myFirstArray.length);
        } else {
            myThirdArrayLonger = Arrays.copyOf(myFirstArray, mySecondArray.length);
        }


        int[] mySummedArray = new int[myFirstArray.length];

        for (int i = 0; i < mySummedArray.length; i++) {
            mySummedArray[i] = myFirstArray[i] + myThirdArrayLonger[i];
        }

        for (int val : mySummedArray) {
            System.out.print(val + "; ");
        }


    }
}