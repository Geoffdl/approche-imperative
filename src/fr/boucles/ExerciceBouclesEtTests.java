package fr.boucles;

public class ExerciceBouclesEtTests {

    public static void main(String[] args) {

        int[] myArray = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};

        System.out.println("print myArray");
        for (int j : myArray) {
            System.out.println(j);
        }


        System.out.println("print myArray in reverse order");
        for(int i = myArray.length-1; i >= 0; i--){
            System.out.println(myArray[i]);
        }

        // print myArray where myArray >= 3
        System.out.println("print myArray where myArray >=3");
        for (int u = 0; u < myArray.length; u++){
            if(myArray[u] >= 3){
                System.out.println(myArray[u]);
            }
        }

    }
}
