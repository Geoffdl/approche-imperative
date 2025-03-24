package fr.algorithmie;

public class CaracteresConsecutifs {

    public static void main(String[] args) {

        String myString = "aaabbc";
        System.out.println(CountLetters(myString));



    }

    public static String CountLetters(String myString){

        StringBuilder result = new StringBuilder();
        char currentChar = myString.charAt(0);
        int count = 1;

        for(int i = 1; i < myString.length(); i++) {
            if (myString.charAt(i) == currentChar) {
                count ++;
            } else {
                result.append(currentChar).append(count);
                currentChar = myString.charAt(i);
                count = 1;
            }
        }

        result.append(currentChar).append(count);

        return result.toString();

    }
}