package cl.uchile.dcc.scrabble.ast;

import cl.uchile.dcc.scrabble.types.ITypes;

public interface astNode {
    /**
     * Operates the node
     */
    ITypes operate();
}
