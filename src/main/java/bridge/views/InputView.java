package bridge.views;

import bridge.utils.InputValidation;
import camp.nextstep.edu.missionutils.Console;

//  사용자로부터 입력을 받는 역할을 한다.
public class InputView {
    private static final String INPUT_MESSAGE_OF_BRIDGE_SIZE = "다리의 길이를 입력해주세요.";
    private static final String INPUT_MESSAGE_OF_MOVING = "이동할 칸을 선택해주세요. (위: U, 아래: D)";
    private static final String INPUT_MESSAGE_OF_GAME_COMMAND = "게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)";

    final static InputValidation inputValidation = new InputValidation();

    public int readBridgeSize() {
        System.out.println(INPUT_MESSAGE_OF_BRIDGE_SIZE);
        String bridgeSize = Console.readLine();
        inputValidation.checkBridgeSize(bridgeSize);
        return Integer.parseInt(bridgeSize);
    }

    public String readMoving() {
        System.out.println(INPUT_MESSAGE_OF_MOVING);
        String moving = Console.readLine();
        inputValidation.checkMoving(moving);
        return moving;
    }

    public String readGameCommand() {
        System.out.println(INPUT_MESSAGE_OF_GAME_COMMAND);
        String gameCommand = Console.readLine();
        inputValidation.checkGameCommand(gameCommand);
        return gameCommand;
    }
}
