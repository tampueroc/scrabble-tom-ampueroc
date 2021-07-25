package cl.uchile.dcc.scrabble.visitor;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.types.ITypes;

public class equalToVisitor implements compareVisitor{
    private ITypes a;
    private ITypes b;

    public equalToVisitor(ITypes a, ITypes b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public ITypes visitASTif(INodes ifTrue, INodes ifFalse) {
        if (a.compareTo(b)==0){
            return ifTrue.operate();
        }
        if (a.compareTo(b)!=0){
            return ifFalse.operate();
        }
        return null;
    }

    @Override
    public void visitASTwhile( INodes whileTrue) {
        if (a.compareTo(b)==0){
            whileTrue.operate();

        }
    }
}
