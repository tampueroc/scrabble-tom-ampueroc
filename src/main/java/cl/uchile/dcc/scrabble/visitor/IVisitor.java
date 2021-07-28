package cl.uchile.dcc.scrabble.visitor;

import cl.uchile.dcc.scrabble.types.ITypes;

public class IVisitor {
    ITypes visitIf(ASTif control);
    void visitWhile(ASTwhile control);
}
