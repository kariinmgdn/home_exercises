package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] charArr = input.toLowerCase().toCharArray();
        for (char c : charArr) {
            switch (c) {
                case 'a', 'b', 'c' -> System.out.print(2);
                case 'd', 'e', 'f' -> System.out.print(3);
                case 'g', 'h', 'i' -> System.out.print(4);
                case 'j', 'k', 'l' -> System.out.print(5);
                case 'm', 'n', 'o' -> System.out.print(6);
                case 'p', 'q', 'r', 's' -> System.out.print(7);
                case 't', 'u', 'v' -> System.out.print(8);
                case 'w', 'x', 'y', 'z' -> System.out.print(9);
                default -> System.out.print(" ");
            }
        }
        System.out.println();
        String x = input.replaceAll("[^a-zA-Z]", " ");
        for (char c : charArr) {
            if (x.matches("[A-Za-z ]+")) {
                if (c == 'a' || c == 'b' || c == 'c') {
                    System.out.print(2);
                } else if (c == 'd' || c == 'e' || c == 'f') {
                    System.out.print(3);
                } else if (c == 'g' || c == 'h' || c == 'i') {
                    System.out.print(4);
                } else if (c == 'j' || c == 'k' || c == 'l') {
                    System.out.print(5);
                } else if (c == 'm' || c == 'n' || c == 'o') {
                    System.out.print(6);
                } else if (c == 'p' || c == 'q' || c == 'r' || c == 's') {
                    System.out.print(7);
                } else if (c == 't' || c == 'u' || c == 'v') {
                    System.out.print(8);
                } else if (c == 'w' || c == 'x' || c == 'y' || c == 'z') {
                    System.out.print(9);
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}
