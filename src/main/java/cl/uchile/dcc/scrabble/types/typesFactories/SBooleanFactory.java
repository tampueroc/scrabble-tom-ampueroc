package cl.uchile.dcc.scrabble.types.typesFactories;

import cl.uchile.dcc.scrabble.types.SBoolean;

import java.util.HashMap;
import java.util.Map;

public class SBooleanFactory {

    private static Map<Boolean, SBoolean> mapSBoolean = new HashMap<>();

    public static SBoolean createSBoolean(boolean value){
        Boolean key = value;
        SBoolean result = mapSBoolean.get(key);
        if (result == null) {
            result = new SBoolean(value);
            mapSBoolean.put(key, result);
        }
        return result;
    }

    public static Map<Boolean, SBoolean> getMapSBoolean() {
        return mapSBoolean;
    }
}
