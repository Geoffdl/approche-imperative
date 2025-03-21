package fr.boucles;

public class ExerciceBoucleBase {
    public static void main(String[] args) {

        // Tous les nombres de 1 à 10
        int myNumber = 1;

        while(myNumber <= 10){
            System.out.println(myNumber);
            myNumber++;
        }

        // Mon nom 20 fois
        String myName = "Geoff";
        int i = 1;

        while(i<=20){
            System.out.println(myName);
            i++;
        }

        // Tous les pairs de 2 à 100
        for(int j =1; j<=100; j++)
            if(j%2 == 0){
              System.out.println(j + " est un entier pair");

            } else{
                System.out.println(j + " est un entier impair");
            }


    }
}
