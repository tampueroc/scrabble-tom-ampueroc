package cl.uchile.dcc.scrabble.ast.transformations;

import cl.uchile.dcc.scrabble.ast.astNode;
import cl.uchile.dcc.scrabble.ast.oneChildAST;
import cl.uchile.dcc.scrabble.types.ITypes;

public class asInteger extends oneChildAST{

    public asInteger(astNode node) {
        super(node);
    }

    /**
     * Operates the node
     */
    @Override
    public ITypes operate() {
        return this.getChild().operate().asInteger();
    }
}
