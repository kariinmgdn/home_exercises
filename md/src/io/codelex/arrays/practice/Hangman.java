package io.codelex.arrays.practice;

import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Random random = new Random();
        int r = random.nextInt(3 + 1);
        Scanner sc = new Scanner(System.in);

        String[] svtMembers = {"woozi", "mingyu", "vernon", "dk"};

        int count = 0;
        int correctLetters = 0;
        String incorrectLetters = "";

        String[] member = svtMembers[r].split("");
        String[] unknownWord = "_".repeat(member.length).split("");
        String fullName = "";
        for (int j = 0; j < unknownWord.length; j++) {
            fullName += unknownWord[j];
        }

        System.out.println(fullName);

        while (count <= member.length + 2) {
            fullName = "";
            String input = sc.nextLine();
            for (int i = 0; i < member.length; i++) {
                if (member[i].equals(input)) {
                    unknownWord[i] = input;
                    correctLetters++;
                }
                fullName += unknownWord[i];
            }

            if(correctLetters == member.length) {
                System.out.println(fullName);
                System.out.println("You guessed it!");
                break;
            }
            count++;
            System.out.println(fullName);

        }


    }
}
