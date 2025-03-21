package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] nb = new int[10];

        System.out.println("Please enter some numbers 10 times: ");
        int i=0;
        while(i<10) {
            System.out.print("Entry #"+(i+1)+": ");
            nb[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Good job, let's see what's the biggest number in there");


        int maxVal = nb[0];

        for( i = 0; i< nb.length; i++){
            if(nb[i] > maxVal){
                maxVal = nb[i];
            }
        }
        System.out.println("It is... Found it! it's : "+ maxVal);



    }
}
