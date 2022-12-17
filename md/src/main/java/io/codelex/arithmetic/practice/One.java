package io.codelex.arithmetic.practice;


import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x == 15 || y == 15 || x + y == 15 || x - y == 15 || y - x == 15) {
            System.out.println(true);
        } else {
            System.out.print(false);
        }
    }
}
