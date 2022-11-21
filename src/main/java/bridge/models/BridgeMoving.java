package bridge.models;

import java.util.List;

public class BridgeMoving {
    private List<String> bridge;

    public BridgeMoving(List<String> bridge) {
        this.bridge = bridge;
    }

    public void moveBridge(String directionOfMovement){

    }

    public boolean checkMovement(int location, String moving) {
        if (this.bridge.get(location).matches(moving)) {
            return true;
        }
        return false;
    }


}
