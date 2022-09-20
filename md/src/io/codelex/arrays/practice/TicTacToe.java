package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];

    public static void main(String[] args) {

        initBoard();
        displayBoard();
        game();

    }

    public static void game() {
        Scanner keyboard = new Scanner(System.in);
        int i = 0;
        while (i <= 4) {
            System.out.print("'O', choose your location (row, column): ");
            moveO(keyboard.nextInt(), keyboard.nextInt());
            displayBoard();
            if (isWinnerO()) {
                break;
            } else if (i == 4) {
                System.out.println("The game is a tie.");
                break;
            }
            System.out.print("'X', choose your location (row, column): ");
            moveX(keyboard.nextInt(), keyboard.nextInt());
            displayBoard();
            if (isWinnerX()) {
                break;
            }
            i++;
        }
    }

    public static boolean isWinnerX() {
        if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X' ||
                board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X' ||
                board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X' ||
                board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X' ||
                board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X' ||
                board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X' ||
                board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X' ||
                board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
            System.out.println("X won!");
            return true;
        }
        return false;
    }

    public static boolean isWinnerO() {
        if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O' ||
                board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O' ||
                board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O' ||
                board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O' ||
                board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O' ||
                board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O' ||
                board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O' ||
                board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
            System.out.println("O won!");
            return true;
        }
        return false;
    }

    public static char moveO(int x, int y) {
        while (board[x][y] != ' ') {
            System.out.print("Try again: ");
            Scanner keyboard = new Scanner(System.in);
            x = keyboard.nextInt();
            y = keyboard.nextInt();
        }
        board[x][y] = 'O';
        return board[x][y];
    }

    public static char moveX(int x, int y) {
        while (board[x][y] != ' ') {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Try again: ");
            x = keyboard.nextInt();
            y = keyboard.nextInt();
        }
        board[x][y] = 'X';
        return board[x][y];
    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }
}