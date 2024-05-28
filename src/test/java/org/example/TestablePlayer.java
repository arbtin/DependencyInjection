package org.example;

import org.example.GameManager.Choice;

public class TestablePlayer implements Playable {
    private Choice _choice;

    public TestablePlayer(GameManager.Choice choice) {
        _choice = choice;
    }
    public GameManager.Choice GetChoice() {
        return _choice;
    }
}
