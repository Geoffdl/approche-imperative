package fr.algorithmie;

public class FabriquerMur {

    public static void main(String[] args) {

        // const
        int A = 1;
        int B = 5;

        //variables;
        int nbSmall = 6;
        int nbBig = 0;
        int taille = 11;

        // init result
        boolean constructible = false;


        int QtDeLarges = Math.min(nbBig, taille / B);
        int longueurRestante = taille - (QtDeLarges * B);

        if (longueurRestante <= nbSmall) {
            constructible = true;
            System.out.println(constructible + " Le mur prend forme!");

        } else {
            System.out.println(constructible + " pas de mur");
        }
    }


}