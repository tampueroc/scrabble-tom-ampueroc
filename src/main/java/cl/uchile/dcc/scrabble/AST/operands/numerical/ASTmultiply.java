package cl.uchile.dcc.scrabble.AST.operands.numerical;

import cl.uchile.dcc.scrabble.AST.twoNodes;
import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.fluxControl.IVisitorIf;
import cl.uchile.dcc.scrabble.fluxControl.IVisitorWhile;
import cl.uchile.dcc.scrabble.types.ITypes;

public class ASTmultiply extends twoNodes {
    /**
     * Creates an Operand Multiplication Node that establishes the multiplication operation between it's left and right children.
     */
    public ASTmultiply(INodes leftChild, INodes rightChild) {
        super(leftChild, rightChild);
    }
    /**
     * Evaluates this Node to returns it's Scrabble Type operation result by summoning the Scrabble Operation multiply
     */
    @Override
    public ITypes operate() {
        return this.getLeftChild().operate().multiply(this.getRightChild().operate());
    }
}
