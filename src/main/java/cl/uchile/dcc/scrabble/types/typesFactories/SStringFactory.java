package cl.uchile.dcc.scrabble.types.typesFactories;

import cl.uchile.dcc.scrabble.types.SString;

import java.util.HashMap;
import java.util.Map;

public class SStringFactory {
    // Help to create uniquness between obejcts
    static Map<String, SString> mapSString = new HashMap<>();

    /**
     * Creates and returns a Scrabble String object and stores it in a HashMap in order to ensue it's uniqueness.
     */
    public static SString createSString(String value){
        String key = value; //Para que tenga coherencia
        SString result = mapSString.get(key);
        if (result == null){
            result = new SString(value);
            mapSString.put(key, result);
        }
        return result;
    }
    /**
     * Returns the HashMap where each distinct Scrabble String is stored
     */
    public Map<String, SString> getMap(){
        return mapSString;
    }
}
