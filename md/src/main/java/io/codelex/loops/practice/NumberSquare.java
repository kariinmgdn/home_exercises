package io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("min: ");
        int min = sc.nextInt();
        System.out.print("max: ");
        int max = sc.nextInt();
        int min2 = min;
        while (min <= max) {
            String numbers = "";
            for (int i = min; i <= max; i++) {
                numbers += i + " ";
            }
            for (int j = min2; j <= max; j++) {
                numbers += j + " ";
            }
            String a = "";
            String[] num = numbers.split(" ");
            for (int k = 0; k < max - min2 + 1; k++) {
                a += num[k];
            }
            System.out.println(a);

            min++;
        }

    }
}
