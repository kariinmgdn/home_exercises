package io.codelex.arithmetic.practice;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        int lowerBound = 30;
        int upperBound = 100;

        for (int number = lowerBound; number <= upperBound; number++) {
            sum += number;
        }
        average = sum / (double) (upperBound - lowerBound + 1);
        System.out.println("The sum of " + lowerBound + " to " + upperBound + " is " + sum);
        System.out.printf("The average is " + average);


    }
}
