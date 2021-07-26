package cl.uchile.dcc.scrabble.AST;

import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.visitor.IVisitor;

public interface INodes {
    /**
     * Operates this Node Type to return the Scrabble Type representation of itself
     */
    ITypes operate();

    void accept(IVisitor visitor);

}
