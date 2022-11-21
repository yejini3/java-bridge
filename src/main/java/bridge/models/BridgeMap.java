package bridge.models;

import java.util.List;

import static bridge.constants.Constant.*;

public class BridgeMap {
    public static List<List<String>> map;
    public BridgeMap(){
        initMap();
    }

    public void initMap() {
        for (int i = 0; i < 2; i++) {
            map.get(i).add(START_OF_MAP);
        }
    }
    public void addMovement(boolean moveSuccess, String direction){

    }

    public void addMovement(int direction, String movementResult) {
        map.get(direction).add(movementResult);
    }

    public void addMovementFail(String movement) {
        map.get(convertToInteger(movement)).add(MOVEMENT_FAIL_OF_MAP);
        map.get(convertToInteger(movement)).add(BLANK_MAP);
    }


    public void endMap() {
        for (int i = 0; i < 2; i++) {
            map.get(i).add(END_OF_MAP);
        }
    }

    public int convertToInteger(String movement){
        if(movement.equals(UP_MARK)){
            return 1;
        }
        if(movement.equals(DOWN_MARK)){
            return 0;
        }
        return -1;
    }
}
