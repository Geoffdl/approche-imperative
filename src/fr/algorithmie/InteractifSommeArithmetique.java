package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nb;

        System.out.println("Please enter a number: ");
        nb = scanner.nextInt();



        System.out.println("Amazing, you picked "+ nb +"! the sum of all numbers from 1 to " + nb + " is :");

        int sum = 0;
        for(int i = 1; i<= nb ; i++){

            sum += i;

        }

        System.out.print(sum);
    }
}
