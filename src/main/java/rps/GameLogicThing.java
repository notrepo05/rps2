package rps;

class GameLogicThing {
    public boolean beats(PlayerThrowContainer p1, PlayerThrowContainer p2) {
       return p1.getThrow().equals(PlayerThrow.PAPER) && p2.getThrow().equals(PlayerThrow.ROCK);
    }

    public boolean draws(PlayerThrowContainer p1, PlayerThrowContainer p2) {
        return p1.getThrow().equals(p2.getThrow());
    }
}
