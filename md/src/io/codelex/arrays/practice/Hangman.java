package io.codelex.arrays.practice;

import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Random random = new Random();
        int r = random.nextInt(3 - 0 + 1);
        Scanner sc = new Scanner(System.in);

        String[] svtMembers = {"woozi", "mingyu", "vernon", "dk"};

        int count = 0;

        String[] member = svtMembers[r].split("");
        String[] word = "_".repeat(member.length).split("");
        String res = "";
        for (int j = 0; j < word.length; j++) {
            res += word[j];
        }
        System.out.println(res);
        while (count <= member.length + 2) {
            res = "";
            String letter = sc.nextLine();
            for (int i = 0; i < member.length; i++) {
                if (member[i].equals(letter)) {
                    word[i] = letter;
                }
                res += word[i];
            }
            count++;
            System.out.println(res);
        }


    }
}
