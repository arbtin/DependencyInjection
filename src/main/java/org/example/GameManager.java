package org.example;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class GameManager {

    Random random_number = new Random();

    public RoundResult PlayRound() {
        Choice player_one;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Choice: (R)ock, (P)aper, or (S)cissors: ");
            String input = scanner.nextLine().toUpperCase();

            if(input.equals("R")) {
                player_one = Choice.Rock;
                break;
            }
            else if (input.equals("P")) {
                player_one = Choice.Paper;
                break;
            }
            else if (input.equals("S")) {
                player_one = Choice.Scissors;
                break;
            }
            else {
                System.out.println("Choice not recognized, please try again.");
            }
        } while (true);

        Choice player_two = Choice.values()[new Random().nextInt(Choice.values().length)];
        System.out.println("Player 2 picked " + player_two.toString());

        if(player_one == player_two) {
            return RoundResult.Draw;
        }
        if(player_one == Choice.Rock && player_two == Choice.Scissors ||
                player_one == Choice.Paper && player_two == Choice.Rock ||
                player_one == Choice.Scissors && player_two == Choice.Paper) {
            return RoundResult.PlayerOneWin;
        }
        return RoundResult.PlayerTwoWin;
    }

    enum Choice
    {
        Rock,
        Paper,
        Scissors
    }

    enum RoundResult
    {
        PlayerOneWin,
        PlayerTwoWin,
        Draw
    }


}
