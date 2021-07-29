package cl.uchile.dcc.scrabble.AST.operands.varNumericalOperand;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.types.ITypes;

import java.util.Map;

import static cl.uchile.dcc.scrabble.AST.varNode.getMapVar;

public class divideTo implements INodes {
    String varName;
    String dividend;
    Map<String, ITypes> map = getMapVar();

    public divideTo(String varName, String subtrahend) {
        this.varName = varName;
        this.dividend = subtrahend;
    }

    @Override
    public ITypes operate() {
        ITypes a = map.get(varName);
        ITypes b = map.get(dividend);
        ITypes result = a.divide(b);
        map.put(varName, result);
        return null;
    }
}
