package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Desired sum: ");
        int input = sc.nextInt();
        while (input < 1 || input > 12) {
            System.out.print("Try again: ");
            input = sc.nextInt();
        }
        while (true) {
            int random1 = rollDice();
            int random2 = rollDice();
            int sum = random1 + random2;
            System.out.println(random1 + " and " + random2 + " = " + sum);
            if (sum == input) {
                break;

            }
        }
    }
    private static int rollDice() {
        Random r = new Random();
        return r.nextInt(6) + 1;
    }
}
