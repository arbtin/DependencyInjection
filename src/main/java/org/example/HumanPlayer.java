package org.example;

import java.util.Scanner;

public class HumanPlayer implements Playable {

    public GameManager.Choice GetChoice() {

        GameManager.Choice player_one;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Choice: (R)ock, (P)aper, or (S)cissors: ");
            String input = scanner.nextLine().toUpperCase();

            if(input.equals("R")) {
                player_one = GameManager.Choice.Rock;
                break;
            }
            else if (input.equals("P")) {
                player_one = GameManager.Choice.Paper;
                break;
            }
            else if (input.equals("S")) {
                player_one = GameManager.Choice.Scissors;
                break;
            }
            else {
                System.out.println("Choice not recognized, please try again.");
            }
        } while (true);

        return player_one;
    }
}
