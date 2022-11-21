package bridge.controllers;

import bridge.models.BridgeMaker;
import bridge.models.BridgeMap;
import bridge.models.BridgeMoving;
import bridge.utils.BridgeNumberGenerator;
import bridge.utils.BridgeRandomNumberGenerator;
import bridge.views.InputView;
import bridge.views.OutputView;

import java.util.List;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {
    private int round = 0;
    private List<String> bridge;
    private BridgeMap bridgeMap;
    private BridgeMoving bridgeMoving;

    final BridgeNumberGenerator bridgeNumberGenerator = new BridgeRandomNumberGenerator();
    final BridgeMaker bridgeMaker = new BridgeMaker(bridgeNumberGenerator);


    public void init() {
        round++;
        bridgeMap = new BridgeMap();
        bridgeMoving = new BridgeMoving(this.bridge);
    }

    public void move() {
        String directionOfMovement = InputView.readMoving();

        bridgeMoving.moveBridge(directionOfMovement);

        OutputView.printMap(bridgeMap.map);
    }

    public boolean retry() {
        String command = InputView.readGameCommand();
        if (command.equals("R")) {
            return true;
        }
        return false;
    }

    public void makeBridge() {
        int bridgeSize = InputView.readBridgeSize();
        this.bridge = bridgeMaker.makeBridge(bridgeSize);
    }

    public int getRound() {
        return round;
    }
}
