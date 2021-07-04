package cl.uchile.dcc.scrabble.types.typesFactories;

import cl.uchile.dcc.scrabble.types.numbers.SFloat;
import cl.uchile.dcc.scrabble.types.numbers.SInteger;

import java.util.HashMap;
import java.util.Map;

public class SIntegerFactory {
    static Map<Integer, SInteger> SInteger = new HashMap<>();

    public static SInteger createSInteger(int value){
        Integer key = value; //Para que tenga coherencia
        SInteger result = SInteger.get(key);
        if (result == null){
            result = new SInteger(value);
            SInteger.put(key, result);
        }
        return result;
    }

}
