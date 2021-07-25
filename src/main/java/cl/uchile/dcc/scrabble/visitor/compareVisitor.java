package cl.uchile.dcc.scrabble.visitor;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.types.ITypes;

public interface compareVisitor {
    ITypes visitASTif(INodes ifTrue, INodes ifFalse);

    void visitASTwhile(INodes whileTrue);

}
