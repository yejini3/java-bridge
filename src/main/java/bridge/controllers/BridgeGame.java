package bridge.controllers;

import bridge.models.BridgeMaker;
import bridge.models.BridgeMoving;
import bridge.utils.BridgeNumberGenerator;
import bridge.utils.BridgeRandomNumberGenerator;
import bridge.views.InputView;
import bridge.views.OutputView;

import java.util.ArrayList;
import java.util.List;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {
    private static final String GAME_START_MESSAGE = "다리 건너기 게임을 시작합니다.";
    private List<String> bridge;
    private List<String> currentBridge;
    final BridgeNumberGenerator bridgeNumberGenerator = new BridgeRandomNumberGenerator();
    final BridgeMaker bridgeMaker = new BridgeMaker(bridgeNumberGenerator);

    public void startGame() {
        System.out.println(GAME_START_MESSAGE);
        makeBridge();

        startMoving();
        retry();


    }

    public void makeBridge() {
        int bridgeSize = InputView.readBridgeSize();
        this.bridge = bridgeMaker.makeBridge(bridgeSize);
    }

    public void startMoving() {
        currentBridge = new ArrayList<>();
        while (checkMoving) {
            currentBridge = move(currentBridge);
        }
    }

    public boolean checkMoving() {
        if (BridgeMoving.checkBridge(movingDirection)) {
            return true;
        }
        return false;
    }

    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public boolean move(List<String> previousBridge) {
        String movingDirection = InputView.readMoving();
        if (BridgeMoving.checkBridge(movingDirection)) {

        }

        this.currentBridge = BridgeMoving.moveBridge(bridge, previousBridge, movingDirection);

        OutputView.printMap(currentBridge);
        return false;
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void retry() {
        InputView.readGameCommand();
        startMoving();
    }
}
