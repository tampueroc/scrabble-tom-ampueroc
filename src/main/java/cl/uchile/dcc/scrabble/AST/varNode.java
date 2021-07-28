package cl.uchile.dcc.scrabble.AST;

import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.types.abstractTypes;
import cl.uchile.dcc.scrabble.visitor.IVisitor;

import java.util.HashMap;
import java.util.Map;

public class varNode implements INodes {
    String varName;
    ITypes varValue;
    private static Map<String, ITypes> mapVar = new HashMap<>();

    public static Map<String, ITypes> getMapVar() {
        return mapVar;
    }

    public void use(String varName, ITypes varValue){
        String key = varName;
        mapVar.put(key, varValue);
    }

    @Override
    public ITypes operate() {
        String key = varName;
        mapVar.put(key, varValue);
        return null;
    }
}
