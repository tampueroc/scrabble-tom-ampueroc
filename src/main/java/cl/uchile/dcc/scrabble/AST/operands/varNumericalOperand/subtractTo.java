package cl.uchile.dcc.scrabble.AST.operands.varNumericalOperand;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.types.ITypes;

import java.util.Map;

import static cl.uchile.dcc.scrabble.AST.varNode.getMapVar;

public class subtractTo implements INodes {
    String varName;
    String subtrahend;
    Map<String, ITypes> map = getMapVar();
    /**
     * Creates a subtraction node operand that works between two variables.
     * @param varName
     * @param addend
     */
    public subtractTo(String varName, String subtrahend) {
        this.varName = varName;
        this.subtrahend = subtrahend;
    }
    /**
     * Operates the node indexing the result by updating the variable corresponding to the varName in the hash
     * map with the result of the operation between both variables.
     * @return
     */
    @Override
    public ITypes operate() {
        ITypes a = map.get(varName);
        ITypes b = map.get(subtrahend);
        ITypes result = a.subtract(b);
        map.put(varName, result);
        return null;
    }
}
