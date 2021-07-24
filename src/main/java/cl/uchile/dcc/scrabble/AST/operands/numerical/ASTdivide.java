package cl.uchile.dcc.scrabble.AST.operands.numerical;

import cl.uchile.dcc.scrabble.AST.twoNodes;
import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.fluxControl.IVisitorIf;
import cl.uchile.dcc.scrabble.fluxControl.IVisitorWhile;
import cl.uchile.dcc.scrabble.types.ITypes;

public class ASTdivide extends twoNodes {
    /**
     * Creates an Operand Divide Node that establishes the division operation between it's left and right children.
     */
    public ASTdivide(INodes leftChild, INodes rightChild) {
        super(leftChild, rightChild);
    }
    /**
     * Evaluates this Node to returns it's Scrabble Type operation result by summoning the Scrabble Operation divide
     */
    @Override
    public ITypes operate() {
        return this.getLeftChild().operate().divide(this.getRightChild().operate());
    }
}
