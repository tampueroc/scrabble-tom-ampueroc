package cl.uchile.dcc.scrabble.AST.operands.numerical;

import cl.uchile.dcc.scrabble.AST.twoNodes;
import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.types.ITypes;

public class ASTadd extends twoNodes {

    public ASTadd(INodes leftChild, INodes rightChild) {
        super(leftChild, rightChild);
    }

    @Override
    public ITypes operate() {
        return this.getLeftChild().operate().add(this.getRightChild().operate());
    }
}