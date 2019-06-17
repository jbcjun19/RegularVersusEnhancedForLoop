package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a scanner variable
        Scanner input = new Scanner(System.in);

        // #1 Create a new String array
        // We will populate it using a regular for-loop
        String[] strArray = new String[3];

        for (int i = 0; i < strArray.length; i++) {
            System.out.println("Please enter a word: "); // apples, oranges, bananas
            strArray[i] = input.nextLine();
        }
        // This print statement will print the memory address of the array
        System.out.println(strArray);
        // We need a loop to print one item inside an array at a time
        for (String word : strArray) {
            System.out.println("The fruit of today is " + word);
        }


        // #2 Create another String array
        // This time we will populate it using an enhanced for-loop
        String[] strArray2 = new String[3];

        for (String word : strArray2) {
            System.out.println("Enter a new word"); // red, blue, yellow
            word = input.nextLine();
        }

        /*
        * On your own, create a loop below that will print out
        * the contents of strArray2
        * */

    }

}
