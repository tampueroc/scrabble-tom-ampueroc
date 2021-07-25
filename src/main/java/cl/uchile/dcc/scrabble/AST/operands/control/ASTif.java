package cl.uchile.dcc.scrabble.AST.operands.control;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.AST.twoNodes;
import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.visitor.compareVisitor;


public class ASTif extends twoNodes implements IControl {
    public ASTif(INodes leftChild, INodes rightChild) {
        super(leftChild, rightChild);
    }

    @Override
    public ITypes operate() {
        return null;
    }

    @Override
    public void accept(compareVisitor visitor) {
        visitor.visitASTif(this.getLeftChild(), this.getRightChild());
    }
}
