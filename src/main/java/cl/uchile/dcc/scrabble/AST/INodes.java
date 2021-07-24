package cl.uchile.dcc.scrabble.AST;

import cl.uchile.dcc.scrabble.fluxControl.IVisitorIf;
import cl.uchile.dcc.scrabble.fluxControl.IVisitorWhile;
import cl.uchile.dcc.scrabble.types.ITypes;

public interface INodes {
    /**
     * Operates this Node Type to return the Scrabble Type representation of itself
     */
    ITypes operate();

    ITypes acceptIf(IVisitorIf visitor, INodes ifTrue, INodes ifFalse);

    void acceptWhile(IVisitorWhile visitor, INodes whileTrue);
}
