package cl.uchile.dcc.scrabble.types.typesFactories;

import  cl.uchile.dcc.scrabble.types.numbers.SFloat;

import java.util.HashMap;
import java.util.Map;

public class SFloatFactory {
    static  Map<Double, SFloat> SFloat = new HashMap<>();

    public static SFloat createSFloat(double value){
        Double key = value; //Para que tenga coherencia
        SFloat result = SFloat.get(key);
        if (result == null){
            result = new SFloat(value);
            SFloat.put(key, result);
        }
        return result;
    }
}
