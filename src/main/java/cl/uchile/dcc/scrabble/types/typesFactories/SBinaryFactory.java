package cl.uchile.dcc.scrabble.types.typesFactories;

import cl.uchile.dcc.scrabble.types.numbers.SBinary;

import java.util.HashMap;
import java.util.Map;

public class SBinaryFactory {
    static Map<String, SBinary> mapSBinary = new HashMap<>();

    /**
     * Factory method which returns a Scrabble Binary object created based on the entered value. It has the
     * quality of always returning a unique object, either it returns a previously created Scrabble Binary
     * with the same value or creates an entirely new one.
     */
    public static SBinary createSBinary(String value){
        String key = value; //Para que tenga coherencia
        SBinary result = mapSBinary.get(key);
        if (result == null){
            result = new SBinary(value);
            mapSBinary.put(key, result);
        }
        return result;
    }
    /**
     * Returns the HashMap where each distinct Scrabble Binary object is stored
     */
    public Map<String, SBinary> getMap(){
        return mapSBinary;
    }
}
