package cl.uchile.dcc.scrabble.AST.transformations;

import cl.uchile.dcc.scrabble.AST.oneNodes;
import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.types.ITypes;
public class asFloat extends oneNodes {

    public asFloat(INodes child) {
        super(child);
    }

    @Override
    public ITypes operate() {
        return this.getChild().operate().asFloat();
    }
}
