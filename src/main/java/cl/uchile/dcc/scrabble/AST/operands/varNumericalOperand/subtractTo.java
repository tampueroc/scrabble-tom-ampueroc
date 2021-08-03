package cl.uchile.dcc.scrabble.AST.operands.varNumericalOperand;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.types.ITypes;

import java.util.Map;

import static cl.uchile.dcc.scrabble.AST.varNode.getMapVar;

public class subtractTo implements INodes {
    String varName;
    String subtrahend;
    Map<String, ITypes> map = getMapVar();
    public subtractTo(String varName, String subtrahend) {
        this.varName = varName;
        this.subtrahend = subtrahend;
    }

    @Override
    public ITypes operate() {
        ITypes a = map.get(varName);
        ITypes b = map.get(subtrahend);
        ITypes result = a.subtract(b);
        map.put(varName, result);
        return null;
    }
}
