package fr.algorithmie;

public class AffichagePartiel {
    public static void main(String[] args) {
        int[] myArray = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // boucle + test entier > 3
        System.out.println("entier >3");
        for (int val : myArray) {
            if (val > 3) {
                System.out.print(val + "; ");
            }
        }

        // boucle + test entier pair
        System.out.println("\nentier pair");
        for (int val : myArray) {
            if (val % 2 == 0) {
                System.out.print(val + "; ");
            }
        }

        // boucle + test index pair
        System.out.println("\nindex pair");
        for (int i = 0; i < myArray.length; i += 2) {
            System.out.print(myArray[i] + "; ");

        }

        //boucle+ test entier impair
        System.out.println("\nentier impair");
        for (int val : myArray) {
            if (val % 2 != 0) {
                System.out.print(val + "; ");
            }
        }
    }
}