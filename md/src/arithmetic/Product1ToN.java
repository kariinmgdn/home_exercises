package io.codelex.arithmetic;

public class Product1ToN {
    public static void main(String[] args) {
        int res = 1;
        for (int i = 1; i<=10; i++) {
            res *= i;
        }
        System.out.println(res);
    }

}
