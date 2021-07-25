package cl.uchile.dcc.scrabble.AST.operands.control;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.visitor.compareVisitor;

public interface IControl extends INodes {
    void accept(compareVisitor visitor);
}
