package controller;

import exceptions.InvalidMoveException;
import models.Game;
import models.GameState;
import models.Player;
import java.util.List;

public class Controller {
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
