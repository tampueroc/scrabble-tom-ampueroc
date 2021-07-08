package cl.uchile.dcc.scrabble.AST.operands.logical;

import cl.uchile.dcc.scrabble.AST.twoNodes;
import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.types.ITypes;

public class ASTor extends twoNodes {
    /**
     * Creates an Operand AND Node that establishes the AND operation between it's left and right children.
     */
    public ASTor(INodes leftChild, INodes rightChild) {
        super(leftChild, rightChild);
    }
    /**
     * Evaluates this Node to returns it's Scrabble Type operation result by summoning the Scrabble Operation or
     */
    @Override
    public ITypes operate() {
        return this.getLeftChild().operate().or(this.getRightChild().operate());
    }
}
