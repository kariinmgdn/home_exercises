package io.codelex.loops.practice;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Max value?");
        int maxValue = sc.nextInt();
        for (int i = 1; i <= maxValue; i++) {
            String x = Integer.toString(i);
            if (i % 3 == 0 && i % 5 == 0) {
                x = "FizzBuzz";
            } else if (i % 3 == 0) {
                x = "Fizz";
            } else if (i % 5 == 0) {
                x = "Buzz";
            }
            System.out.print(x + " ");
            if (i % 20 == 0) {
                System.out.print("\n");
            }
        }
    }
}
