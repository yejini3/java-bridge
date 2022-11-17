package bridge.views;

import bridge.utils.InputValidation;
import camp.nextstep.edu.missionutils.Console;

//  사용자로부터 입력을 받는 역할을 한다.
public class InputView {
    final static InputValidation inputValidation = new InputValidation();

//     다리의 길이를 입력받는다.
    public int readBridgeSize() {
        String bridgeSize = Console.readLine();
        inputValidation.checkDigit(bridgeSize);
        inputValidation.checkRange(bridgeSize);
        return Integer.parseInt(bridgeSize);
    }

//      사용자가 이동할 칸을 입력받는다.
    public String readMoving() {
        String moving = Console.readLine();
        inputValidation.checkMovingString(moving);
        return moving;
    }

//      사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
    public String readGameCommand() {
        String gameCommand = Console.readLine();
        inputValidation.checkGameCommandString(gameCommand);
        return gameCommand;
    }
}
