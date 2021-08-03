package cl.uchile.dcc.scrabble.AST.operands.varNumericalOperand;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.types.ITypes;

import java.util.Map;

import static cl.uchile.dcc.scrabble.AST.varNode.getMapVar;

public class multiplyTo implements INodes {
    String varName;
    String product;
    Map<String, ITypes> map = getMapVar();
    /**
     * Creates a multiplication node operand that works between two variables.
     * @param varName
     * @param addend
     */
    public multiplyTo(String varName, String product) {
        this.varName = varName;
        this.product = product;
    }
    /**
     * Operates the node indexing the result by updating the variable corresponding to the varName in the hash
     * map with the result of the operation between both variables.
     * @return
     */
    @Override
    public ITypes operate() {
        ITypes a = map.get(varName);
        ITypes b = map.get(product);
        ITypes result = a.multiply(b);
        map.put(varName, result);
        return null;
    }
}
