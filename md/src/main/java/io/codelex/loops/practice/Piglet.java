package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int points = 0;
        System.out.println("Welcome to Piglet!");

         while (true){
             Random r = new Random();
             int random = r.nextInt(10) + 1;
             System.out.println("You rolled a " + random);
             if (random == 1) {
                 System.out.println("You got 0 points.");
                 break;
             }
            points += random;
            System.out.print("Roll again? ");
            String yesNo = sc.nextLine().toLowerCase();
            if (yesNo.equals("no")) {
                System.out.println("You got " + points + " points!");
                break;
            }
         }




    }
}
