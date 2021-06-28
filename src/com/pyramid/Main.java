package com.pyramid;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer> toUse = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static String[] table = new String[9];
    public static void main(String[] args) {
        String winner ="";
        String player = "X";
        System.out.println("Welcome to Tic-Tac-Toe!");
        toUse.addAll(table);
        do {
            System.out.println("Do you want to be X or O?");
            player = input.nextLine().toUpperCase();
            System.out.println("The computer will go first.");

            for (int i= 0; i<9; i++)
                table[i]=" ";

            while(winner.equals("")){

                System.out.println("What is your next move? (1-9)");
                int nextMove = Integer.parseInt(input.nextLine());

                if ((table[nextMove-1].equals("X")) || (table[nextMove-1].equals("O"))) {
                    System.out.println("this number already token");
                }
                else {
                    table[nextMove - 1] = player;
                }
                printBoard();
                if(findWinner("XXX"))
                    winner = "X";
                else if(findWinner("OOO"))
                    winner = "O";
                else
                    winner ="";
            }
            if(winner.equals("X") && player.equals("X"))
                System.out.println("you have beaten the computer! You won.");
            else
                System.out.println("The computer has beaten you! You lose.");
        }while (promptTryAgain());




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
            System.out.print("Do you want to play again? (yes or no)");
            String response = input.next();
            if (response.equalsIgnoreCase("yes")) {
                return true;
            } else if (response.equalsIgnoreCase("no")) {
                return false;
            }
            System.out.println("Invalid input.");
        }
    }

    static void computerTurn(){

    }
}

