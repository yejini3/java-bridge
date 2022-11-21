package bridge.models;

import java.util.ArrayList;
import java.util.List;

import static bridge.constants.Constant.*;

public class BridgeMoving {
//    String START_OF_MAP = "[";
//    String END_OF_MAP = "]";
    public static List<List<String>> moveBridge(List<String> bridge, int location, String moving) {
        return null;
    }

    public static boolean checkMovement(List<String> bridge, int location, String moving) {
        if (bridge.get(location).matches(moving)) {
            return true;
        }
        return false;
    }
}
