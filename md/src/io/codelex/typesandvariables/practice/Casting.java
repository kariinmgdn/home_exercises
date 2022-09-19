package io.codelex.typesandvariables.practice;

public class Casting {
    public static void main(String[] args) {
        first();
        second();

    }

    private static void first() {
        String a = "1";
        int b = 2;
        int c = 3;
        double d = 4;
        float e = 5;

        int a1 = Integer.parseInt(a);

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

        double sum = a1 + b + c + d + e;
        System.out.println(Math.round(sum * 10.0) / 10.0);
    }
}
