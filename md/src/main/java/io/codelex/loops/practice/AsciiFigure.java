package io.codelex.loops.practice;

public class AsciiFigure {

    public static final int N = 7;

    public static void main(String[] args) {
        int lines = (N-1)*4;

        for (int i = 0; i < N; i++) {
            String line = "";
            for (int j = 0; j < lines - i*4; j++) {
                line += "/";
            }

            for (int k = 0; k <= i ; k++) {
                if ( k == 0) {
                    line += "";
                }else {
                    line += "********";
                }
            }
            for (int l = 0; l < lines - i*4; l++) {
                line += "\\";
            }
            System.out.println(line);
        }
    }
}
