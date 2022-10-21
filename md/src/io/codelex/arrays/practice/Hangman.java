package io.codelex.arrays.practice;

import java.util.Random;
import java.util.Scanner;

public class Hangman {
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        game();
    }

    private static void game() {
        Random random = new Random();
        int randomInt = random.nextInt(12 + 1);
        String[] svtMembers = {"woozi", "mingyu", "vernon", "dk", "scoups", "jeonghan", "joshua", "jun",
                "hoshi", "wonwoo", "the8", "seungkwan", "dino"};

        StringBuilder incorrectLetters = new StringBuilder();
        String[] memberArr = svtMembers[randomInt].split("");
        String word = "_".repeat(memberArr.length);
        String[] unknownWord = word.split("");
        System.out.println(word);
        int count = 0;


        while (count < 5) {
            boolean guessedAtLeastOne = false;
            String input = SC.nextLine().toLowerCase();
            StringBuilder fullName = new StringBuilder();
            for (int i = 0; i < memberArr.length; i++) {
                if (input.equals(memberArr[i])) {
                    unknownWord[i] = input;
                    fullName.append(input);
                    guessedAtLeastOne = true;
                } else if (!unknownWord[i].contains("_")) {
                    fullName.append(unknownWord[i]);
                } else {
                    fullName.append("_");
                }
            }
            if (!guessedAtLeastOne) {
                count++;
                incorrectLetters.append(input);
            }
            System.out.println(incorrectLetters);
            System.out.println(fullName);

            if (fullName.toString().equals(svtMembers[randomInt])) {
                System.out.println("You guessed it!");
                playAgain();
            } else if (count == 5) {
                System.out.println("You lost!");
                playAgain();
            }
        }
    }

    private static void playAgain() {
        System.out.println("Play again? Y/N");
        String yesNo = SC.nextLine().toUpperCase();
        if (yesNo.equals("Y")) {
            game();
        } else {
            System.out.println("Bye!");
            System.exit(0);
        }
    }
}
