package cl.uchile.dcc.scrabble.types.typesFactories;

import cl.uchile.dcc.scrabble.types.SString;

import java.util.HashMap;
import java.util.Map;

public class SStringFactory {
    // Help to rceate uniquness between obejcts
    static Map<String, SString> SString = new HashMap<>();

    public static SString createSString(String value){
        String key = value; //Para que tenga coherencia
        SString result = SString.get(key);
        if (result == null){
            result = new SString(value);
            SString.put(key, result);
        }
        return result;
    }
}
