package io.codelex.arithmetic;

public class CozaLozaWoza {
    public static void main(String[] args) {
        for(int i = 0; i <= 109; i++) {
            if (i % 11 == 0) {
                System.out.print("\n");
            }
            String x = Integer.toString(i + 1);
            if ((i + 1) % 3 == 0) {
                x = "Coza";
            } else if ((i + 1) % 5 == 0) {
               x = "Loza";
            } else if ((i + 1) % 7 == 0) {
                x = "Woza";
            }
            System.out.print(x + " ");
    }
}}
