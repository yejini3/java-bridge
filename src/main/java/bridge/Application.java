package bridge;

import bridge.controllers.BridgeGame;

public class Application {

    public static void main(String[] args) {
        final BridgeGame bridgeGame = new BridgeGame();
        bridgeGame.startGame();
    }
}
