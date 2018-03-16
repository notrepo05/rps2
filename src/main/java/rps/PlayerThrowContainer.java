package rps;

public class PlayerThrowContainer {

    GameLogicThing gameLogicThing = new GameLogicThing();

    private PlayerThrow gameElement;

    public PlayerThrowContainer(PlayerThrow gameElement) {
        this.gameElement = gameElement;
    }

    public PlayerThrow getThrow(){
        return this.gameElement;
    }

    public boolean beats(PlayerThrowContainer p2) {
        return gameLogicThing.beats(this, p2);
    }

    public boolean draws(PlayerThrowContainer p2) {
        return gameLogicThing.draws(this, p2);
    }

}
