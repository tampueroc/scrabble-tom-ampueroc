package cl.uchile.dcc.scrabble.types.typesFactories;

import cl.uchile.dcc.scrabble.types.SBoolean;

import java.util.HashMap;
import java.util.Map;

public class SBooleanFactory {

    static Map<Boolean, SBoolean> SBoolean = new HashMap<>();

    public static SBoolean createSBoolean(boolean value){
        Boolean key = value; //Para que tenga coherencia
        SBoolean result = SBoolean.get(key);
        if (result == null){
            result = new SBoolean(value);
            SBoolean.put(key, result);
        }
        return result;
    }
}
