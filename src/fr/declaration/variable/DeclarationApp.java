package fr.declaration.variable;

public class DeclarationApp {
    public static void main(String[] args){

        byte myByte = 127;
        short myShort = 32767;
        int myInt = 2000111000;
        long myLong = 107L;
        float myFloat = 5.05f;
        double myDouble = 5.10;
        char myChar = 'g';
        boolean myBool = true;
        String myString = "Geoff";

        System.out.println(myByte +" // "+ myShort +" // "+ myInt );

        String myRandomString = "Voici le résultat d'un calcul : \n 1 + 5 = 6";
        System.out.println(myRandomString + '\n' + myRandomString);
    }
}
