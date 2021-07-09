package cl.uchile.dcc.scrabble.AST.transformations;

import cl.uchile.dcc.scrabble.AST.oneNodes;
import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.types.ITypes;
public class asFloat extends oneNodes {
    /**
     * Creates a transformation Node that transforms it's child to a Scrabble Float Type.
     */
    public asFloat(INodes child) {
        super(child);
    }
    /**
     * Evaluates this Node to returns it's Scrabble Float transformation result.
     */
    @Override
    public ITypes operate() {
        return this.getChild().operate().asFloat();
    }
}
