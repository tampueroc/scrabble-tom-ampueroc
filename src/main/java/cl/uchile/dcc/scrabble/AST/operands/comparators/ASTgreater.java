package cl.uchile.dcc.scrabble.AST.operands.comparators;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.types.ITypes;

public class ASTgreater extends abstractComparator implements INodes {
    public ASTgreater(String leftVarName, String rightVarName) {
        super(leftVarName, rightVarName);
    }

    @Override
    public ITypes operate() {
        
        return null;
    }
}
