package io.codelex.arithmetic.practice;

public class CozaLozaWoza {
    public static void main(String[] args) {
        for (int i = 1; i <= 110; i++) {
            String x = "";
            if ((i) % 3 == 0) {
                x += "Coza";
            }
            if ((i) % 5 == 0) {
                x += "Loza";
            }
            if ((i) % 7 == 0) {
                x += "Woza";
            }

            if (x.equals("")) {
                System.out.print(i + " ");
            } else {
                System.out.print(x + " ");
            }

            if (i % 11 == 0) {
                System.out.println();
            }
        }
    }
}
