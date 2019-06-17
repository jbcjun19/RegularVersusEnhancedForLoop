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
        // This shorthand is called an enhanced for-loop.
        for (String word : strArray) {
            System.out.println("The fruit is " + word);
        }

        // #2 Create another String array
        // Can we population it using an enhanced for-loop?
        // Hold onto your answer. Let's check it
        String[] strArray2 = new String[3];

        for (String word : strArray2) {
            System.out.println("Enter a new word"); // red, blue, yellow
            word = input.nextLine();
        }
        // printing...
        for (String word : strArray2) {
            System.out.println("The color is " + word);
        }

        /*
        * When you print strArray2, notice how you get "null".
        *
        * "word" in line 34 is grayed out because it's not being used.
        * "word" reads in the users input but never saves it to the array.
        *
        * The answer from the earlier question is:
        * No, we can't populate the array using an enhanced for-loop.
        *
        * Let's try again with a regular for-loop
        * */
        for (int i=0; i < strArray2.length; i++) {
            System.out.println("Enter a new word. This time I'll save it, I promise"); // red, blue, yellow
            strArray2[i] = input.nextLine();
        }
        // Print to check
        for (String word : strArray2) {
            System.out.println("The color is " + word);
        }

    }

}
