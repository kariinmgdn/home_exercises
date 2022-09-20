package io.codelex.arrays.practice;

public class Exercise5 {

    public static void main(String[] args) {
        int[] myArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 36) {
                System.out.println("Index position of 36 is: " + i);
            } else if (myArray[i] == 29) {
                System.out.println("Index position of 29 is: " + i);
            }
        }
    }
}
