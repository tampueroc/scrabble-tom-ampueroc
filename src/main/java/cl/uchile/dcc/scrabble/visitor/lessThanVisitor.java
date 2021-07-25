package cl.uchile.dcc.scrabble.visitor;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.types.ITypes;

public class lessThanVisitor implements compareVisitor{
    private ITypes a;
    private ITypes b;

    public lessThanVisitor(ITypes a, ITypes b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public ITypes visitASTif(INodes cond, INodes ifTrue, INodes ifFalse) {
        return null;
    }

    @Override
    public void visitASTwhile(INodes cond, INodes whileTrue) {

    }
}
