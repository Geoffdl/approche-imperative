package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {
//        int[] myArray = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("avec for");
        // 1 à 10
        for (int i=0; i<= 10; i++){
            System.out.println(i);
        }
        //pair entre 0 10
        for (int i=0; i<= 10; i++){
            if(i%2==0){
            System.out.println(i);}
        }
        //impair 0 9
        for (int i=0; i<= 10; i++){
            if(i%2!=0){
                System.out.println(i);}
        }

        System.out.println("avec while");
        int i = 0;
        while(i<= 10){
            System.out.println(i);
            i++;
        }
        int j = 0;
        while(j<= 10){
            if(j%2==0){
                System.out.println(j);
                }

                j++;
        }
        int k =0;
        while(k<=10){
            if(k%2!=0) {
                System.out.println(k);
            }
            k++;
        }
    }
}
