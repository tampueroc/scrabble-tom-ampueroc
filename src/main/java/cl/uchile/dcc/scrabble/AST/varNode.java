package cl.uchile.dcc.scrabble.AST;

import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.types.abstractTypes;
import cl.uchile.dcc.scrabble.visitor.IVisitor;

import java.util.HashMap;
import java.util.Map;

public class varNode implements INodes {
    private static Map<String, ITypes> mapVar = new HashMap<>();

    public static Map<String, ITypes> getMapVar() {
        return mapVar;
    }
    public void use(String name, ITypes value){
        String key = name;
        mapVar.put(key, value);
    }
    @Override
    public ITypes operate() {
        return null;
    }
}
