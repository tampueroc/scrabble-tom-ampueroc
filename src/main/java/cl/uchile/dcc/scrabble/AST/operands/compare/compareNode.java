package cl.uchile.dcc.scrabble.AST.operands.compare;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.AST.varNode;
import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.types.SBoolean;

import java.util.Map;

public class compareNode implements INodes, ICompare{
    String leftVarName;
    String rightVarName;

    public compareNode(String leftVarName, String rightVarName) {
        this.leftVarName = leftVarName;
        this.rightVarName = rightVarName;
    }

    @Override
    public ITypes operate() {
        return null;
    }
}
