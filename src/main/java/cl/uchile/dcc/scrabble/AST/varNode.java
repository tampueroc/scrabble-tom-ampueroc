package cl.uchile.dcc.scrabble.AST;

import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.types.abstractTypes;
import cl.uchile.dcc.scrabble.visitor.IVisitor;

import java.util.HashMap;
import java.util.Map;

public class varNode implements INodes {
    String name;
    ITypes value;
    private static Map<String, ITypes> mapVar = new HashMap<>();

    public varNode(String name, ITypes value) {
        this.name=name;
        this.value=value;
    }

    public void modify(ITypes new_val){
        String key = name;
        mapVar.put(key, new_val);
    }

    @Override
    public ITypes operate() {
        String key = name;
        ITypes result = mapVar.get(key);
        if (result==null){
            mapVar.put(key, value);
        }
        return mapVar.get(name);
    }

    @Override
    public void accept(IVisitor visitor) {

    }
}
