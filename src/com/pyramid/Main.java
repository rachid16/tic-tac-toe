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

        if ((table[nextMove-1].equals("X")) || (table[nextMove-1].equals("X"))) {
            System.out.println("this number already token");
        }
        else {
            table[nextMove - 1] = player;
        }

         




    }
}

