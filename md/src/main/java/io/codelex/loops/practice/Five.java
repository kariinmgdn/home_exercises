package io.codelex.loops.practice;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first word:");
        String word1 = sc.nextLine();
        System.out.println("Enter second word:");
        String word2 = sc.nextLine();
        System.out.print(word1);
        for (int i = 0; i < 30 - word1.length() - word2.length(); i++) {
            System.out.print(".");
        }
        System.out.println(word2);

    }
}
