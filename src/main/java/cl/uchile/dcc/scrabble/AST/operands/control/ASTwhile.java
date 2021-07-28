package cl.uchile.dcc.scrabble.AST.operands.control;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.visitor.IVisitor;
import cl.uchile.dcc.scrabble.visitor.visitorWhile;

public class ASTwhile implements IControl, INodes {
    INodes cond;
    INodes whileTrue;

    public INodes getCond() {
        return cond;
    }

    public INodes getWhileTrue() {
        return whileTrue;
    }

    public ASTwhile(INodes cond, INodes whileTrue) {
        this.cond = cond;
        this.whileTrue = whileTrue;
    }

    @Override
    public ITypes accept(IVisitor visitor) {
        visitor.visitWhile(this);
        return null;
    }

    @Override
    public ITypes operate() {
        visitorWhile visitor = new visitorWhile();
        return accept(visitor);
    }
}
