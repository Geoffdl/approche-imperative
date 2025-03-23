package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {

    public static void main(String[] args) {

        System.out.println("\nWelcome to my interactive integer storage program. \nYou can store any integer of your choice by typing 1, or display all stored numbers by typing 2.");

        //scanner init
        Scanner scanner = new Scanner(System.in);

        //storage
        int[] userArray = new int[1];
        int arrayIndex = 0;

        //startup
        System.out.println("Chose your mode: 1 to enter add mode, 2 to display all numbers");
        int mode = scanner.nextInt();


        boolean running = true;

        while (running) {

            //Add mode
            if (mode == 1) {

                //check if array has reached maxsize
                if (arrayIndex >= (userArray.length - 1)) {
                    //increase array size by 1
                    userArray = Arrays.copyOf(userArray, userArray.length + 1);
                } else {

                    System.out.println("\nYou are now in add mode.\nType the number you want to add:");
                    int addNb = scanner.nextInt();

                    userArray[arrayIndex] = addNb;
                    arrayIndex++;

                    System.out.println("\nI successfully added the number " + userArray[arrayIndex - 1] + " to the list.\n\nWhat do you want to do now?\n1 to add, 2 to display or 0 to exit.");
                    mode = scanner.nextInt();
                }
            }

            //Display mode
            else if (mode == 2) {
                if (arrayIndex == 0) {
                    System.out.println("\nNo numbers have been recorded so far.");
                } else {
                    System.out.println("\n" + arrayIndex + " numbers have been recorded so far. \nHere is the list:");
                    for (int i = 0; i < userArray.length - 1; i++) {
                        System.out.print(userArray[i] + "; ");
                    }
                }

                System.out.println("\n\nWhat do you want to do now?\nType 1 to add more, or 2 to display again and 0 to exit");
                mode = scanner.nextInt();

                if (mode == 0) {
                    running = false;
                }
            }

            //wrong mode input handling, however any other input than int will still crash.
            else {
                System.out.println("\nInvalid option. Please type 1 to add numbers, 2 to display, or 0 to exit");
                mode = scanner.nextInt();

                if (mode == 0) {
                    running = false;
                }
            }

        }
        System.out.println("\nThank you for using the program. See you next time!");
    }

}