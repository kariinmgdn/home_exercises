package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int num = 0;
        char[] arr = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            arr[i] = input.charAt(i);
            if (Character.isUpperCase(arr[i])) {
                num++;
            }
        }
        System.out.println(num);
    }
}
