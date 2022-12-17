package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {

        String name = "Zed A. Shaw";
        int age = 35;
        int height = 74;  // inches
        int weight = 180; // lbs
        String eyes = "Blue";
        String teeth = "White";
        String hair = "Brown";

        double inchesToM = (double) Math.round(height * 2.54) / 100;
        double lbsToKg = (double) Math.round(weight * 0.453592 * 100) / 100;

        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's " + inchesToM + " m tall.");
        System.out.println("He's " + lbsToKg + " kg heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.println("If I add " + age + ", " + height + ", and " + weight
                + " I get " + (age + height + weight) + ".");
    }
}