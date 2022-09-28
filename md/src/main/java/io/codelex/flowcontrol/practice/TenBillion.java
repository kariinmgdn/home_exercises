package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class TenBillion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number less than ten billion: ");

        long number = in.nextLong();

        if (number < 0) {
            number *= -1;
        }

        if (number >= 10000000000L) {
            System.out.println("Number is greater or equals 10,000,000,000!");
        } else {
            int digits = 1;
            if (number < 100) {
                digits = 2;
            } else if (number < 1000) {
                digits = 3;
            } else if (number < 10000) {
                digits = 4;
            } else if (number < 100000) {
                digits = 5;
            } else if (number < 1000000) {
                digits = 6;
            } else if (number < 10000000) {
                digits = 7;
            } else if (number < 100000000) {
                digits = 8;
            } else if (number < 1000000000) {
                digits = 9;
            }
            System.out.println("Number of digits in the number: " + digits);

    }

}

}
