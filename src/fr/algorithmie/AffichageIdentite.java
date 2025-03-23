package fr.algorithmie;

public class AffichageIdentite {
    public static void main(String[] args) {

        String myName = "Geoff";
        System.out.println("Mon nom est: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + 1 + ": " + myName + "; ");
        }
    }

}