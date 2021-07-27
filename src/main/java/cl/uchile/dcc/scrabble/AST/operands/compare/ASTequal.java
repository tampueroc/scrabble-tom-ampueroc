package cl.uchile.dcc.scrabble.AST.operands.compare;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.AST.twoNodes;
import cl.uchile.dcc.scrabble.AST.varNode;
import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.types.SBoolean;
import cl.uchile.dcc.scrabble.visitor.IVisitor;

import java.util.Map;

public class ASTequal extends compareNode {

    public ASTequal(String leftVarName, String rightVarName) {
        super(leftVarName, rightVarName);
    }

    @Override
    public ITypes operate() {
        varNode init = new varNode();
        Map<String, ITypes> map = init.getMapVar();
        if (map.get(this.leftVarName).compareTo(map.get(this.rightVarName))==0){
            return new SBoolean(true);
        }
        return null;
    }
}
