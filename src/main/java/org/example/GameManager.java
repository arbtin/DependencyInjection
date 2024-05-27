package org.example;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class GameManager {

    private Playable player_one;
    private Playable player_two;

    public GameManager(Playable _player_one, Playable _player_two) {
        player_one = _player_one;
        player_two = _player_two;
    }
    public RoundResult PlayRound() {

        Choice player_1 = player_one.GetChoice();
        Choice player_2 = player_two.GetChoice();

        if(player_1 == player_2) {
            return RoundResult.Draw;
        }
        if(player_1 == Choice.Rock && player_2 == Choice.Scissors ||
                player_1 == Choice.Paper && player_2 == Choice.Rock ||
                player_1 == Choice.Scissors && player_2 == Choice.Paper) {
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
