package io.codelex.arithmetic;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = (int) (Math.random() * 100) + 1;
        System.out.print("I'm thinking of a number between 1-100.  Try to guess it.\n> ");
        int input = sc.nextInt();
        if (input > x) {
            System.out.println("Sorry, you are too high.  I was thinking of " + x);
        } else if (input < x) {
            System.out.println("Sorry, you are too low.  I was thinking of " + x);
        } else {
            System.out.println("You guessed it!  What are the odds?!?");
        }

    }
}
