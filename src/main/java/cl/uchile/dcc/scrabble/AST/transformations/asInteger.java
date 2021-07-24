package cl.uchile.dcc.scrabble.AST.transformations;

import cl.uchile.dcc.scrabble.AST.oneNodes;
import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.fluxControl.IVisitorIf;
import cl.uchile.dcc.scrabble.fluxControl.IVisitorWhile;
import cl.uchile.dcc.scrabble.types.ITypes;

public class asInteger extends oneNodes {
    /**
     * Creates a transformation Node that transforms it's child to a Scrabble Integer Type.
     */
    public asInteger(INodes child) {
        super(child);
    }
    /**
     * Evaluates this Node to returns it's Scrabble Integer transformation result.
     */
    @Override
    public ITypes operate() {
        return this.getChild().operate().asInteger();
    }

}
