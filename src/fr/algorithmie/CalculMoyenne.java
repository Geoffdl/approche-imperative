package fr.algorithmie;

public class CalculMoyenne {
    public static void main(String[] args) {

        int[] myArray = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Calculate average for myArray

        int myAverage;
        int mySum = myArray[0];

        for (int i = 0; i < myArray.length; i++) {
            mySum += myArray[i];
        }
        myAverage = mySum / myArray.length;

        System.out.println("La moyenne de myArray est : " + myAverage);


    }
}