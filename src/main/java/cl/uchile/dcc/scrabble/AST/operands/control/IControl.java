package cl.uchile.dcc.scrabble.AST.operands.control;

import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.visitor.IVisitor;

public interface IControl {
    /**
     * Allows the use of a given visitor on node.
     * @param visitor
     * @return
     */
    ITypes accept(IVisitor visitor);
}
