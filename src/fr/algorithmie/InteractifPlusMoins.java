package fr.algorithmie;


import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {

        //Generate random nb
         int myRandomNb = (int)Math.round(Math.random()*100);

        //scanner init
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome to the number guessing game! Your goal is to match the number the computer picked in the least amount of tries. \nIt's somewhere between 0 and 100. \nGood luck!");
        int nb;

        int timesPlayed = 1;
        boolean isFound = false;


        while(!isFound){


            System.out.print("Guess a number: ");
            nb = scanner.nextInt();
            if(myRandomNb == nb){
                System.out.println("Congrats, you correctly guessed the number in "+timesPlayed+" attempts!");
                isFound = true;
            } else if(myRandomNb >= nb){
                System.out.println("Your guess is too low, try higher!");
                timesPlayed++;
            } else{
                System.out.println("Your guess is too high, try lower!");
                timesPlayed++;
            }
        }
    }
}
