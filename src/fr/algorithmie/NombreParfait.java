package fr.algorithmie;

public class NombreParfait {

    public static void main(String[] args) {

        int[] myNum = {1, 2, 3, 6, 28, 50, 496};

        for (int val : myNum) {
            System.out.println(PerfectNumberChecker(val) ? val + " is a perfect number." : val + " is not a perfect number.");
        }


    }

    public static boolean PerfectNumberChecker(int myNum) {

        int sum = 0;
        for (int i = 1; i <= myNum / 2; i++) {
            if (myNum % i == 0) {
                sum += i;
            }
        }

        return sum == myNum;
    }
}