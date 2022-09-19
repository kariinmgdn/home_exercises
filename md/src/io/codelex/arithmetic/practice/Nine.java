package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter weight:");
        double weight = sc.nextDouble();
        System.out.println("Enter height:");
        double height = sc.nextDouble();
        double inches = height / 100 * 39.37;
        double bmi = weight * 2.205 * 703 / Math.pow(inches, 2);
        if (bmi < 18.5) {
            System.out.println("underweight");
        } else if (bmi > 25) {
            System.out.println("overweight");
        } else {
            System.out.println("optimal weight");
        }
    }
}
