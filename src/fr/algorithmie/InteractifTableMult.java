package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nb;
        boolean isValid = false;


        while(!isValid){
            System.out.println("Please enter a number between 1 and 10: ");
            nb = scanner.nextInt();
            if(nb>=1 && nb <=10){

                System.out.println("The multiplication table for "+nb+" is as follow:");

                for(int i=0; i<=10;i++){
                    System.out.println(nb + " * " + i + " = " + nb*i);
                }
                isValid = true;

            }
            else {
                System.out.println("Wrong, try again");

            }
        }

    }
}
