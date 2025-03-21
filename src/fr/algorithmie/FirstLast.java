package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {

        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, 1};

        boolean myBool = true;


        for(int i=0; i<array1.length; i++)  {
            if(array1.length >= 1 && (array1[i] == array1[array1.length -1 -i])){
                myBool = true;
            } else {
                myBool = false;
            }
        }

        System.out.println(myBool? "Le premier et le dernier élément match" : "ça match pas");

    }
}
