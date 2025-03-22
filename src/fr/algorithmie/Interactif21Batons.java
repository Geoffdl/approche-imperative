package fr.algorithmie;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;


/*
Board = 21 sticks
Player vs computer turn based
each turn 1 to 3 stick is removed
whoever has to pick the last one loses

note: Trying to do without Arraylist
Received input through scanner
 */

public class Interactif21Batons {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("____________________________");

        int initialSticks = 21;

        //initial game board
        System.out.println("Welcome to the game of sticks. In this game you will compete against the computer.\nThe rules are simple, each player removes 1, 2 or 3 sticks each turn. The player that removes the last stick loses.\n");
        String[] sticksBoard = new String[initialSticks]; //create String array with provided amount of slots
        Arrays.fill(sticksBoard, "|"); // Fill array with the game object
        for (int i = 0; i < sticksBoard.length; i++) { // Display board
            System.out.print(sticksBoard[i] + "  ");
        }
        System.out.println();

        int sticksRemoved = 0;


        //Initial game state
        int totalSticks = initialSticks - sticksRemoved;
        System.out.println("There are " + totalSticks + " sticks.");

        // Start the game
        boolean running = false;
        System.out.println("\nWant to start the game ? Type 'yes' to start, 'no' to quit");
        System.out.print("Your choice : ");
        String startInput = scanner.next();

        if (Objects.equals(startInput, "no")) {
            System.out.println("No problem! See you next time!");
        } else if (Objects.equals(startInput, "yes")) {
            running = true;
            System.out.println("\nNice, starting the game!");
        }

        boolean playerTurn = false;
        boolean computerTurn = false;
        double coinFlip = 0;

        // Decides who goes first
        if (running) {
            System.out.println("\nFirst, let's decide who will play first");
            System.out.println("\nLet's flip a coin\n. . . \n. .");
            coinFlip = Math.random() * 2;
        }
        if (coinFlip > 1) {
            playerTurn = true;
            System.out.println("Face! You start!");
        }
        if (coinFlip <= 1) {
            computerTurn = true;
            System.out.println("Tail! Computer starts!");
        }

        while (running) {
            int playerChoice;
            int computerChoice;
            System.out.println("__________________________________");
            //Update logic
            totalSticks = initialSticks - sticksRemoved;
            String[] currentBoard = Arrays.copyOf(sticksBoard, totalSticks);
            System.out.println("Current board state: ");
            for (String val : currentBoard) {
                System.out.print(val + " ");
            }
            System.out.println("\nThere are " + totalSticks + " sticks left.\n");

            //win handling
            if (totalSticks == 0) {
                if (!playerTurn) {
                    System.out.println("You lost ! Try again next time.");
                } else {
                    System.out.println("You won! Good job!");
                }
                running = false;
            }

            //turn logic
            if (playerTurn) {

                System.out.println("Your turn! how many sticks do you want to remove ?(max:3)");
                playerChoice = scanner.nextInt();
                for (int i = playerChoice; i > 0; i--) {
                    sticksRemoved++;
                }
                playerTurn = false;
                computerTurn = true;
            }
            if (computerTurn && (sticksRemoved != initialSticks)) {
                System.out.println("\nIt's the computer's turn.");

                if ((initialSticks - sticksRemoved) <= 2) {  // handle low stick case
                    computerChoice = (int) Math.ceil(Math.random() * (initialSticks - sticksRemoved));
                } else if (initialSticks - sticksRemoved == 4) {
                    computerChoice = 3;
                } else {
                    computerChoice = (int) Math.ceil(Math.random() * 3);
                }

                System.out.println("The computer removed " + computerChoice + " sticks");
                for (int i = computerChoice; i > 0; i--) {
                    sticksRemoved++;
                }
                playerTurn = true;
                computerTurn = false;
            }

        }

    }

}
