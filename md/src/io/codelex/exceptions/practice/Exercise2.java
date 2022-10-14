package io.codelex.exceptions.practice;

public class Exercise2 {
    public static void main(String[] args) {
        methodA();
    }
    public static void methodA() throws ArithmeticException {
        try {
            methodB();
        } catch (ArithmeticException e) {
            System.out.println(3);
        }

    }

    public static void methodB() throws ArithmeticException {
        try {
            methodC();
        } catch (ArithmeticException e) {
            System.out.println(2);
        }

    }

    public static void methodC() throws ArithmeticException {
        try {
            int a = 1/0;
        } catch (ArithmeticException e) {
            System.out.println(1);
        }

    }
}
