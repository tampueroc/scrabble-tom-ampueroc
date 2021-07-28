package cl.uchile.dcc.scrabble.AST;

import cl.uchile.dcc.scrabble.types.ITypes;

import java.util.HashMap;
import java.util.Map;

public class varNode implements INodes{
    String varName;
    ITypes value;

    public static Map<String, ITypes> getMapVar() {
        return mapVar;
    }

    private static Map<String, ITypes> mapVar = new HashMap<>();

    public varNode(String varName, ITypes value) {
        this.varName = varName;
        this.value = value;
    }

    @Override
    public ITypes operate() {
        mapVar.put(varName, value);
        return null;
    }
}
