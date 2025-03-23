package fr.algorithmie;

public class RechercheMax {
    public static void main(String[] args) {

        int[] myArray = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // find max so that myArray[n] = highest value in myArray;

        int maxVal = myArray[0];

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > maxVal) {
                maxVal = myArray[i];
            }
        }
        System.out.println(maxVal);


    }
}