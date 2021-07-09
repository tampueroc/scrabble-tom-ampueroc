package cl.uchile.dcc.scrabble.AST.operands.numerical;

import cl.uchile.dcc.scrabble.AST.twoNodes;
import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.types.ITypes;

public class ASTsubtract extends twoNodes {
    /**
     * Creates an Operand Subtract Node that establishes the subtraction operation between it's left and right children.
     */
    public ASTsubtract(INodes leftChild, INodes rightChild) {
        super(leftChild, rightChild);
    }
    /**
     * Evaluates this Node to returns it's Scrabble Type operation result by summoning the Scrabble Operation subtract
     */
    @Override
    public ITypes operate() {
        return this.getLeftChild().operate().subtract(this.getRightChild().operate());
    }
}
