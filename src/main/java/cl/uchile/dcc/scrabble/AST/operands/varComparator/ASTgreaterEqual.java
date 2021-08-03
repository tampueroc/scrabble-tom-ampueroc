package cl.uchile.dcc.scrabble.AST.operands.varComparator;

import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.types.SBoolean;

import java.util.Map;

import static cl.uchile.dcc.scrabble.AST.varNode.getMapVar;

public class ASTgreaterEqual extends abstractComparator{
    /**
     * Creates a comparator node operand that works between two variables.
     * @param leftVarName
     * @param rightVarName
     */
    public ASTgreaterEqual(String leftVarName, String rightVarName) {
        super(leftVarName, rightVarName);
    }
    /**
     * Operates the node returning the Scrabble Boolean value of the comparison between two variables.
     * @return
     */
    @Override
    public ITypes operate() {
        Map<String, ITypes> map = getMapVar();
        if (map.get(leftVarName).compare(map.get(rightVarName))>0 || map.get(leftVarName).compare(map.get(rightVarName))==0 ){
            return new SBoolean(true);
        }
        return new SBoolean(false);
    }
}
