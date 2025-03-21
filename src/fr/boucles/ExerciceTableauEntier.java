package fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args) {

        int[] myArray = {1,2,3,4,5,6,7,8,9,10};

        //premier élément du tableau
        System.out.println(myArray[0]);

        //longueur du tableau
        System.out.println(myArray.length);

        //dernier élément du tableau
        System.out.println(myArray[myArray.length - 1]);

        //assign 8 to myArray position #4
        myArray[4] = 8;
        System.out.println(myArray[4]);


    }
}
