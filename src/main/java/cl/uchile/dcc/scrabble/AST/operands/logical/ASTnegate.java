package cl.uchile.dcc.scrabble.AST.operands.logical;

import cl.uchile.dcc.scrabble.AST.oneNodes;
import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.fluxControl.IVisitorIf;
import cl.uchile.dcc.scrabble.fluxControl.IVisitorWhile;
import cl.uchile.dcc.scrabble.types.ITypes;

public class ASTnegate extends oneNodes {
    /**
     * Creates an Operand Negate Node that establishes the NEGATE operation for it's child.
     */
    public ASTnegate(INodes child) {
        super(child);
    }
    /**
     * Evaluates this Node to returns it's Scrabble Type operation result by summoning the Scrabble Operation negate
     */
    @Override
    public ITypes operate() {
        return this.getChild().operate().negate();
    }
}
