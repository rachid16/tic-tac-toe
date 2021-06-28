package com.pyramid;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static String[] table = new String[9];
    public static void main(String[] args) {
        String player = "X";
        System.out.println("Welcome to Tic-Tac-Toe!");
        System.out.println("Do you want to be X or O?");
        player = input.nextLine().toUpperCase();
        System.out.println("The computer will go first.");
        System.out.println("What is your next move? (1-9)");
        int nextMove = Integer.parseInt(input.nextLine());
        for (int i= 0; i<9; i++)
            table[i]=" ";

        if ((table[nextMove-1].equals("X")) || (table[nextMove-1].equals("O"))) {
            System.out.println("this number already token");
        }
        else {
            table[nextMove - 1] = player;
        }
        printBoard();





    }

    static void printBoard()
    {
        System.out.println("|---|---|---|");
        System.out.println("| " + table[6] + " | "
                + table[7] + " | " + table[8]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + table[3] + " | "
                + table[4] + " | " + table[5]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + table[0] + " | "
                + table[1] + " | " + table[2]
                + " |");
        System.out.println("|---|---|---|");
    }

    static boolean findWinner(String line) {

        if ((table[0] + table[1] + table[2]).equals(line))
            return true;
        else if ((table[3] + table[4] + table[5]).equals(line))
            return true;
        else if ((table[6] + table[7] + table[8]).equals(line))
            return true;
        else if ((table[0] + table[3] + table[6]).equals(line))
            return true;
        else if ((table[1] + table[4] + table[7]).equals(line))
            return true;
        else if ((table[2] + table[5] + table[8]).equals(line))
            return true;
        else if ((table[0] + table[4] + table[8]).equals(line))
            return true;
        else if ((table[2] + table[4] + table[6]).equals(line))
            return true;
        else
            return false;
    }
    static boolean promptTryAgain () {
        while (true) {
            System.out.print("Would you like to start a new game? (Y/N): ");
            String response = input.next();
            if (response.equalsIgnoreCase("y")) {
                return true;
            } else if (response.equalsIgnoreCase("n")) {
                return false;
            }
            System.out.println("Invalid input.");
        }
    }
}

