package org.example;

import java.util.Random;

public class ComputerPlayer implements Playable {
    public static GameManager.Choice Choice;

    public GameManager.Choice GetChoice() {
        GameManager.Choice player_two = GameManager.Choice.values()[new Random().nextInt(GameManager.Choice.values().length)];
        System.out.println("Player 2 picked " + player_two.toString());
        return player_two;
    }
}
