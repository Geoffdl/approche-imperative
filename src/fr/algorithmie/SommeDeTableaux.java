package fr.algorithmie;

public class SommeDeTableaux {
    public static void main(String[] args) {

        int[] myFirstArray = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] mySecondArray = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};

        // Create an array that contains the sum of each array;

        int[] mySummedArray = new int[myFirstArray.length];

        for(int i=0; i<mySummedArray.length; i++){
            mySummedArray[i] = myFirstArray[i]+mySecondArray[i];
        }

        for(int val:mySummedArray){
            System.out.println(val);
        }



    }
}
