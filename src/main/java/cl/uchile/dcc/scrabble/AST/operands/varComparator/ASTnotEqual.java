package cl.uchile.dcc.scrabble.AST.operands.varComparator;

import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.types.SBoolean;

import java.util.Map;

import static cl.uchile.dcc.scrabble.AST.varNode.getMapVar;

public class ASTnotEqual extends abstractComparator{
    public ASTnotEqual(String leftVarName, String rightVarName) {
        super(leftVarName, rightVarName);
    }

    @Override
    public ITypes operate() {
        Map<String, ITypes> map = getMapVar();
        if (map.get(leftVarName).compare(map.get(rightVarName))!=0){
            return new SBoolean(true);
        }
        return new SBoolean(false);
    }
}
