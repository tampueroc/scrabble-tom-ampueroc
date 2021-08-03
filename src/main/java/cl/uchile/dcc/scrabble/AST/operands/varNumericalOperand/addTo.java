package cl.uchile.dcc.scrabble.AST.operands.varNumericalOperand;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.types.ITypes;

import java.util.Map;

import static cl.uchile.dcc.scrabble.AST.varNode.getMapVar;

public class addTo implements INodes{
    String varName;
    String addend;
    Map<String, ITypes> map = getMapVar();
    /**
     * Creates an addition node operand that works between two variables.
     * @param varName
     * @param addend
     */
    public addTo(String varName, String  addend) {
        this.varName = varName;
        this.addend = addend;
    }
    /**
     * Operates the node indexing the result by updating the variable corresponding to the varName in the hash
     * map with the result of the operation between both variables.
     * @return
     */
    @Override
    public ITypes operate() {
        ITypes a = map.get(varName);
        ITypes b = map.get(addend);
        ITypes result = a.add(b);
        map.put(varName, result);
        return null;
    }
}
