package cl.uchile.dcc.scrabble.AST.transformations;

import cl.uchile.dcc.scrabble.AST.oneNodes;
import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.types.ITypes;

public class asString extends oneNodes {

    /**
     * Creates a transformation Node that transforms it's child to a Scrabble String Type.
     */
    public asString(INodes child) {
        super(child);
    }

    /**
     * Evaluates this Node to returns it's Scrabble String transformation result.
     */
    @Override
    public ITypes operate() {
        return this.getChild().operate().asString();
    }
}
