package sm2k4.greatTTT.controllers;

import sm2k4.greatTTT.exceptions.InvalidMoveException;
import sm2k4.greatTTT.models.Game;
import sm2k4.greatTTT.models.GameState;
import sm2k4.greatTTT.models.Player;
import java.util.List;

public class TTTController {
    public Game startGame(int size, List<Player> players) {
        return new Game(size, players);
    }

    public void makeMove(Game game) throws InvalidMoveException {
        game.makeMove();
    }

    public GameState checkState(Game game) {
        return game.getGameState();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void printBoard(Game game) {
        game.printBoard();
    }
}
