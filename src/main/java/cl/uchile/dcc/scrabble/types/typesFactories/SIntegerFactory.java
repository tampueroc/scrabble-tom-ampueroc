package cl.uchile.dcc.scrabble.types.typesFactories;

import cl.uchile.dcc.scrabble.types.numbers.SInteger;

import java.util.HashMap;
import java.util.Map;

public class SIntegerFactory {
    static Map<Integer, SInteger> mapSInteger = new HashMap<>();

    /**
     * Creates and returns a Scrabble Integer object and stores it in a HashMap in order to ensue it's uniqueness.
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
    public Map<Integer, SInteger> getMap() {
        return mapSInteger;
    }
}
