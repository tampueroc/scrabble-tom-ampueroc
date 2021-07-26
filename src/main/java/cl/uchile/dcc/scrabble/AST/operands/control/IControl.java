package cl.uchile.dcc.scrabble.AST.operands.control;

import cl.uchile.dcc.scrabble.visitor.IVisitor;

public interface IControl {
    void accept(IVisitor visitor);
}
