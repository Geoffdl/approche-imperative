package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nb = scanner.nextInt();

        boolean isValid = false;

        while(!isValid){
            System.out.println("Please enter a number between 1 and 10: ");

            if(nb>= 1 && nb <= 10)  {
                System.out.println("Good job, this is a great number" + nb);
                isValid = true;
            } else {
                System.out.println("Wrong, try again");
            }
        }


    }
}

