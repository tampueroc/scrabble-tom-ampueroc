package cl.uchile.dcc.scrabble.AST.operands.varNumericalOperand;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.types.ITypes;

import java.util.Map;

import static cl.uchile.dcc.scrabble.AST.varNode.getMapVar;

public class divideTo implements INodes {
    String varName;
    ITypes dividend;
    Map<String, ITypes> map = getMapVar();

    public divideTo(String varName, ITypes subtrahend) {
        this.varName = varName;
        this.dividend = subtrahend;
    }

    @Override
    public ITypes operate() {
        ITypes a = map.get(varName);
        ITypes result = a.divide(dividend);
        map.put(varName, result);
        return null;
    }
}
