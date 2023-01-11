package main.java.io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {

    public static void main(String[] args) {
        add();
    }

    private static void add() {
        Scanner sc = new Scanner(System.in);
        String element;
        Set<String> stringSet = new HashSet<>();
        while (true) {
            System.out.print("Enter name: ");
            element = sc.nextLine();
            if (element.equals("")) {
                System.out.print("Unique name list contains:");
                for (String name : stringSet) {
                    System.out.print(" " + name);
                }
                break;
            }
            stringSet.add(element);
        }
    }
}
