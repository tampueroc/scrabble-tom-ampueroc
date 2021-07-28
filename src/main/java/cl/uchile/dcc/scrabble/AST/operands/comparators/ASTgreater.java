package cl.uchile.dcc.scrabble.AST.operands.comparators;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.AST.varNode;
import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.types.SBoolean;

import java.util.Map;

import static cl.uchile.dcc.scrabble.AST.varNode.getMapVar;

public class ASTgreater extends abstractComparator implements INodes {
    public ASTgreater(String leftVarName, String rightVarName) {
        super(leftVarName, rightVarName);
    }

    @Override
    public ITypes operate() {
        Map<String, ITypes> map = getMapVar();
        if (map.get(leftVarName).compareTo(map.get(rightVarName))>0 ){
            return new SBoolean(true);
        }
        return new SBoolean(false);
    }
}
