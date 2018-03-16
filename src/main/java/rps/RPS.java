package rps;

public class RPS{
    public RoundWinner play(PlayerThrowContainer p1, PlayerThrowContainer p2){
        if (p1.draws(p2)) {
            return RoundWinner.DRAW;
        }
        if (p1.beats(p2)) {
            return RoundWinner.PLAYER1;
        }
        return RoundWinner.PLAYER2;
    }
}
