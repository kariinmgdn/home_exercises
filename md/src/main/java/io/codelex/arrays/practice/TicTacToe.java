package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static final char[][] board = new char[3][3];

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
            move(keyboard.nextInt(), keyboard.nextInt(), 'O');
            displayBoard();
            if (isWinner('O')) {
                break;
            } else if (i == 4) {
                System.out.println("The game is a tie.");
                break;
            }
            System.out.print("'X', choose your location (row, column): ");
            move(keyboard.nextInt(), keyboard.nextInt(), 'X');
            displayBoard();
            if (isWinner('X')) {
                break;
            }
            i++;
        }
    }

    private static boolean isWinner(char xOrO) {
        if (board[0][0] == xOrO && board[0][1] == xOrO && board[0][2] == xOrO
                || board[1][0] == xOrO && board[1][1] == xOrO && board[1][2] == xOrO
                || board[2][0] == xOrO && board[2][1] == xOrO && board[2][2] == xOrO
                || board[0][0] == xOrO && board[1][0] == xOrO && board[2][0] == xOrO
                || board[0][1] == xOrO && board[1][1] == xOrO && board[2][1] == xOrO
                || board[0][2] == xOrO && board[1][2] == xOrO && board[2][2] == xOrO
                || board[0][0] == xOrO && board[1][1] == xOrO && board[2][2] == xOrO
                || board[0][2] == xOrO && board[1][1] == xOrO && board[2][0] == xOrO) {
            System.out.println(xOrO + " won!");
            return true;
        }
        return false;
    }

    private static void move(int x, int y, char xOrO) {
        while (board[x][y] != ' ') {
            System.out.print("Try again: ");
            Scanner keyboard = new Scanner(System.in);
            x = keyboard.nextInt();
            y = keyboard.nextInt();
        }
        board[x][y] = xOrO;
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