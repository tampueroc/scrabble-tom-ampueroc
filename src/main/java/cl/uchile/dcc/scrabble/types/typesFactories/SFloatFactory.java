package cl.uchile.dcc.scrabble.types.typesFactories;

import  cl.uchile.dcc.scrabble.types.numbers.SFloat;

import java.util.HashMap;
import java.util.Map;

public class SFloatFactory {
    static  Map<Double, SFloat> mapSFloat = new HashMap<>();
    /**
     * Factory method which returns a Scrabble Float object created based on the entered value. It has the
     * quality of always returning a unique object, either it returns a previously created Scrabble Float
     * with the same value or creates an entirely new one.
     */
    public static SFloat createSFloat(double value){
        Double key = value; //Para que tenga coherencia
        SFloat result = mapSFloat.get(key);
        if (result == null){
            result = new SFloat(value);
            mapSFloat.put(key, result);
        }
        return result;
    }
    /**
     * Returns the HashMap where each distinct Scrabble Float is stored
     */
    public static Map<Double, SFloat> getMapSFloat() {
        return mapSFloat;
    }
}
