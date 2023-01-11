package main.java.io.codelex.enums.practice;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
    private static RPS player;
    private static RPS pc;
    private static int playerWins = 0;
    private static int pcWins = 0;
    private static int games = 0;

    public static void main(String[] args) {
        game();
    }

    private static void game() {
        System.out.println("Let us begin...");
        while (true) {

            playerChoice();
            pcChoice();

            if (player == pc) {
                System.out.println("Tie!");
            } else if (player == RPS.ROCK && pc == RPS.SCISSORS || player == RPS.PAPER && pc == RPS.ROCK ||
                    player == RPS.SCISSORS && pc == RPS.PAPER) {
                playerWins++;
                System.out.println("You won!");
            } else {
                pcWins++;
                System.out.println("I won!");
            }
            games++;
        }
    }

    private static void playerChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your turn (Enter s for scissor, p for paper, r for stone, q to quit): ");
        String input = sc.nextLine();

        while (!input.equals("s") && !input.equals("p") && !input.equals("r") && !input.equals("q")) {
            System.out.print("Invalid input, try again...\n" +
                    "Your turn (Enter s for scissor, p for paper, t for stone, q to quit): ");
            input = sc.nextLine();
        }
        switch (input) {
            case "s" -> player = RPS.SCISSORS;
            case "p" -> player = RPS.PAPER;
            case "r" -> player = RPS.ROCK;
            case "q" -> {
                int pcPercent = pcWins*100/games;
                int playerPercent = playerWins*100/games;
                System.out.println("Number of trials: " + games);
                System.out.println("I won " + pcWins + "(" + pcPercent +"%) You won " + playerWins + "(" + playerPercent + "%)\n" +
                        "Bye!");
                System.exit(0);
            }
        }
    }

    private static void pcChoice() {
        Random r = new Random();
        int random = r.nextInt(3);

        switch (random) {
            case 0 -> pc = RPS.SCISSORS;
            case 1 -> pc = RPS.PAPER;
            case 2 -> pc = RPS.ROCK;
        }
        System.out.println("My turn: " + pc);
    }
}
