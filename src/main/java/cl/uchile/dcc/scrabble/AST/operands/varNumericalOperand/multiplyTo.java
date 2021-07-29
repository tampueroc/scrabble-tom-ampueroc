package cl.uchile.dcc.scrabble.AST.operands.varNumericalOperand;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.types.ITypes;

import java.util.Map;

import static cl.uchile.dcc.scrabble.AST.varNode.getMapVar;

public class multiplyTo implements INodes {
    String varName;
    ITypes product;
    Map<String, ITypes> map = getMapVar();
    public multiplyTo(String varName, ITypes product) {
        this.varName = varName;
        this.product = product;
    }

    @Override
    public ITypes operate() {
        ITypes a = map.get(varName);
        ITypes result = a.multiply(product);
        map.put(varName, result);
        return null;
    }
}
