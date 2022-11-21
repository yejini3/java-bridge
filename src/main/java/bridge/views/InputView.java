package bridge.views;

import bridge.constants.Message;
import bridge.utils.InputValidation;
import camp.nextstep.edu.missionutils.Console;

import static bridge.constants.Message.*;

//  사용자로부터 입력을 받는 역할을 한다.
public class InputView {
    final static InputValidation inputValidation = new InputValidation();

    public static int readBridgeSize() {
        System.out.println(INPUT_MESSAGE_OF_BRIDGE_SIZE);
        String bridgeSize = Console.readLine();
        inputValidation.checkBridgeSize(bridgeSize);
        return Integer.parseInt(bridgeSize);
    }

    public static String readMoving() {
        System.out.println(INPUT_MESSAGE_OF_MOVING);
        String moving = Console.readLine();
        inputValidation.checkMoving(moving);
        return moving;
    }

    public static String readGameCommand() {
        System.out.println(INPUT_MESSAGE_OF_GAME_COMMAND);
        String gameCommand = Console.readLine();
        inputValidation.checkGameCommand(gameCommand);
        return gameCommand;
    }
}
