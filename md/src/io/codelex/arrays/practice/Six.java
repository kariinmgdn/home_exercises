package io.codelex.arrays.practice;

import java.util.Random;

public class Six {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array1 = new int[10];

        for (int k = 0; k < array1.length; k++) {
            array1[k] = random.nextInt(100 - 1 + 1) + 1;
        }

        int[] array2 = array1;
        System.out.print("Array 1: ");
        for (int i = 0; i < array1.length; i++) {
            if (i == 9) {
                System.out.print(-7);
            } else {
                System.out.print(array1[i] + " ");
            }
        }

        System.out.print("\nArray 2: ");
        for (int j = 0; j < array2.length; j++) {
            System.out.print(array2[j] + " ");
        }
    }
}
