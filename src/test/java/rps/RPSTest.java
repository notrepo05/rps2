package rps;

import org.junit.Test;

import static org.junit.Assert.*;

public class RPSTest {

    @Test
    public void givenP1PaperAndP2Rock_player1ShouldWin() {
        PlayerThrowContainer p1 = new PlayerThrowContainer(PlayerThrow.PAPER);
        PlayerThrowContainer p2 = new PlayerThrowContainer(PlayerThrow.ROCK);
        RoundWinner winner = (new RPS()).play(p1, p2);
        assertEquals(winner, RoundWinner.PLAYER1);
    }

    @Test
    public void givenP1RockAndP2Paper_player2ShouldWin() {
        PlayerThrowContainer p1 = new PlayerThrowContainer(PlayerThrow.ROCK);
        PlayerThrowContainer p2 = new PlayerThrowContainer(PlayerThrow.PAPER);
        RoundWinner winner = (new RPS()).play(p1, p2);
        assertEquals(winner, RoundWinner.PLAYER2);
    }

    @Test
    public void givenP1RockAndP2Rock_shouldBeDraw() {
        PlayerThrowContainer p1 = new PlayerThrowContainer(PlayerThrow.ROCK);
        PlayerThrowContainer p2 = new PlayerThrowContainer(PlayerThrow.ROCK);
        RoundWinner winner = (new RPS()).play(p1, p2);
        assertEquals(winner, RoundWinner.DRAW);
    }

}