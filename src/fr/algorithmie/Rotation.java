package fr.algorithmie;


public class Rotation {
    public static void main(String[] args) {

        int[] array1 = {6, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, 1};
        System.out.println("Table de base: ");
        for (int val : array1) {
            System.out.print(val + "; ");
        }

        int lastElement = array1[array1.length - 1];
        int rotationFactor = 1;

        for (int i = array1.length - 1; i > 0; i--) {

            array1[i] = array1[i - rotationFactor];

        }
        array1[0] = lastElement;

        System.out.println("\nTable après rotation de " + rotationFactor + ": ");
        for (int val : array1) {
            System.out.print(val + "; ");
        }
    }
}