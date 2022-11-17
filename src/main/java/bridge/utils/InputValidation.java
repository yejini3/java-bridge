package bridge.utils;

public class InputValidation {
    private static final int MIN_SIZE_OF_BRIDGE = 3;
    private static final int MAX_SIZE_OF_BRIDGE = 20;
    private static final String REG_EXP_DIGIT = "^[0-9]+$";
    private static final String INPUT_GAME_RESTART = "R";
    private static final String INPUT_GAME_QUIT = "Q";
    private static final String INPUT_UP = "U";
    private static final String INPUT_DOWN = "D";

    public static void checkDigit(String input) {
        if (!input.matches(REG_EXP_DIGIT)) {
            throw new IllegalArgumentException();
        }
    }

    public void checkRange(String input) {
        int inputNumber = Integer.parseInt(input);
        if (inputNumber < MIN_SIZE_OF_BRIDGE && inputNumber > MAX_SIZE_OF_BRIDGE) {
            throw new IllegalArgumentException();
        }
    }

    public void checkGameCommandString(String input) {
        if (!input.matches(INPUT_GAME_RESTART) || !input.matches(INPUT_GAME_QUIT)) {
            throw new IllegalArgumentException();
        }
    }

    public void checkMovingString(String input) {
        if (!input.matches(INPUT_UP) || !input.matches(INPUT_DOWN)) {
            throw new IllegalArgumentException();
        }
    }


}
