package bridge;

import bridge.controllers.GameController;

public class Application {

    public static void main(String[] args) {
        final GameController gameController = new GameController();
        gameController.startGame();
    }
}
