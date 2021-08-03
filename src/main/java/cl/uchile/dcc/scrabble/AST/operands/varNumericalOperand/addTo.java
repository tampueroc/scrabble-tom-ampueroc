package cl.uchile.dcc.scrabble.AST.operands.varNumericalOperand;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.types.ITypes;

import java.util.Map;

import static cl.uchile.dcc.scrabble.AST.varNode.getMapVar;

public class addTo implements INodes{
    String varName;
    String addend;
    Map<String, ITypes> map = getMapVar();
    public addTo(String varName, String  addend) {
        this.varName = varName;
        this.addend = addend;
    }

    @Override
    public ITypes operate() {
        ITypes a = map.get(varName);
        ITypes b = map.get(addend);
        ITypes result = a.add(b);
        map.put(varName, result);
        return null;
    }
}
