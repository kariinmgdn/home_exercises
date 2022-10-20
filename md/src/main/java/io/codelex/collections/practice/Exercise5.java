package main.java.io.codelex.collections.practice;

import java.util.Scanner;

public class Exercise5 {
    static Scanner sc = new Scanner(System.in);
    static int number;
    static int c;
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        number = sc.nextInt();
        System.out.println(number + isHappyNumber());
        System.out.println(c);
    }

    private static String isHappyNumber() {
        while (number != 1 && number != 4) {
            number = happyNumber(number);
            c++;
        }
        if (number == 1) {
            return " is happy";
        }
        return " is not happy";
    }

    private static int happyNumber(int num) {
        int sum = 0;
        int rem;

        while (num > 0) {
            rem = num % 10;
            sum += rem * rem;
            num /= 10;
        }

        return sum;
    }

}
