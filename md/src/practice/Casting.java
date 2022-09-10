package io.codelex.practice;

import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        first();
        second();
        me();
        table();
        six();
        seven();
        eight();
        nine();

    }
    private static void nine() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input distance in meters: ");
        int meters = sc.nextInt();
        System.out.print("Input hours: ");
        int hours = sc.nextInt();
        System.out.print("Input minutes: ");
        int minutes = sc.nextInt();
        System.out.print("Input seconds: ");
        int seconds = sc.nextInt();
        double sec = hours*3600+minutes*60+seconds;
        double h = sec/3600;
        double mS = Math.round(meters/sec*100000000d)/100000000d;
        System.out.println("Your speed in meters/second is " + mS);
        double km = meters/1000d;
        double kmH = Math.round(km/h*100000000d)/100000000d;
        System.out.println("Your speed in km/h is " + kmH);
        double miles = meters/1609d;
        double milesH = Math.round(miles/h*100000000d)/100000000d;
        System.out.println("Your speed in miles/h is " + milesH);


    }

    private static void eight() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Minutes: ");
        long minutes = sc.nextLong();
        while (minutes<0) {
            System.out.println("Enter 0 or a positive number");
            minutes = sc.nextLong();
        }
        long years = minutes/525600;
        long days = (minutes - years*525600)/1440;

        System.out.println(minutes + " minutes = " + years + " years and " + days + " days");


    }

    private static  void seven() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int num = 0;
        char[] arr = new char[input.length()];
        for(int i = 0; i<input.length();i++){
            arr[i] = input.charAt(i);
            if (Character.isUpperCase(arr[i])) {
                num++;
            }
        }
        System.out.println(num);
    }

    private static void six() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a single digit number:");
        int inputA = scanner.nextInt();
        while (inputA>9 || inputA<-9) {
            System.out.println(inputA + " is not a single digit number");
            inputA = scanner.nextInt();
        }

        System.out.println("Enter next single digit number:");
        int inputB = scanner.nextInt();
        while (inputB>9 || inputB<-9) {
            System.out.println(inputB + " is not a single digit number");
            inputB = scanner.nextInt();
        }

        System.out.println("Enter next single digit number:");
        int inputC = scanner.nextInt();
        while (inputC>9 || inputC<-9) {
            System.out.println(inputC + " is not a single digit number");
            inputC = scanner.nextInt();
        }
        int sum = inputA + inputB + inputC;
        System.out.println("Sum = " + sum);

    }

    private  static void  table() {
        String line = "+" + "-".repeat(50) + "+";
        String course1 = "English III", course2 = "Precalculus", course3 = "Music Theory", course4 = "Biotechnology",
                course5 = "Principles of Technology I", course6 = "Latin II", course7 = "AP US History", course8 = "Business Systems",courses = "";
        String teacher1 = "Ms. Lapan", teacher2 = "Mrs. Gideon", teacher3 = "Mr. Davis", teacher4 = "Ms. Palmer",
                teacher5 = "Ms. Garcia", teacher6 = "Mrs. Barnett", teacher7 = "Ms. Johannessen", teacher8 = "Mr. James", teachers = "";
        System.out.println(line);

        for(int i = 1; i<9; i++) {
            switch (i) {
                case 1 -> {
                    courses = " ".repeat(27 - course1.length()) + course1;
                    teachers = " ".repeat(16 - teacher1.length()) + teacher1;
                }
                case 2 -> {
                    courses = " ".repeat(27 - course2.length()) + course2;
                    teachers = " ".repeat(16 - teacher2.length()) + teacher2;
                }
                case 3 -> {
                    courses = " ".repeat(27 - course3.length()) + course3;
                    teachers = " ".repeat(16 - teacher3.length()) + teacher3;
                }
                case 4 -> {
                    courses = " ".repeat(27 - course4.length()) + course4;
                    teachers = " ".repeat(16 - teacher4.length()) + teacher4;
                }
                case 5 -> {
                    courses = " ".repeat(27 - course5.length()) + course5;
                    teachers = " ".repeat(16 - teacher5.length()) + teacher5;
                }
                case 6 -> {
                    courses = " ".repeat(27 - course6.length()) + course6;
                    teachers = " ".repeat(16 - teacher6.length()) + teacher6;
                }
                case 7 -> {
                    courses = " ".repeat(27 - course7.length()) + course7;
                    teachers = " ".repeat(16 - teacher7.length()) + teacher7;
                }
                case 8 -> {
                    courses = " ".repeat(27 - course8.length()) + course8;
                    teachers = " ".repeat(16 - teacher8.length()) + teacher8;
                }
            }
            System.out.println("| " + i + " |" + courses + " |" + teachers + " |");
        }
        System.out.println(line);
    }

    private static void me() {
        String name = "Karina Margarita Dzene";
        int yearOfBirth = 2000;
        System.out.println("My name is " +name + " and I was born in " + yearOfBirth+ ".");
    }

    private static void first() {
        String a = "1";
        int b = 2;
        int c = 3;
        double d = 4;
        float e = 5;

        int a1 = Integer.parseInt(a);

        //fixme - should be 15 :| 
        double sum = a1 + b + c + d + e;
        System.out.println(Math.round(sum));
    }

    private static void second() {
        String a = "1";
        int b = 2;
        int c = 3;
        double d = 4.2;
        float e = 5.3f;

        int a1 = Integer.parseInt(a);

        //fixme - should be 15.5 :| 
        double sum = a1 + b + c + d + e;
        System.out.println(Math.round(sum*10.0)/10.0);
    }
}
