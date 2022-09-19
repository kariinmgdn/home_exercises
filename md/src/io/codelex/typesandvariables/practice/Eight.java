package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Minutes: ");
        long minutes = sc.nextLong();
        while (minutes < 0) {
            System.out.println("Enter 0 or a positive number");
            minutes = sc.nextLong();
        }
        long years = minutes / 525600;
        long days = (minutes - years * 525600) / 1440;

        System.out.println(minutes + " minutes = " + years + " years and " + days + " days");
    }
}
