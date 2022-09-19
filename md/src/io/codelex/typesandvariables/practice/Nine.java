package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input distance in meters: ");
        int meters = sc.nextInt();
        System.out.print("Input hours: ");
        int hours = sc.nextInt();
        System.out.print("Input minutes: ");
        int minutes = sc.nextInt();
        System.out.print("Input seconds: ");
        int seconds = sc.nextInt();
        double sec = hours * 3600 + minutes * 60 + seconds;
        double h = sec / 3600;
        double mS = Math.round(meters / sec * Math.pow(10, 8)) / Math.pow(10, 8);
        System.out.println("Your speed in meters/second is " + mS);
        double km = meters / 1000d;
        double kmH = Math.round(km / h * Math.pow(10, 8)) / Math.pow(10, 8);
        System.out.println("Your speed in km/h is " + kmH);
        double miles = meters / 1609d;
        double milesH = Math.round(miles / h * Math.pow(10, 8)) / Math.pow(10, 8);
        System.out.println("Your speed in miles/h is " + milesH);
    }
}
