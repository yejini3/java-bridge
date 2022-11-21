package bridge.utils;

import static bridge.constants.Constant.*;
import static bridge.constants.Message.*;

public class InputValidation {

    public void checkBridgeSize(String size) {
        checkDigit(size);
        checkRange(Integer.parseInt(size));
    }

    public void checkDigit(String input) {
        if (!input.matches(REG_EXP_DIGIT)) {
            throw new IllegalArgumentException(DIGIT_ERROR);
        }
    }

    public void checkRange(int size) {
        if (size < MIN_SIZE_OF_BRIDGE || size > MAX_SIZE_OF_BRIDGE) {
            throw new IllegalArgumentException(RANGE_ERROR);
        }
    }

    public void checkMoving(String moving) {
        if (!moving.matches(UP_MARK) || !moving.matches(DOWN_MARK)) {
            throw new IllegalArgumentException(MOVING_VAlUE_ERROR);
        }
    }

    public void checkGameCommand(String command) {
        if (!command.matches(INPUT_GAME_RESTART) || !command.matches(INPUT_GAME_QUIT)) {
            throw new IllegalArgumentException(GAME_COMMAND_VALUE_ERROR);
        }
    }


}
