package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a single digit number:");
        int inputA = scanner.nextInt();
        while (inputA > 9 || inputA < -9) {
            System.out.println(inputA + " is not a single digit number");
            inputA = scanner.nextInt();
        }
        System.out.println("Enter next single digit number:");
        int inputB = scanner.nextInt();
        while (inputB > 9 || inputB < -9) {
            System.out.println(inputB + " is not a single digit number");
            inputB = scanner.nextInt();
        }

        System.out.println("Enter next single digit number:");
        int inputC = scanner.nextInt();
        while (inputC > 9 || inputC < -9) {
            System.out.println(inputC + " is not a single digit number");
            inputC = scanner.nextInt();
        }
        int sum = inputA + inputB + inputC;
        System.out.println("Sum = " + sum);
    }
}
