package cl.uchile.dcc.scrabble.AST;

import cl.uchile.dcc.scrabble.types.ITypes;

import java.util.HashMap;
import java.util.Map;

public class varNode {
    String name;
    ITypes value;
    private static Map<String, ITypes> mapVar = new HashMap<>();

    public varNode(String name, ITypes value) {
        this.name=name;
        this.value=value;
    }

    public ITypes create() {
        String key = name;
        ITypes result = mapVar.get(key);
        if (result==null){
            mapVar.put(key, value);
        }
        return mapVar.get(name);
    }

}
