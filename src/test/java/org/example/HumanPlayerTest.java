package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanPlayerTest {

    @Test
    public void RockBeatsScissors()
    {
        GameManager gm = new GameManager(new TestablePlayer(GameManager.Choice.Rock), new TestablePlayer(GameManager.Choice.Scissors));
        assertEquals(GameManager.RoundResult.PlayerOneWin, gm.PlayRound());
    }

    @Test
    public void ScissorsBeatsPaper()
    {
        GameManager gm = new GameManager(new TestablePlayer(GameManager.Choice.Scissors), new TestablePlayer(GameManager.Choice.Paper));
        assertEquals(GameManager.RoundResult.PlayerOneWin, gm.PlayRound());
    }

    @Test
    public void PaperBeatsRock()
    {
        GameManager gm = new GameManager(new TestablePlayer(GameManager.Choice.Paper), new TestablePlayer(GameManager.Choice.Rock));
        assertEquals(GameManager.RoundResult.PlayerOneWin, gm.PlayRound());
    }

    @Test
    public void Player2WinsWithRock()
    {
        GameManager gm = new GameManager(new TestablePlayer(GameManager.Choice.Scissors), new TestablePlayer(GameManager.Choice.Rock));
        assertEquals(GameManager.RoundResult.PlayerTwoWin, gm.PlayRound());
    }

    @Test
    public void Player2WinsWithScissors()
    {
        GameManager gm = new GameManager(new TestablePlayer(GameManager.Choice.Paper), new TestablePlayer(GameManager.Choice.Scissors));
        assertEquals(GameManager.RoundResult.PlayerTwoWin, gm.PlayRound());
    }

    @Test
    public void Player2WinsWithPaper()
    {
        GameManager gm = new GameManager(new TestablePlayer(GameManager.Choice.Rock), new TestablePlayer(GameManager.Choice.Paper));
        assertEquals(GameManager.RoundResult.PlayerTwoWin, gm.PlayRound());
    }

    @Test
    public void Draw()
    {
        GameManager gm = new GameManager(new TestablePlayer(GameManager.Choice.Rock), new TestablePlayer(GameManager.Choice.Rock));
        assertEquals(GameManager.RoundResult.Draw, gm.PlayRound());
    }
}