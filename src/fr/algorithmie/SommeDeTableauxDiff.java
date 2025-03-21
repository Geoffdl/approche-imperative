package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {

        int[] myFirstArray = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] mySecondArray = {-1, 12, 17, 14, 5, -9, 0, 18 };

        // Create an array that contains the sum of each array;

        int[] mySecondArrayLonger = Arrays.copyOf(mySecondArray,myFirstArray.length);


        int[] mySummedArray = new int[myFirstArray.length];

        for(int i=0; i<mySummedArray.length; i++){
            mySummedArray[i] = myFirstArray[i]+mySecondArrayLonger[i];
        }

        for(int val:mySummedArray){
            System.out.println(val);
        }



    }
}
