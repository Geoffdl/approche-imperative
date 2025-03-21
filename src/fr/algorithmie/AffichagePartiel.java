package fr.algorithmie;

public class AffichagePartiel {
    public static void main(String[] args) {
        int[] myArray = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // boucle + test entier > 3
        System.out.println("entier >3");
        for (int val : myArray) {
            if (val > 3) {
                System.out.println(val);
            }
        }

        // boucle + test entier pair
        System.out.println("entier pair");
        for (int val : myArray) {
            if (val % 2 == 0) {
                System.out.println(val);
            }
        }

        // boucle + test index pair
        System.out.println("index pair");
        for(int i = 0; i < myArray.length; i+=2){
            System.out.println(myArray[i]);

        }

        //boucle+ test entier impair
        System.out.println("entier impair");
        for (int val : myArray) {
            if (val % 2 != 0) {
                System.out.println(val);
            }
        }
    }
}
