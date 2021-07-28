package cl.uchile.dcc.scrabble.visitor;

import cl.uchile.dcc.scrabble.AST.operands.control.ASTif;
import cl.uchile.dcc.scrabble.AST.operands.control.ASTwhile;
import cl.uchile.dcc.scrabble.types.ITypes;

public class visitorIf implements IVisitor{
    @Override
    public ITypes visitIf(ASTif control) {
        return null;
    }

    @Override
    public void visitWhile(ASTwhile control) {

    }
}
