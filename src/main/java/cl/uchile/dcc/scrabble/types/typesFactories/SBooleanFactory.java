package cl.uchile.dcc.scrabble.types.typesFactories;

import cl.uchile.dcc.scrabble.types.SBoolean;

import java.util.HashMap;
import java.util.Map;

public class SBooleanFactory {

    static Map<Boolean, SBoolean> mapSBoolean = new HashMap<>();

    public static SBoolean createSBoolean(boolean value){
        Boolean key = value; //Para que tenga coherencia
        SBoolean result = mapSBoolean.get(key);
        if (result == null){
            result = new SBoolean(value);
            mapSBoolean.put(key, result);
        }
        return result;
    }

    /**
     * Returns the HashMap where each distinct Scrabble Boolean is stored
     */
    public Map<Boolean, SBoolean> getMap() {
        return mapSBoolean;
    }
}
