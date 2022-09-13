package io.codelex.loops.practice;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Max value?");
        int maxValue = sc.nextInt();
        for(int i = 0; i < maxValue; i++) {
            if (i % 20 == 0) {
                System.out.print("\n");
            }
            String x = Integer.toString(i + 1);
            if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) {
                x = "FizzBuzz";
            }else if ((i + 1) % 3 == 0) {
                x = "Fizz";
            }else if ((i + 1) % 5 == 0) {
                x = "Buzz";
            }
            System.out.print(x + " ");
        }
    }
}
