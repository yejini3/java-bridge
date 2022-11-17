package bridge.utils;

public class InputValidation {
    private static final int MIN_SIZE_OF_BRIDGE = 3;
    private static final int MAX_SIZE_OF_BRIDGE = 20;
    private static final String REG_EXP_DIGIT = "^[0-9]+$";
    private static final String INPUT_GAME_RESTART = "R";
    private static final String INPUT_GAME_QUIT = "Q";
    private static final String INPUT_UP = "U";
    private static final String INPUT_DOWN = "D";
    private static final String DIGIT_ERROR = "[ERROR] 숫자만 입력 가능합니다.";
    private static final String RANGE_ERROR = "[ERROR] 다리 길이는 3부터 20 사이의 숫자여야 합니다.";
    private static final String MOVING_VAlUE_ERROR = "[ERROR] U(위 칸) 또는 D(아래 칸)만 입력 가능합니다.";
    private static final String GAME_COMMAND_VALUE_ERROR = "[ERROR] R(재시작) 또는 Q(종료)만 입력 가능합니다.";

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
        if (!moving.matches(INPUT_UP) || !moving.matches(INPUT_DOWN)) {
            throw new IllegalArgumentException(MOVING_VAlUE_ERROR);
        }
    }

    public void checkGameCommand(String command) {
        if (!command.matches(INPUT_GAME_RESTART) || !command.matches(INPUT_GAME_QUIT)) {
            throw new IllegalArgumentException(GAME_COMMAND_VALUE_ERROR);
        }
    }


}
