package cl.uchile.dcc.scrabble.AST.operands.logical;

import cl.uchile.dcc.scrabble.AST.oneNodes;
import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.types.ITypes;

public class ASTnegate extends oneNodes {

    public ASTnegate(INodes child) {
        super(child);
    }

    @Override
    public ITypes operate() {
        return this.getChild().operate().negate();
    }
}
