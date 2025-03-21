package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nb;

        System.out.println("Please enter a number: ");
        nb = scanner.nextInt();


        System.out.println("Amazing, you picked "+ nb +"! the following 10 numbers are :");

        for(int i=1; i<=10;i++){
            int c = i+nb;
            System.out.print(c+ ", ");
        }

    }
}
