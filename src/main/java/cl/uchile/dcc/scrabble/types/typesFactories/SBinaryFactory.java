package cl.uchile.dcc.scrabble.types.typesFactories;

import cl.uchile.dcc.scrabble.types.numbers.SBinary;

import java.util.HashMap;
import java.util.Map;

public class SBinaryFactory {
    static Map<String, SBinary> SBinary = new HashMap<>();

    public static SBinary createSBinary(String value){
        String key = value; //Para que tenga coherencia
        SBinary result = SBinary.get(key);
        if (result == null){
            result = new SBinary(value);
            SBinary.put(key, result);
        }
        return result;
    }
}
