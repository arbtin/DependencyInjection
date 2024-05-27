package org.example;

import com.sun.management.GarbageCollectionNotificationInfo;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome to Rock, Paper, Scissors!");

        GameManager gameManager = new GameManager(new HumanPlayer(), new ComputerPlayer());
        Scanner scanner = new Scanner(System.in);
        do {
            GameManager.RoundResult result = gameManager.PlayRound();

            if(result == GameManager.RoundResult.PlayerOneWin) {
                System.out.println("Player one wins!");
            }
            else if (result == GameManager.RoundResult.PlayerTwoWin) {
                System.out.println("Player two wins!");
            }
            else {
                System.out.println("Game is a draw!");
            }

            System.out.println("Player again (Y/N)? ");
        } while (scanner.nextLine().toUpperCase().equals("Y"));
    }
}