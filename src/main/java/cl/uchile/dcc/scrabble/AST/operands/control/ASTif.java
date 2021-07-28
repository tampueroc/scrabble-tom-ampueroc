package cl.uchile.dcc.scrabble.AST.operands.control;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.AST.operands.comparators.ICompare;
import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.visitor.IVisitor;
import cl.uchile.dcc.scrabble.visitor.visitorIf;

public class ASTif implements IControl, INodes {
    ICompare cond;
    INodes ifTrue;
    INodes ifFalse;

    public ASTif(ICompare cond, INodes ifTrue, INodes ifFalse) {
        this.cond = cond;
        this.ifTrue = ifTrue;
        this.ifFalse = ifFalse;
    }

    @Override
    public ITypes accept(IVisitor visitor) {
        return visitor.visitIf(this);
    }

    @Override
    public ITypes operate() {
        visitorIf visitor =  new visitorIf();
        return accept(visitor);
    }
}
