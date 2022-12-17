package io.codelex.arrays.practice;

import java.util.Arrays;

public class Exercise1 {

    //TODO: Write a Java program to sort a numeric array and a string array.
    public static void main(String[] args) {

        Integer[] myArray1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456
        };

        String[] myArray2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };


        System.out.println("Original numeric array : ");
        array(myArray1);

        System.out.println("\n");
        Arrays.sort(myArray1);
        System.out.println("Sorted numeric array : ");
        array(myArray1);

        System.out.println("\n");

        System.out.println("Original string array : ");
        array(myArray2);

        System.out.println("\n");
        Arrays.sort(myArray2);
        System.out.println("Sorted string array : ");
        array(myArray2);

    }

    private static <T> void array(T[] array) {
        for (T item : array) {
            System.out.print(item + " ");
        }
    }
}
