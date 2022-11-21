package bridge.constants;

public class Message {

    public static final String GAME_START_MESSAGE = "다리 건너기 게임을 시작합니다.";

    public static final String INPUT_MESSAGE_OF_BRIDGE_SIZE = "다리의 길이를 입력해주세요.";
    public static final String INPUT_MESSAGE_OF_MOVING = "이동할 칸을 선택해주세요. (위: U, 아래: D)";
    public static final String INPUT_MESSAGE_OF_GAME_COMMAND = "게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)";

    public static final String DIGIT_ERROR = "[ERROR] 숫자만 입력 가능합니다.";
    public static final String RANGE_ERROR = "[ERROR] 다리 길이는 3부터 20 사이의 숫자여야 합니다.";
    public static final String MOVING_VAlUE_ERROR = "[ERROR] U(위 칸) 또는 D(아래 칸)만 입력 가능합니다.";
    public static final String GAME_COMMAND_VALUE_ERROR = "[ERROR] R(재시작) 또는 Q(종료)만 입력 가능합니다.";
}
