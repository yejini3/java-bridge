package bridge.models;

import java.util.ArrayList;
import java.util.List;

public class Bridge {
    private List<Integer> currentBridge = new ArrayList<>();

    Bridge(){

    }
    BridgeMap bridgeMap = new BridgeMap();

    public void moveBridge(String direction) {
      //  boolean moveSuccess = BridgeMoving.checkMovement(bridge, currentBridge.size(), direction);
      //  bridgeMap.addMovement(moveSuccess, direction);

    }

    public List<List<String>> getMap() {
        return bridgeMap.map;
    }


}
