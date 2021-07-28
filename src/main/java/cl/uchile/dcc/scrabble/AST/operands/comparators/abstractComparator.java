package cl.uchile.dcc.scrabble.AST.operands.comparators;

import cl.uchile.dcc.scrabble.AST.INodes;

public abstract class abstractComparator implements INodes {
    public String leftVarName;
    public String rightVarName;

    public abstractComparator(String leftVarName, String rightVarName) {
        this.leftVarName = leftVarName;
        this.rightVarName = rightVarName;
    }
}
