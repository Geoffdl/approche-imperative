package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {

        int[] array1 = {6, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, 1};

        boolean myBool = true;


        for (int i = 0; i < array1.length; i++) {
            if (array1.length >= 1 && (array1[i] == 6 || array1[array1.length - 1 - i] == 6)) {
                myBool = true;
            } else {
                myBool = false;
            }
        }

        System.out.println(myBool ? "Le premier ou le dernier élément = 6" : "pas de 6 en premier ou dernier");

    }
}