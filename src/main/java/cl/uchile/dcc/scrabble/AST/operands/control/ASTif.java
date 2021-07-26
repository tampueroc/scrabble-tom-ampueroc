package cl.uchile.dcc.scrabble.AST.operands.control;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.AST.operands.compare.ICompare;
import cl.uchile.dcc.scrabble.AST.threeNodes;
import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.visitor.IVisitor;

public class ASTif extends threeNodes implements IControl {
    public ASTif(ICompare cond, INodes ifTrue, INodes ifFalse) {
        super(cond, ifTrue, ifFalse);
    }

    @Override
    public ITypes operate() {
        return null;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitIf(this);
    }

}
