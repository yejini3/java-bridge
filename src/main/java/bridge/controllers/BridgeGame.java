package bridge.controllers;

import bridge.models.BridgeMaker;
import bridge.models.BridgeMoving;
import bridge.utils.BridgeNumberGenerator;
import bridge.utils.BridgeRandomNumberGenerator;
import bridge.views.InputView;
import bridge.views.OutputView;

import java.util.ArrayList;
import java.util.List;

import static bridge.constants.Message.*;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {    private List<String> bridge;
    private int round = 0;
    private boolean gameSuccess = false;
    private List<String> currentLocations;

    final BridgeNumberGenerator bridgeNumberGenerator = new BridgeRandomNumberGenerator();
    final BridgeMaker bridgeMaker = new BridgeMaker(bridgeNumberGenerator);

    public void startGame() {
        System.out.println(GAME_START_MESSAGE);
        makeBridge();
        do {
            startRound();
        } while (retry() && !gameSuccess);
        OutputView.printResult();
    }

    public void startRound() {
        round++;
        this.currentLocations = new ArrayList<>();

        do {
            move();
            if(!checkMovement()){
                break;
            }
        }while (!gameSuccess);


        move(); // 불가능한 다리인 경우 종료한다. 가능한 다리이면 계속 이동한다.

    }

    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void move() {
        String moving = InputView.readMoving();


        OutputView.printMap();
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
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
}
