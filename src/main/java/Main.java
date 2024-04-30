import controller.Controller;
import exceptions.InvalidMoveException;
import models.*;
import java.util.List;
// import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws InvalidMoveException {
        Controller gameController = new Controller();

        int dimension = 3;
        List<Player> players = List.of(
                new Player("Narasimha", new Symbol('X'), PlayerType.HUMAN),
                new Bot("Bot0", new Symbol('O'), BotLevel.EASY));

        Game game = gameController.startGame(dimension, players);

        while (game.getGameState().equals(GameState.PROGRESS)) {
            gameController.printBoard(game);

            gameController.makeMove(game);
        }

        if (!gameController.checkState(game).equals(GameState.ENDED)) {
            game.setGameState(GameState.DRAW);
            System.out.println("Game DRAW");
        } else {
            gameController.printBoard(game);
            System.out.println(gameController.getWinner(game).getName() + " is the winner");
        }
    }
}
