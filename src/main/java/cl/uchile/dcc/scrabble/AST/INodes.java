package cl.uchile.dcc.scrabble.AST;

import cl.uchile.dcc.scrabble.AST.flowControl.SelectiveVisitor;
import cl.uchile.dcc.scrabble.types.ITypes;

public interface INodes {
    /**
     * Operates this Node Type to return the Scrabble Type representation of itself
     */
    ITypes operate();
}
