package fr.algorithmie;

import java.util.Scanner;

public class TestFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Welcome to the Fibonator.\nPlease input the integer you want to see the sequence displayed up to: ");
        int N = scanner.nextInt();


        System.out.println("Generating " + N + " ranks of the Fibonacci sequence:");
        InteractifFibonacci.Fibonacci(N);


        System.out.println();
    }

}