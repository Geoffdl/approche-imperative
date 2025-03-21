package fr.algorithmie;

import java.util.Arrays;

public class InversionContenu {
    public static void main(String[] args) {

        int[] myArray = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};

        System.out.println("create and copy myArray into myArrayCopy in reversed order");

        int[] myArraycopy = new int[myArray.length];

        for (int j = 0; j < myArraycopy.length; j++) {
            myArraycopy[j] = myArray[myArray.length-1 -j];
        };

        System.out.println("In reversed order :");
        for (int val : myArraycopy) {
            System.out.println(val);;
        }
        System.out.println("In initial order :");
        for (int val : myArray) {
            System.out.println(val);;
        }

    }
}
