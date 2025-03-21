package fr.algorithmie;



public class InteractifFibonacci {

    public static void Fibonacci(int N) {

        int num1 = 0;
        int num2 = 1;


        for(int i=0; i<N; i++){

            System.out.print(num1+" ");
            int num3 = num1+num2;

            num1 = num2;
            num2 = num3;


        }

    }
}
