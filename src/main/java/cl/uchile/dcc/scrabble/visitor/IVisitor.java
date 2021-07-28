package cl.uchile.dcc.scrabble.visitor;

import cl.uchile.dcc.scrabble.AST.operands.control.ASTif;
import cl.uchile.dcc.scrabble.AST.operands.control.ASTwhile;
import cl.uchile.dcc.scrabble.types.ITypes;

public interface IVisitor {
    ITypes visitIf(ASTif control);
    void visitWhile(ASTwhile control);
}
