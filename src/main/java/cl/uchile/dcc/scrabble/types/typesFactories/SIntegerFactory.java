package cl.uchile.dcc.scrabble.types.typesFactories;

import cl.uchile.dcc.scrabble.types.numbers.SInteger;

import java.util.HashMap;
import java.util.Map;

public class SIntegerFactory {
    static Map<Integer, SInteger> mapSInteger = new HashMap<>();

    /**
     * Factory method which returns a Scrabble Integer object created based on the entered value. It has the
     * quality of always returning a unique object, either it returns a previously created Scrabble Integer
     * with the same value or creates an entirely new one.
     */
    public static SInteger createSInteger(int value){
        Integer key = value; //Para que tenga coherencia
        SInteger result = mapSInteger.get(key);
        if (result == null){
            result = new SInteger(value);
            mapSInteger.put(key, result);
        }
        return result;
    }
    /**
     * Returns the HashMap where each distinct Scrabble Integer is stored
     */
    public static Map<Integer, SInteger> getMapSInteger() {
        return mapSInteger;
    }
}
