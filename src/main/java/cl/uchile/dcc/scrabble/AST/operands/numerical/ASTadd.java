package cl.uchile.dcc.scrabble.AST.operands.numerical;

import cl.uchile.dcc.scrabble.AST.twoNodes;
import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.types.ITypes;

public class ASTadd extends twoNodes {
    /**
     * Creates an Operand Add Node that establishes the addition operation between it's left and right children.
     */
    public ASTadd(INodes leftChild, INodes rightChild) {
        super(leftChild, rightChild);
    }
    /**
     * Evaluates this Node to returns it's Scrabble Type operation result by summoning the Scrabble Operation add
     */
    @Override
    public ITypes operate() {
        return this.getLeftChild().operate().add(this.getRightChild().operate());
    }
}