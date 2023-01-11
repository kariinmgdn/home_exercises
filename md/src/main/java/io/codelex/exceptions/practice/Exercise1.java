package main.java.io.codelex.exceptions.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String a = "";

            try {
                System.out.println("Enter the numerator");
                a = scanner.nextLine();
                int numerator = Integer.parseInt(a);
                System.out.println("Enter the divisor");
                int divisor = Integer.parseInt(scanner.nextLine());

                try {
                    System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);
                } catch (ArithmeticException e) {
                    System.out.println("You can't divide by 0");
                }
            } catch (NumberFormatException e) {
                if (a.charAt(0) == 'q' || a.charAt(0) == 'Q') {
                    break;
                }
                System.out.println("You entered bad data.\nPlease try again.");
            }
        }
    }
}
