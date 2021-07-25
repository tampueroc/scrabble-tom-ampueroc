package cl.uchile.dcc.scrabble.visitor;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.types.ITypes;

public class greaterThanVisitor implements compareVisitor{
    private ITypes a;
    private ITypes b;

    public greaterThanVisitor(ITypes a, ITypes b) {
        this.a = a;
        this.b = b;
    }

    public ITypes getA() {
        return a;
    }

    public ITypes getB() {
        return b;
    }

    @Override
    public ITypes visitASTif(INodes cond, INodes ifTrue, INodes ifFalse) {
        return null;
    }

    @Override
    public void visitASTwhile(INodes cond, INodes whileTrue) {

    }
}
