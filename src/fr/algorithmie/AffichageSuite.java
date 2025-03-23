package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {


        System.out.println("\navec for");
        // 1 à 10
        System.out.println("Nombres de 1 à 10: ");
        for (int i = 0; i <= 10; i++) {

            System.out.print(i + " ");
        }
        //pair entre 0 10
        System.out.println("\nPairs de 0 à 10: ");
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        //impair 0 9
        System.out.println("\nImpairs de 0 à 10 ");
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\navec while");
        System.out.println("Nombres de 1 à 10: ");
        int i = 0;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\nPairs de 1 à 10: ");
        int j = 0;
        while (j <= 10) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
            j++;
        }
        System.out.println("\nImpairs de 1 à 10: ");
        int k = 0;
        while (k <= 10) {
            if (k % 2 != 0) {
                System.out.print(k + " ");
            }
            k++;
        }
    }
}