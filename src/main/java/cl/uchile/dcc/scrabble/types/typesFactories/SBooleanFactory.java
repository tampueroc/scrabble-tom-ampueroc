package cl.uchile.dcc.scrabble.types.typesFactories;

import cl.uchile.dcc.scrabble.types.SBoolean;

import java.util.HashMap;
import java.util.Map;

public class SBooleanFactory {

    private static Map<Boolean, SBoolean> mapSBoolean = new HashMap<>();

    /**
     * Factory method which returns a Scrabble Boolean object created based on the entered value. It has the
     * quality of always returning a unique object, either it returns a previously created Scrabble Boolean
     * with the same value or creates an entirely new one.
     */
    public static SBoolean createSBoolean(boolean value){
        Boolean key = value;
        SBoolean result = mapSBoolean.get(key);
        if (result == null) {
            result = new SBoolean(value);
            mapSBoolean.put(key, result);
        }
        return result;
    }
    /**
     * Returns the HashMap where each distinct Scrabble Boolean is stored
     */
    public static Map<Boolean, SBoolean> getMapSBoolean() {
        return mapSBoolean;
    }
}
