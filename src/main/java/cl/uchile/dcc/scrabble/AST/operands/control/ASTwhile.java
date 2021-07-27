package cl.uchile.dcc.scrabble.AST.operands.control;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.AST.operands.compare.ICompare;
import cl.uchile.dcc.scrabble.AST.twoNodes;
import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.visitor.IVisitor;
import cl.uchile.dcc.scrabble.visitor.visitorWhile;

public class ASTwhile implements IControl, INodes{
    ICompare cond;
    INodes whileTrue;

    public ASTwhile(ICompare cond, INodes whileTrue) {
        this.cond = cond;
        this.whileTrue = whileTrue;
    }


    @Override
    public ITypes operate() {
        visitorWhile poto = new visitorWhile();
        return accept(poto);
    }

    @Override
    public ITypes accept(IVisitor visitor) {
        visitor.visitWhile(this);
        return null;
    }

    public ICompare getCond() {
        return cond;
    }

    public INodes getWhileTrue() {
        return whileTrue;
    }
}
